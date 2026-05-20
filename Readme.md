# 📦 Inventory Management System

A simple console-based Java application for managing product inventory. Users can add products, view available stock, search products, and reduce stock when sales occur.

---

## 🚀 Features

| Feature | Status |
|----------|----------|
| Add Products | ✅ Completed |
| View Stock | ✅ Completed |
| Search Product by Name | ✅ Completed |
| Reduce Stock (Sale) | ✅ Completed |
| Inventory Full Check | ✅ Completed |
| Product Not Found Handling | ✅ Completed |

---

## 🛠️ Tech Stack

- Language: Java
- JDK Version: 8+
- Type: Console-Based Application
- Input Handling: Scanner Class

---

## 📂 Project Structure

```text
Inventory/
│
└── Inventory.java
```

---

## ▶️ How to Run

### 1. Clone Repository

```bash
git clone https://github.com/kanhaiya209/inventory-system.git
cd inventory-system
```

### 2. Compile Program

```bash
javac Inventory.java
```

### 3. Run Program

```bash
java Inventory
```

---

## 💻 Menu Options

```text
===== Inventory Menu =====

1. View Stock
2. Add Stock
3. Reduce Stock
4. Search Product
5. Exit
```

### Add Product

```text
Enter Product Name: Rice
Enter Quantity: 50
Product Added Successfully.
```

### View Stock

```text
----- Inventory Stock -----

1. Product: Rice | Quantity: 50
2. Product: Sugar | Quantity: 30
```

### Search Product

```text
Enter Product Name to Search: Rice

Product Found
Product Name : Rice
Quantity     : 50
```

### Reduce Stock

```text
Enter Product Name to Reduce: Rice
Enter Quantity to Reduce: 10

Stock Reduced Successfully.
Remaining Quantity: 40
```

---

## ⚙️ Current Limitations

- Uses fixed-size arrays for storing products.
- Maximum inventory size is decided when the program starts.
- Data is not saved permanently after program exit.

---

## 🔮 Future Improvements

- [ ] Replace arrays with ArrayList
- [ ] Add Update Product feature
- [ ] Add Delete Product feature
- [ ] Store data in a file/database
- [ ] Add Low Stock Alert
- [ ] Generate Inventory Reports
- [ ] Build GUI using Java Swing/JavaFX

---

## 📚 Concepts Used

- Arrays
- Loops
- Methods
- Conditional Statements
- Linear Search
- Scanner Class
- Java Basics

---

## 👨‍💻 Author

Kanhaiya

GitHub: https://github.com/kanhaiya209

BCA (H/R) | Batch 2024–2028

---

## 📄 License

This project is open-source and available under the MIT License.