# COMP 311 — Programming in Java

BIUST — Department of Computing and Informatics
Instructor: Ontiretse Bagwasi

Lab exercises for COMP 311, covering Java fundamentals: syntax and data types,
conditionals, strings, file I/O, loops, arrays, and classes/objects.

## Repository Structure

```
.
├── Lab1/     # Getting Started with Java
├── Lab2/     # Conditionals, Strings & File I/O
├── Lab3/     # Iteration (while, do-while, for)
├── Lab4/     # Arrays, Binary Conversion & Palindromes
├── Lab5/     # Classes and Objects
├── Lab6/     # (add details)
└── Lab7/     # (add details)
```

Each lab folder contains one `.java` file per question (e.g. `Question1.java`,
`Question2.java`, ...), plus any shared data files the programs read from or
write to (e.g. `students.txt`, `numbers.txt`).

## How to Compile and Run

All files for a given lab must sit in the same folder — including any `.txt`
data files, since the programs look for them relative to where they're run.

**Command line:**
```bash
cd Lab2                      # move into the lab folder
javac *.java                 # compile every .java file in the folder
java Question3                # run a specific question (no .java extension)
```

**VS Code:**
Open the folder for the lab, open the question file you want to test, and
click the **Run** button above its `main` method.

> Note: files like `Book.java`, `Student.java`, and `Library.java` (Lab 5)
> have no `main` method of their own — they're classes used *by* the
> `QuestionN.java` programs, not run directly.

---

## Lab 1 — Getting Started with Java

*(Add details here: setup, first program, basic syntax questions.)*

---

## Lab 2 — Conditionals, Strings & File I/O

10 questions covering `if`/`else if`/`else` chains, String methods, reading
and writing text files with `FileReader`/`Scanner`/`PrintWriter`, and
`switch` statements. Input is validated throughout — out-of-range or
non-numeric entries are rejected with a message and re-prompted rather than
silently accepted.

| File | Covers |
|---|---|
| `Question1.java` | Grading a score (0–100) with if/else if/else |
| `Question2.java` | String length, case conversion, `startsWith` |
| `Question3.java` | Reading student records from `students.txt` |
| `Question4.java` | Writing 5 student records to `results.txt` |
| `Question5.java` | Combining read + grade + write → `grades.txt` |
| `Question6.java` | Day-of-week lookup with `switch` |
| `Question7.java` | Smallest/largest/average from `numbers.txt` → `stats.txt` |
| `Question8.java` | Counting evens/odds in `numbers.txt` → `evenodd.txt` |
| `Question9.java` | Summing positives/negatives → `signs.txt` |
| `Question10.java` | Searching `numbers.txt` for a target value |
| `students.txt` | Sample data for Q3/Q5 (Name,Score per line) |
| `numbers.txt` | 1000 integers, one per line, used by Q7–Q10 |

---

## Lab 3 — Iteration

9 questions, grouped by loop type as the lab specifies.

| File | Loop type | Covers |
|---|---|---|
| `Question1.java` | `while` | Countdown from 10 to "Liftoff!" |
| `Question2.java` | `while` | Sum of 1 to N |
| `Question3.java` | `while` | Even numbers 1–50 |
| `Question4.java` | `do-while` | Repeating menu until exit |
| `Question5.java` | `do-while` | Validate input is 1–10 |
| `Question6.java` | `do-while` | Running total, stops on 0 |
| `Question7.java` | `for` | Multiplication table |
| `Question8.java` | `for` | Counting vowels |
| `Question9.java` | `for` | Factorial |

---

## Lab 4 — Arrays, Binary Conversion & Palindromes

5 questions covering arrays, manual decimal-to-binary conversion, and a
two-pointer palindrome check.

| File | Covers |
|---|---|
| `Question1.java` | Reading words from `names.txt` into a `String[20]` array |
| `Question2.java` | Writing a `double[]` array to a file, one value per line |
| `Question3.java` | Sum/smallest/largest of an `int[]` array → file |
| `Question4.java` | Decimal → binary via repeated `% 2` / `/ 2` |
| `Question5.java` | Palindrome check (case-insensitive, two-pointer) |
| `names.txt` | Sample word list for Q1 |

---

## Lab 5 — Classes and Objects

10 questions building up a small class hierarchy: `Book`, `Student`, and
`Library`.

| File | Covers |
|---|---|
| `Book.java` | Fields, constructor (`this`), `getSummary()`, encapsulation (Q1, 2, 4, 5) |
| `Question3.java` | Creating two `Book` objects, printing their fields |
| `Question4.java` | Using `getSummary()` |
| `Question6.java` | Array of 3 `Book` objects, printed in a loop |
| `Student.java` | A second class: private fields, constructor, getters (Q7) |
| `Question8.java` | `cheaperBook(Book a, Book b)` comparison method |
| `Library.java` | `ArrayList<Book>` field, `addBook()`, `printAllBooks()` (Q9) |
| `Question10.java` | Library + Book combined — add 4 books, print all |

> `Question1`, `Question2`, and `Question5` of this lab modify `Book.java`
> directly rather than being separate programs — Java requires a public
> class's filename to match its class name, so all three stages live in the
> one file. Snapshots of each stage are available in the `Question1/`,
> `Question2/`, and `Question5/` subfolders if you need to show the class's
> progression separately.

---

## Lab 6 — *(add details)*

*(Add a table like the ones above once this lab's files are included.)*

---

## Lab 7 — *(add details)*

*(Add a table like the ones above once this lab's files are included.)*
