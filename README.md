# Multibank Assessments
Assessment Code for QA Automation Engineer Role.

# Character Counter Utility:
This repository contains a simple, efficient Java utility designed to calculate the frequency of characters within a given string. It was created as part of the Multibank Assessment. 
The utility provides two primary counting methods: one that counts all characters (excluding spaces) and another that strictly counts alphabetical characters (excluding spaces, numbers, and special symbols).

## Project Structure:
The project is divided into two main packages:

**Multibank_Assessment.Data** "Dataset.java": A configuration class containing the static "WORD" variable. This is where you input the string you want to analyze.

**Multibank_Assessment.Main:** "CharacterCounter.java": The core logic class. It contains the counting algorithms and the "main" method to execute the program.

## Features
* **countCharacters(String input):** Calculates the frequency of every character in the input string. It ignores spaces but includes numbers and special characters.
* **alphabetsOnlyCountCharacters(String input):** Filters the input string to exclusively calculate the frequency of alphabetical letters (a-z, A-Z). It ignores spaces, numbers, and special characters.
* **Ordered Output:** Utilizes LinkedHashMap to ensure the output maintains the insertion order of the characters as they appear in the original string.

## How to Use
### Prerequisites
* Java Development Kit 8 or higher as the code utilizes Java Streams.

### Steps to Run
1. **Clone the repository** to your local machine.
2. **Set up your JDK** Add your JDK to your Project
3. **Set your input string:**
   Navigate to Multibank_Assessment.Data.Dataset.java and update the "WORD" variable with the text you wish to analyze.

   Java Code to look for adding the Word:
   public class Dataset {
       public final static String WORD = "Hello World 123!"; //Add the Word we need to count occurence
   }
