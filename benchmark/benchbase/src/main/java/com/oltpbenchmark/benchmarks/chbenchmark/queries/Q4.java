/*
 * Copyright 2020 by OLTPBenchmark Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 */

package com.oltpbenchmark.benchmarks.chbenchmark.queries;

import com.oltpbenchmark.api.SQLStmt;

public class Q4 extends GenericQuery {

    public final SQLStmt query_stmt = new SQLStmt(
            "SELECT o_ol_cnt, "
                    + "count(*) AS order_count "
                    + "FROM oorder "
                    + "WHERE exists "
                    + "(SELECT * "
                    + "FROM order_line "
                    + "WHERE o_id = ol_o_id "
                    + "AND o_w_id = ol_w_id "
                    + "AND o_d_id = ol_d_id "
                    + "AND ol_delivery_d >= o_entry_d) "
                    + "GROUP BY o_ol_cnt "
                    + "ORDER BY o_ol_cnt"
    );

    protected SQLStmt get_query() {
        return query_stmt;
    }
}
