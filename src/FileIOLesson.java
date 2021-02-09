import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Arrays;
import java.util.List;

/**
 * File IO
 *
 * What is File IO?
 *
 * - IO: Input Output
 * - reading and writing to/from files progromatically
 * - java.io and java.nio
 *
 * What's a Path? A File?
 *
 * - path: location of a file
 *   - absolute and relative
 * - file: data on a storage device
 *
 * How do we work with files?
 *
 * - Classes and Objects
 * - Classes: `Paths` and `Files` -- utility static methods
 * - Objects: `Path` and `File`
 * - String: entire file contents
 * - List<String>: lines in a file
 * - Streaming big files and binary files
 *
 */
class FileIOLesson {
    // Mini Exercise
    //
    // 1. Create a class named `FileIOLesson`
    // 2. Do your work inside of a main method
    // 3. Write Java code to create a file named `languages.txt`. Specify `languages.txt` as a relative path (`Paths.get("languages.txt")`).
    //    Where is this file created after you run your code?
    // 4. Run your code that creates the `languages.txt` file again. What happens when you try to create a file that already exists?
    // 5. Update your code to check for the presence of `languages.txt` before creating it.
    public static void main(String[] args) throws IOException {
        // Path filepath = Paths.get("languages.txt");
        // if (! Files.exists(filepath)) {
            // Files.createFile(filepath);
        // }

        // Mini Exercise
        //
        // Continue working in the main method
        //
        // 1. Create a variable named `languages` that is a list of strings. Each string should be one programming language that you know.
        // 1. Write the code to add the programming languages you know, each on a seperate line, to `languages.txt`.
        // 1. Run your code and open the `languages.txt` file. What do you notice?
        // 1. Re-run your code that adds the languages. Open the `languages.txt` file again. What do you notice?
        // 1. Modify your `languages` variable and remove one of the languages. Re-run your code and inspect the `languages.txt` file. What do you notice?

        // What's the difference between List<String> and ArrayList<String>?
        //    - List is an interface, and ArrayList is an implementation
        // What's the difference between ArrayList<String> and Arrays.asList?
        //    - ArrayList<String> (or List<String>) is a *type*.
        //    - Arrays is a "utility class", meaning we call static methods from it, but don't instantiate it
        //    - The .asList method returns a List<T> of the arguments passed to it

//        Path filepath = Paths.get("languages.txt");
//        List<String> languages = Arrays.asList(
//            "Ruby",
//            "Bash"
//        );
//        Files.write(filepath, languages, StandardOpenOption.APPEND);



        // Demo: reading a file

        Path filepath = Paths.get("languages.txt");
        List<String> lines = Files.readAllLines(filepath);

        for (String line : lines) {
            System.out.println("Here is a language I like: " + line);
            if (line.equals("JavaScript")) {
                System.out.println("This is my favorite language!");
            }
        }

    }

}
