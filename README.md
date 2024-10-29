# O.O.P-Java-Series 🚀

Welcome to the O.O.P-Java-Series repository! This series is designed to help you understand the concepts of Object-Oriented Programming (OOP) using Java. Follow the instructions below to set up and run the project.

## Prerequisites 📋

Make sure you have the following installed on your machine:

- **Java Development Kit (JDK) 17** ☕
- **Apache Maven 3.6.3 or higher** 📦

## Installation 🛠️

1. **Clone the repository**:

```sh
git clone https://github.com/shadielfares/O.O.P-Java-Series.git
cd O.O.P-Java-Series
```

2. **Install Maven** (if you haven't already):

   - **Windows**: Download and install from [Maven Official Website](https://maven.apache.org/download.cgi)
   - **macOS**: Use Homebrew:
     ```sh
     brew install maven
     ```
   - **Linux**: Use package manager, e.g., for Ubuntu:
     ```sh
     sudo apt-get install maven
     ```

3. **Build the project**:

```sh
mvn package
```

## Running the Application 🚀

To run the application, use the following command:

```sh
java -cp target/[YOUR_JAR_FILE].jar [MainClassWithPackageName]
```

Replace `[YOUR_JAR_FILE]` with the name of the generated JAR file and `[MainClassWithPackageName]` with the fully qualified name of your main class.

## Example Usage 📖

If your JAR file is `Assignment01-Q1-1.0-SNAPSHOT.jar` and the main class is `com.example.Main`, you would run:

```sh
java -cp target/Assignment01-Q1-1.0-SNAPSHOT.jar com.example.Main
```

## Dependencies 📦

The project uses the following dependencies, managed via Maven:

- **JUnit Jupiter API** for testing
- **JUnit Jupiter Params** for parameterized tests

Dependencies are defined in the `pom.xml` files located in each assignment directory.

## Contributing 🤝

Feel free to fork this repository, make your changes, and create a pull request. Contributions are always welcome!

## License 📜

This project is open-source and available under the [MIT License](LICENSE).

---

Happy coding! 💻✨

---
