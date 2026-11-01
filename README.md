🤖 AI Lab – Artificial Intelligence Programs in Java

Welcome to AI Lab, a collection of Artificial Intelligence practical programs implemented using Java. This repository contains implementations of fundamental AI concepts, problem-solving techniques, search algorithms, and intelligent agents.

The main objective of this repository is to understand how Artificial Intelligence techniques can be applied to solve real-world and mathematical problems through programming.

📌 Table of Contents
About the Project
Programs Included
Technologies Used
Project Structure
Getting Started
How to Run
AI Concepts Covered
Learning Objectives
Future Improvements
Author
📖 About the Project

This repository contains Java implementations of various Artificial Intelligence laboratory experiments.

Each program demonstrates a particular AI concept, such as:

Search algorithms and state-space exploration.
Heuristic-based problem solving.
Backtracking and constraint satisfaction.
Intelligent agents and decision-making.
Recursive problem-solving techniques.
Interactive programs using user input.

These programs are designed for students and beginners who want to understand the fundamentals of Artificial Intelligence through practical implementation.

🧪 Programs Included
Sr. No.	Program	Description	AI Concept
1	ChatBot.java	A simple rule-based chatbot that responds to user messages.	Rule-Based System
2	DFS.java	Solves the Water Jug Problem using Depth First Search.	Uninformed Search
3	EightPuzzle.java	Solves the 8-Puzzle problem using Manhattan Distance as a heuristic.	Heuristic Search
4	EightQueens.java	Places eight queens on a chessboard without attacking each other.	Backtracking
5	NumberGuess.java	Implements an agent that guesses a user's number using feedback.	Binary Search / Intelligent Agent
6	SudokuSolver.java	Solves a Sudoku puzzle using recursive backtracking.	Constraint Satisfaction
7	TowerOfHanoi.java	Generates the solution to the Tower of Hanoi problem.	Recursion
8	VaccumCleaner.java	Simulates a vacuum cleaner agent that cleans two rooms.	Simple Reflex Agent
1. ChatBot

A simple rule-based chatbot that interacts with users through the command line.

Features:

Responds to greetings such as Hello and Hi.
Answers basic questions about its name.
Responds to help requests.
Terminates when the user enters Bye.

2. Water Jug Problem using DFS

Implements Depth First Search to solve the classic Water Jug Problem using two jugs with capacities of 4 litres and 3 litres.

Objective: Measure exactly 2 litres of water in the 4-litre jug.

Concepts:

State-space representation.
Depth First Search.
Visited-state tracking.
State transitions.

3. Eight Puzzle Problem

Implements a heuristic-based approach to solve the 8-Puzzle problem.

Features:

Uses a 3 × 3 puzzle board.
Represents the empty position using 0.
Calculates Manhattan Distance.
Selects a neighboring state based on its heuristic value.

Concept: Heuristic Search.

Note: The current implementation is a greedy heuristic approach, not a complete A* search algorithm.

4. Eight Queens Problem

Solves the Eight Queens Problem by placing eight queens on an 8 × 8 chessboard.

Rules:

No two queens can occupy the same row.
No two queens can occupy the same column.
No two queens can attack each other diagonally.

Concept: Recursive Backtracking.

5. Number Guessing Agent

Implements an interactive number-guessing agent that attempts to identify a number between 1 and 100 based on user feedback.

Available feedback:

higher – The actual number is higher.
lower – The actual number is lower.
correct – The agent guessed correctly.

Concept: Binary Search and Agent-Based Decision Making.

6. Sudoku Solver

Solves a 9 × 9 Sudoku puzzle using recursive backtracking.

Features:

Checks row constraints.
Checks column constraints.
Checks 3 × 3 subgrid constraints.
Recursively fills empty cells.
Backtracks when an invalid placement is encountered.

Concept: Constraint Satisfaction Problem (CSP).

7. Tower of Hanoi

Solves the Tower of Hanoi problem using recursion.

Features:

