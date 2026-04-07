# 📦 Inventory Management System

A simple console-based Java application to manage product inventory. Add products, view stock, search items, and record sales — all from the terminal.

---

## 🚀 Features

| Feature | Status |
|---|---|
| Add products with quantity | ✅ Done |
| View current stock | ✅ Done |
| Reduce stock (sale) | 🔧 In Progress |
| Search product by name | 🔧 In Progress |

---

## 🛠️ Tech Stack

- **Language:** Java (JDK 8+)
- **Type:** Console / Terminal Application
- **Input:** `Scanner` (stdin)

---

## 📂 Project Structure

```
Inventory/
│
└── Inventory.java      # Main file containing all logic
```

---

## ▶️ How to Run

### Prerequisites
- Java JDK 8 or higher installed
- Terminal / Command Prompt

### Steps

**1. Clone the repository**
```bash
git clone https://github.com/Kanhaiya209/inventory-management.git
cd inventory-management
```

**2. Compile**
```bash
javac Inventory.java
```

**3. Run**
```bash
java Inventory
```

---

## 💻 Usage

On launch, enter the number of products you want to manage. A menu then appears in a loop:

```
Enter How Many Products to be added: 3

1. View Stock
2. Add Stock
3. Reduce Stock (Sale)
4. Search Product
5. Exit
```

### Typical flow
1. Select **2 → Add Stock** to enter product names and quantities.
2. Select **1 → View Stock** to display the inventory list.
3. Select **5** to exit.

---

## ⚠️ Known Bugs

- **Off-by-one in `viewStock()`** — loop starts at index `1` instead of `0`, skipping the first product and throwing `ArrayIndexOutOfBoundsException` on the last entry.
- **Scanner newline issue** — `sc.nextInt()` leaves a newline in the buffer, causing `sc.nextLine()` for product names to be skipped. Fix: add `sc.nextLine()` after each `nextInt()` call.
- **Fixed array size** — product count is set once at startup and cannot be changed later.

---

## 🔮 Planned Improvements

- [ ] Fix off-by-one bug in `viewStock()`
- [ ] Fix `Scanner` newline flushing issue
- [ ] Implement `searchStock()` by product name
- [ ] Implement `reduceStock()` for recording sales
- [ ] Switch from arrays to `ArrayList` for dynamic resizing
- [ ] Add input validation to prevent crashes on bad input

---

## 👨‍💻 Author

**Kanhaiya** — [@Kanhaiya209](https://github.com/Kanhaiya209)
BCA (H/R), Batch 2024–28

---

## 📄 License

This project is open source and available under the [MIT License](LICENSE).
