
---

### 🔍 What `Arrays.copyOfRange()` Does

```java
String[] copyTo = java.util.Arrays.copyOfRange(copyFrom, 2, 9);
```

- ✅ **Purpose**: Copies a portion of one array into a **new array**.
- 📌 **`copyFrom`**: The original array you're copying from.
- 🟢 **`2`**: Start index (**inclusive**).
- 🔴 **`9`**: End index (**exclusive**).

This means the method will copy elements from index `2` to `8` — a total of **7 elements**.

---

### 🧠 Example

```java
String[] copyFrom = {
    "Affogato", "Americano", "Cappuccino", "Corretto",
    "Cortado", "Doppio", "Espresso", "Frappucino",
    "Freddo", "Lungo", "Macchiato"
};

String[] copyTo = java.util.Arrays.copyOfRange(copyFrom, 2, 9);
System.out.println(Arrays.toString(copyTo));
```

🖨️ Output:
```
[Cappuccino, Corretto, Cortado, Doppio, Espresso, Frappucino, Freddo]
```

---

### ✅ Why Use It?

- Cleaner than manual loops
- Automatically creates and returns the new array
- Eliminates boilerplate code

Absolutely! Let’s compare `Arrays.copyOfRange()` and `System.arraycopy()` — two handy ways to copy arrays in Java:

---

### ⚔️ `Arrays.copyOfRange()` vs. `System.arraycopy()` in Java

| Feature                         | `Arrays.copyOfRange()`                            | `System.arraycopy()`                                |
|----------------------------------|----------------------------------------------------|------------------------------------------------------|
| 📦 **Belongs to**              | `java.util.Arrays` utility class                  | `java.lang.System` class                            |
| 🆕 **Creates destination array?** | ✅ Yes — returns a **new array**                   | ❌ No — you must **create destination array manually** |
| 📐 **Length flexibility**        | Copies a range with start (inclusive) and end (exclusive) | You specify exact number of elements to copy         |
| 🧾 **Syntax simplicity**        | Clean and concise                                 | More verbose                                         |
| 🚀 **Performance**              | Slightly less efficient for large arrays          | More optimized (especially for primitive arrays)     |
| 🔍 **Common Use Case**          | Grab a slice and get a fresh array                | High-performance, in-place array copy                |

---

### 🧪 Example: `Arrays.copyOfRange()`

```java
String[] original = { "A", "B", "C", "D", "E", "F" };
String[] slice = Arrays.copyOfRange(original, 1, 4); // Copies B, C, D

System.out.println(Arrays.toString(slice));
// Output: [B, C, D]
```

🔹 You didn’t need to declare or size the new array — that’s a win for convenience!

---

### ⚙️ Example: `System.arraycopy()`

```java
String[] original = { "A", "B", "C", "D", "E", "F" };
String[] slice = new String[3]; // Must be created first

System.arraycopy(original, 1, slice, 0, 3); // Copies B, C, D

System.out.println(Arrays.toString(slice));
// Output: [B, C, D]
```

🔹 Best choice if you’re copying **within the same array**, or **into an existing one**.

---

### 🤔 So when should you use which?

- 👉 Use **`Arrays.copyOfRange()`** when:
  - You want a quick slice
  - You don’t want to preallocate destination
  - You care more about clarity than raw speed

- 👉 Use **`System.arraycopy()`** when:
  - You need **performance**
  - You’re copying between **existing arrays**
  - You want to copy part of an array **into itself**

---
Awesome! Let’s explore how you can copy arrays using **Java Streams**, and then compare that with `Arrays.copyOfRange()` and `System.arraycopy()` — especially in terms of readability, flexibility, and performance.

---

### 🌊 Copying Arrays with Java Streams

Java Streams offer a modern, functional-style way to manipulate arrays. Here's how you can copy a portion of an array using streams:

#### ✅ Example: Copy a range using streams
```java
String[] original = {
    "Affogato", "Americano", "Cappuccino", "Corretto",
    "Cortado", "Doppio", "Espresso", "Frappucino",
    "Freddo", "Lungo", "Macchiato"
};

String[] copy = IntStream.range(2, 9)
    .mapToObj(i -> original[i])
    .toArray(String[]::new);

System.out.println(Arrays.toString(copy));
```

🖨️ Output:
```
[Cappuccino, Corretto, Cortado, Doppio, Espresso, Frappucino, Freddo]
```

---

### ⚖️ Comparison Table

| Feature                        | `Arrays.copyOfRange()`                     | `System.arraycopy()`                          | `Streams`                                      |
|-------------------------------|--------------------------------------------|-----------------------------------------------|------------------------------------------------|
| 🧠 **Ease of Use**            | Very simple                                | Requires manual setup                         | More verbose but expressive                    |
| 🆕 **Creates new array?**     | ✅ Yes                                     | ❌ No (you must create it)                     | ✅ Yes                                          |
| 🎯 **Control over range**     | Start & end index                          | Start index, length, and destination index     | Full control via `IntStream.range()`           |
| 🚀 **Performance**            | Good for most cases                        | Best for large arrays (native, fast)          | Slower for large arrays (overhead from streams)|
| 🧪 **Custom logic**           | ❌ Not supported                            | ❌ Not supported                               | ✅ You can filter, map, etc.                    |
| 🧾 **Readability**            | Clean and concise                          | Verbose                                        | Functional and expressive                      |

---

### 🧠 When to Use What?

- Use **`System.arraycopy()`** for **maximum performance**, especially with large primitive arrays.
- Use **`Arrays.copyOfRange()`** for **quick slicing** with minimal code.
- Use **Streams** when you want to **transform, filter, or process** elements while copying.

---
The `Arrays.copyOf()` method in Java is a convenient way to copy an array into a new one — either partially or completely — while resizing it as needed. It's part of the `java.util.Arrays` class and is especially useful when you want to extend or truncate an existing array.

---

### 🧪 Syntax

```java
T[] Arrays.copyOf(T[] original, int newLength)
```

- `original`: the array to copy from
- `newLength`: length of the new array

If `newLength` is **less than** the original array length, it's truncated.  
If it's **greater**, the new extra elements are filled with default values (`null`, `0`, `false`, etc.).

---

### 📋 Example

```java
String[] original = { "Java", "Python", "C++", "JavaScript" };
String[] copy = Arrays.copyOf(original, 6);

System.out.println(Arrays.toString(copy));
```

🖨️ Output:
```
[Java, Python, C++, JavaScript, null, null]
```

---

### 🆚 `copyOf()` vs. `copyOfRange()`

| Method               | Purpose                             | Flexible Start Index |
|---------------------|--------------------------------------|----------------------|
| `copyOf()`          | Copy and resize entire array         | ❌ No — starts at index 0 |
| `copyOfRange()`     | Copy a **slice** of array            | ✅ Yes — you choose start & end |

---

### ⚡Use Cases

- Resize arrays in dynamic operations
- Create backups before modifying original data
- Truncate arrays cleanly