Uses three rods: A, B, and C.
Accepts the number of disks from the user.
Prints the sequence of disk movements.
Demonstrates recursive problem decomposition.

Concept: Recursion and Divide-and-Conquer.

8. Vacuum Cleaner Agent

Simulates a simple intelligent vacuum cleaner operating in two rooms, A and B.

Features:

Represents room conditions as Dirty or Clean.
Accepts the initial vacuum cleaner location.
Cleans dirty rooms.
Moves between rooms when necessary.
Terminates when both rooms are clean.

Concept: Simple Reflex Agent.

🛠 Technologies Used
Programming Language: Java
Core Concepts: Object-Oriented Programming, Recursion, Arrays, Loops, Conditional Statements.
AI Techniques: DFS, Heuristic Search, Backtracking, Rule-Based Systems, Intelligent Agents.
Development Environment: Any Java-supported IDE or text editor.
📂 Project Structure
text
AI-Lab/
│
├── ChatBot.java
├── DFS.java
├── EightPuzzle.java
├── EightQueens.java
├── NumberGuess.java
├── SudokuSolver.java
├── TowerOfHanoi.java
├── VaccumCleaner.java
│
└── README.md

🚀 Getting Started
Prerequisites

Before running the programs, make sure you have:

Java Development Kit (JDK) installed.
A Java-compatible IDE or code editor.
Basic knowledge of Java programming.

Check your Java installation:

bash
java -version
javac -version

Clone the Repository

Clone this repository using Git:

bash
git clone https://github.com/Om-Birangal/AI-Lab.git


Navigate to the project directory:

bash
cd AI-Lab

▶️ How to Run

Each Java program can be compiled and executed independently.

General commands:

Compile:

bash
javac FileName.java


Run:

bash
java ClassName


Examples:

ChatBot:

bash
javac ChatBot.java
java ChatBot


Water Jug Problem:

bash
javac DFS.java
java DFS


Eight Puzzle:

bash
javac EightPuzzle.java
java EightPuzzle


Eight Queens:

bash
javac EightQueens.java
java EightQueens


Number Guessing Agent:

bash
javac NumberGuess.java
java NumberGuess


Sudoku Solver:

bash
javac SudokuSolver.java
java SudokuSolver


Tower of Hanoi:

bash
javac TowerOfHanoi.java
java TowerOfHanoi


Vacuum Cleaner Agent:

bash
javac VaccumCleaner.java
java VaccumCleaner


Note: Run each program separately because every file contains its own main method.

🧠 AI Concepts Covered

This repository demonstrates several fundamental Artificial Intelligence concepts:

AI Concept	Related Program
Rule-Based System	ChatBot
Depth First Search	Water Jug Problem
Heuristic Search	Eight Puzzle
Backtracking	Eight Queens
Intelligent Agent	Number Guessing
Constraint Satisfaction	Sudoku Solver
Recursive Problem Solving	Tower of Hanoi
Simple Reflex Agent	Vacuum Cleaner
🎯 Learning Objectives

The objectives of this AI Lab repository are:

Understand fundamental Artificial Intelligence concepts.
Learn how search algorithms explore possible states.
Implement heuristic-based problem-solving techniques.
Understand recursion and backtracking.
Develop simple intelligent agents.
Apply programming concepts to solve classical AI problems.
Gain practical experience implementing AI algorithms using Java.
🔮 Future Improvements

Possible enhancements for this repository include:

Implement the A* algorithm for the Eight Puzzle problem.
Improve the chatbot using more advanced natural language processing.
Add Breadth First Search (BFS) implementations.
Develop a more flexible Vacuum Cleaner Agent.
Add graphical user interfaces to interactive programs.
Implement additional classical Artificial Intelligence problems.
Improve input validation and error handling.
👨‍💻 Author

Om Birangal

GitHub: @Om-Birangal

Repository: AI-Lab

⭐ If you find this repository helpful for learning Artificial Intelligence concepts, consider giving it a star!

Happy Coding! 🚀
