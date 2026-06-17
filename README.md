# Password Security Analyzer

A Java command-line tool that analyzes password strength and 
checks against 10,000 commonly breached passwords.

Built as my first real project while learning Java and 
exploring cybersecurity concepts.

---

## Features

- Scores password strength out of 10 based on length, 
  uppercase, lowercase, digits and special characters
- Checks password against a list of 10,000 most commonly 
  breached passwords using HashSet for O(1) lookup
- Logs every check to a file with timestamp, score, strength 
  label and breach status — never the password itself

---

## How to run

1. Clone this repository
2. Download the common passwords list from
   danielmiessler/SecLists on GitHub
3. Update the file path in `PasswordBreach.java` to your 
   password list location
4. Update the file path in `Storeimf.java` to where you 
   want logs saved
5. Run `Main.java`

---

## Project structure

| File | Responsibility |
|------|---------------|
| `Main.java` | Menu loop and program flow |
| `PasswordStructure.java` | Strength scoring |
| `PasswordBreach.java` | Breach detection |
| `Storeimf.java` | Timestamped file logging |

---

## Key decisions

**HashSet over ArrayList** — breach detection only needs 
lookup, never index access. HashSet gives O(1) search 
across 10,000 entries compared to ArrayList's O(n).

**Never log the password** — only metadata is stored. 
Logging actual passwords would itself be a security 
vulnerability.

---

## Built with

Java standard library — no external dependencies.

---

*First year CSAI student at GL Bajaj Institute. 
Building toward cybersecurity one project at a time.*