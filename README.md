
# **Blockchain-Powered Secure Data Sharing Platform**

## **Project Overview**

This project is a decentralized application (DApp) designed for secure data sharing using blockchain technology. The platform ensures data integrity and confidentiality by leveraging Ethereum and InterPlanetary File System (IPFS). Smart contracts are utilized to automate access control, allowing only authorized users to access specific data. The decentralized nature of the application ensures security, transparency, and reliability in data sharing without relying on a centralized authority.

---

## **Features**

- **Decentralized Architecture:** Ensures no central authority controls data access, providing enhanced security and privacy.
- **Smart Contracts:** Automates access control, allowing only authorized users to retrieve specific data.
- **Data Integrity and Confidentiality:** Ensures data integrity through the use of Ethereum’s blockchain and decentralized storage on IPFS.
- **Enhanced Security:** Reduces the risk of unauthorized access by leveraging blockchain’s immutability and cryptographic features.

---

## **Technologies Used**

- **Blockchain Platform:** Ethereum
- **Smart Contracts:** Solidity
- **Storage:** IPFS (InterPlanetary File System) for decentralized file storage
- **Development Environment:** Truffle or Hardhat (for compiling, deploying, and testing smart contracts)
- **Wallets:** MetaMask (for interacting with the blockchain)

---

## **Project Setup**

1. **Clone the repository:**

   ```bash
   git clone https://github.com/md_fazil/blockchain-data-sharing.git
   cd blockchain-data-sharing
   ```

2. **Install Dependencies:**

   ```bash
   npm install
   ```

3. **Compile and Deploy Smart Contracts:**

   Using Truffle:

   ```bash
   truffle compile
   truffle migrate
   ```

   Using Hardhat:

   ```bash
   npx hardhat compile
   npx hardhat run scripts/deploy.js
   ```

4. **IPFS Setup:**
   - Set up IPFS locally or connect to an IPFS node.
   - Upload data to IPFS and get the corresponding file hash for access through the DApp.

5. **Run the DApp:**

   ```bash
   npm run dev
   ```

---

## **Usage**

- **Access Control with Smart Contracts:**
  - The DApp uses smart contracts deployed on Ethereum to manage access control.
  - Users need to connect their Ethereum wallets (MetaMask) to interact with the application.
  - Only authorized users with access granted by the smart contract can retrieve data from IPFS.

- **Data Storage with IPFS:**
  - Files are uploaded and stored on IPFS, with the file hash stored on the Ethereum blockchain for integrity verification.
  - Users can fetch data using the unique file hash if they have the required permissions.

---

## **Achievements**

- **Smart Contract Automation:** Implemented smart contracts that automate data access control, removing the need for manual permission management.
- **Security Enhancements:** Ensured that sensitive data is securely shared by reducing the risk of unauthorized access and ensuring data integrity through blockchain’s immutability.
- **Decentralized Storage:** Used IPFS to store data, ensuring no single point of failure and reducing reliance on centralized servers.

