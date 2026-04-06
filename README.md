# Banking System (Assignment #2)

* **Name:** Abilda Meiirkhan
* **Group:** IT-2503


This project implements a **Banking System** using **logical and physical data structures** in Java.

The system demonstrates:

* LinkedList for account storage
* Stack for transaction history (LIFO)
* Queue for bill payments and account requests (FIFO)
* Array for fixed-size storage

---

## ⚙️ Features

### 🔹 Part 1: Logical Data Structures

#### ✅ Task 1: Bank Account Storage (LinkedList)

* Add new account
* Display all accounts
* Search by username

📸 Screenshot:
![Task 1](screenshots/task1.png)

---

#### 💰 Task 2: Deposit & Withdraw

* Deposit money
* Withdraw money
* Update balance

📸 Screenshot:
![Task 2](screenshots/task2.png)

---

#### 🔄 Task 3: Transaction History (Stack)

* Add transactions
* Undo last transaction (pop)
* View last transaction (peek)

📸 Screenshot:
![Task 3](screenshots/task3.png)

---

#### 📄 Task 4: Bill Payment Queue (Queue)

* Add bill request
* Process next bill
* Display queue

📸 Screenshot:
![Task 4](screenshots/task4.png)

---

#### 🧾 Task 5: Account Opening Queue

* Submit account request
* Admin processes requests
* Move to main account list

📸 Screenshot:
![Task 5](screenshots/task5.png)

---

### 🔹 Part 2: Physical Data Structures

#### 📦 Task 6: Array Storage

* Store 3 predefined accounts
* Display accounts

📸 Screenshot:
![Task 6](screenshots/task6.png)

---

### 🔹 Part 3: Mini Banking Menu

#### 🏦 Bank Menu

* Submit account request
* Deposit
* Withdraw

#### 🏧 ATM Menu

* Balance enquiry
* Withdraw

#### 👨‍💼 Admin Menu

* Process account queue
* View bill queue

📸 Screenshot:
![Menu](screenshots/menu.png)

---

## 🚀 How to Run

1. Open project in **IntelliJ IDEA**
2. Run `Main.java`
3. Use menu to interact with system

---

## 🧠 Data Structures Used

* **LinkedList** → Dynamic account storage
* **Stack** → Transaction history (LIFO)
* **Queue** → Requests & bill payments (FIFO)
* **Array** → Fixed-size storage

---

## 📝 Work Process Summary

In this project, I implemented a banking system step by step:

* First, I created the `BankAccount` class
* Then I used LinkedList to manage accounts
* After that, I added Stack for transaction history
* Queue was used to simulate real-life banking processes
* Finally, I combined everything into a menu-driven system

### ⚠️ Challenges

* Managing multiple data structures together
* Updating balances correctly
* Handling user input

### ✅ Solutions

* Used clear methods for each operation
* Tested each task separately before integration

---

## 📂 Project Structure

```
/src
  ├── Main.java
  ├── BankAccount.java
  ├── BankSystem.java
/screenshots
  ├── task1.png
  ├── task2.png
  ├── ...
```

---

## 📎 Notes

* All screenshots must be placed in the **/screenshots folder**
* Make sure your program runs without errors before submission

---

⭐ **Good luck with your defense!**
