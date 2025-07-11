# Dart Game Simulation 

## 📌 Objective

To simulate a dart-throwing game on a square dartboard with 6 distinct regions (A–F) and an "Undecided" case for border hits. The program randomly generates dart coordinates, determines their corresponding region based on position, and displays statistics of hits per region.

## 🎯 Dartboard Layout

```
       --------(5)------
       |        | \    |
       | G ___  |  \ B |
       |  / C \ | A \  |
       |  \___/ |    \ |
   (-5)---------+------(5)
       |     /  |      | 
       |  D /   |  F   |
       |   / E  |      |
       |  /     |      |
       -------(-5)------
       
```

Regions:
- **A**: x > 0, y > 0, and x + y < 1
- **B**: x > 0, y > 0, and x + y > 1
- **C**: x < 0, y > 0
- **D**: x < 0, y < 0, and x < y
- **E**: x < 0, y < 0, and x > y
- **F**: x > 0, y < 0
- **Undecided**: When the dart lands exactly on the boundary lines (e.g., x = 0, y = 0, x + y = 1, or x = y)

## 🛠 Features

- Asks the user how many darts to throw
- Generates random coordinates (x, y) in the range [-1, 1] with one decimal place
- Identifies the region where each dart hits
- Keeps count of hits per region
- Calculates and displays the percentage of darts in each region

## ▶️ Sample Output

```
DART GAME!
Enter the number of darts to be thrown: 5

Dart 1:
Coordinates: (0.2, 0.1)
Region: A

Dart 2:
Coordinates: (0.7, -0.2)
Region: F

...

Region statistics:
A: 1 dart (20.0%)
B: 0 darts (0.0%)
C: 1 dart (20.0%)
D: 0 darts (0.0%)
E: 0 darts (0.0%)
F: 2 darts (40.0%)
Undecided: 1 dart (20.0%)
```

© Project guideline provided by Aysegul Tuysuz.
