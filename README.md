📦 Inventory Management System (Java)

A simple console-based Inventory Management System built using Java.
This project allows users to manage product stock by adding, viewing, and searching items.

🚀 Features
➕ Add new products with quantity
📋 View all available stock
🔍 Search for a product (to be implemented)
➖ Reduce stock (sale) (planned feature)
🔄 Menu-driven interface for easy interaction
🛠️ Technologies Used
Java (Core Java)
Arrays
Scanner class for input handling
📂 Project Structure
Inventory.java
▶️ How to Run
Clone the repository:
git clone https://github.com/your-username/inventory-system.git
Navigate to the folder:
cd inventory-system
Compile the program:
javac Inventory.java
Run the program:
java Inventory
🧠 How It Works
User enters the number of products.
System initializes arrays for:
Product names
Quantities
Menu options allow interaction:
View stock
Add stock
Search products
Exit
⚠️ Current Limitations
❌ Search functionality is not implemented yet
❌ Reduce stock (sale) feature is missing
⚠️ Indexing issue in viewStock() (starts from 1 instead of 0)
⚠️ Input buffer issue (mixing nextInt() and nextLine())
🔧 Future Improvements
Implement search functionality
Add stock reduction (sales system)
Use ArrayList instead of arrays for flexibility
Add validation for user inputs
Improve UI/UX (better formatting)
🧩 Sample Menu
1. View Stock
2. Add Stock
3. Reduce Stock (Sale)
4. Search Product
5. Exit
💡 Learning Purpose

This project is great for beginners to understand:

Arrays in Java
Loops and condition handling
Menu-driven programs
Basic inventory logic
🙌 Contributing

Feel free to fork this repo and improve it! Suggestions and improvements are always welcome.
