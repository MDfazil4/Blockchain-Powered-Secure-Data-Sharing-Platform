#!/usr/bin/env bash

# Generate documentation using doxygen and check for errors
echo '[git hook] Checking for missing documentation'

BUILDFOLDER=build-docs
# Tell doxygen to treat warning as errors
# -S refers to the folder with the source files and -B to the build folder
cmake -S . -B ${BUILDFOLDER} -DDOXYGEN_WARN_AS_ERROR=YES
# build the documentation
cmake --build ${BUILDFOLDER} --target docs
result=$?

rm -rf ${BUILDFOLDER}
exit $result