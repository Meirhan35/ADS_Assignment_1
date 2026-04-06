# Banking System (Assignment #2)

* **Name:** Abilda Meiirkhan
* **Group:** IT-2503


This project implements a **Banking System** using **logical and physical data structures** in Java.

The system demonstrates:

* LinkedList for account storage
* Stack for transaction history (LIFO)
* Queue for bill payments and account requests (FIFO)
* Array for fixed-size storage

*BankAccount class – Stores account details such as account number, username, and balance.

<img width="1470" height="956" alt="Screenshot 2026-04-06 at 13 15 44" src="https://github.com/user-attachments/assets/a4c4a547-0a71-4375-8c88-cd1c229da137" />
<img width="1470" height="956" alt="Screenshot 2026-04-06 at 13 15 56" src="https://github.com/user-attachments/assets/8569c330-e689-49dc-8a5a-fdeab00a7a56" />
<img width="1470" height="956" alt="Screenshot 2026-04-06 at 13 16 08" src="https://github.com/user-attachments/assets/da77fb33-fe98-4ca4-b250-effe6e376583" />


*Deposit & Withdraw Operations - allows users to deposit, withdraw and updates balance inside LinledList.

<img width="1470" height="956" alt="Screenshot 2026-04-06 at 13 30 44" src="https://github.com/user-attachments/assets/d0ab6e94-0b70-4119-9a7c-9377ef53d9be" />
<img width="1470" height="956" alt="Screenshot 2026-04-06 at 13 30 48" src="https://github.com/user-attachments/assets/a0325fff-985b-4581-abf4-99362c66107a" />
<img width="1470" height="956" alt="Screenshot 2026-04-06 at 13 30 50" src="https://github.com/user-attachments/assets/bad9c759-e549-4067-a2d8-74314ee854c7" />
<img width="1470" height="956" alt="Screenshot 2026-04-06 at 13 30 54" src="https://github.com/user-attachments/assets/23a95a64-9796-4344-833d-e2413c5395e0" />

* Transaction History (Stack – LIFO) - store actions like deposit, withdraw and bill payment in the stack allowing to see last transactions.
<img width="1470" height="956" alt="Screenshot 2026-04-06 at 13 59 55" src="https://github.com/user-attachments/assets/c7ae2a53-d6ab-43bb-99a7-8c736bb91e2d" />
<img width="1470" height="956" alt="Screenshot 2026-04-06 at 14 00 01" src="https://github.com/user-attachments/assets/051f987b-b7ed-4616-97d2-598cb3ee7bf9" />
<img width="1470" height="956" alt="Screenshot 2026-04-06 at 14 00 05" src="https://github.com/user-attachments/assets/63037af7-d33f-4133-a61f-0ea682a7944a" />
<img width="1470" height="956" alt="Screenshot 2026-04-06 at 14 00 08" src="https://github.com/user-attachments/assets/a92c8ac1-f95b-44a1-8f85-dad48e177096" />
<img width="1470" height="956" alt="Screenshot 2026-04-06 at 14 00 19" src="https://github.com/user-attachments/assets/d24abf7c-5b88-432c-a017-24cb66c764fe" />

*Bill Payment Queue (Queue – FIFO) - users can add bill payment request and process them.

<img width="1470" height="956" alt="Screenshot 2026-04-06 at 14 55 45" src="https://github.com/user-attachments/assets/09c1de4c-b652-419c-8cf7-d70fbf3ce32d" />
<img width="1470" height="956" alt="Screenshot 2026-04-06 at 14 55 50" src="https://github.com/user-attachments/assets/fb6b169b-2761-4a97-8655-4a7f740f5539" />
<img width="1470" height="956" alt="Screenshot 2026-04-06 at 14 56 06" src="https://github.com/user-attachments/assets/62bcbece-50a8-4fd7-8bc4-3a6ad4aa798b" />
<img width="1470" height="956" alt="Screenshot 2026-04-06 at 14 56 16" src="https://github.com/user-attachments/assets/7cb8b19f-ceaa-40b5-9703-628d0e1d36bb" />
<img width="1470" height="956" alt="Screenshot 2026-04-06 at 14 56 19" src="https://github.com/user-attachments/assets/b2948578-af04-418d-8b71-b8624e5c00d0" />
<img width="1470" height="956" alt="Screenshot 2026-04-06 at 14 56 24" src="https://github.com/user-attachments/assets/453b6183-4944-4dd1-9bb7-80faf0fa48ee" />

*Account Opening Queue (Admin Simulation) - simulates admin and admin can process the request.

<img width="1470" height="956" alt="Screenshot 2026-04-06 at 15 33 10" src="https://github.com/user-attachments/assets/93ec5fd7-b140-4b0d-a203-8b22322a2659" />
<img width="1470" height="956" alt="Screenshot 2026-04-06 at 15 33 39" src="https://github.com/user-attachments/assets/f400d4c1-7fb5-48e0-a9b9-080ee60d73e2" />
<img width="1470" height="956" alt="Screenshot 2026-04-06 at 15 33 49" src="https://github.com/user-attachments/assets/c43cee92-648b-450b-bd80-dc185efd7546" />
<img width="1470" height="956" alt="Screenshot 2026-04-06 at 15 33 54" src="https://github.com/user-attachments/assets/5842a6f0-1ac5-439a-8a4d-8883b16fca52" />
<img width="1470" height="956" alt="Screenshot 2026-04-06 at 15 34 01" src="https://github.com/user-attachments/assets/74643d91-3ffa-44eb-a302-d98208a9a1e2" />
<img width="1470" height="956" alt="Screenshot 2026-04-06 at 15 34 09" src="https://github.com/user-attachments/assets/12681f33-3a5c-4301-8495-655735029606" />

*Creates array BankAccount[3] , stores 3 predefined accounts, prints them
<img width="1470" height="956" alt="Screenshot 2026-04-06 at 15 45 30" src="https://github.com/user-attachments/assets/652def4c-f26f-4886-8a9a-bc07bb1a7769" />
<img width="1470" height="956" alt="Screenshot 2026-04-06 at 15 45 54" src="https://github.com/user-attachments/assets/cf737c43-2769-4c1b-83de-f90e1da322ec" />

*Mini Banking Menu - creates Mini Menu that allows users and admins request and process.

<img width="1470" height="956" alt="Screenshot 2026-04-06 at 17 33 18" src="https://github.com/user-attachments/assets/38414d5a-132d-42cf-a938-dc99a2bbc4de" />
<img width="1470" height="956" alt="Screenshot 2026-04-06 at 17 33 27" src="https://github.com/user-attachments/assets/e8944bd8-b449-4e74-b7c7-715395506782" />
<img width="1470" height="956" alt="Screenshot 2026-04-06 at 17 33 32" src="https://github.com/user-attachments/assets/12d43004-dd08-437a-bf49-c2428ad2f47d" />
<img width="1470" height="956" alt="Screenshot 2026-04-06 at 17 33 34" src="https://github.com/user-attachments/assets/d79e7de6-4819-4d6f-b8e1-63da97338f4a" />
<img width="1470" height="956" alt="Screenshot 2026-04-06 at 17 33 40" src="https://github.com/user-attachments/assets/f00d2ef4-aba1-44ca-abc5-eab6a3476879" />

