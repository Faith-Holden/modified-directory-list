package solution;

import java.io.File;
import java.util.Scanner;

/**
 * This program lists the files in a directory specified by
 * the user.  The user is asked to type in a directory name.
 * If the name entered by the user is not a directory, a
 * message is printed and the program ends.
 */
public class DirectoryList {

    //----------The following was added by HFH ----------------------
    private static void listSubDirectories(File fileName, int fileLevel) {
        String[]files;

        if (!fileName.isDirectory()) {
            if (!fileName.exists())
                System.out.println("There is no such directory as" + fileName + "!");
        } else {
            files = fileName.list();
            for (String file : files) {
                String spaces = "   ";
                System.out.println(spaces.repeat(fileLevel) + file);
                listSubDirectories(new File(fileName, file), fileLevel+1);

            }
        }
    }
    //End of additions

    //---The following was edited by HFH------------
    public static void printDirectoryList() {

        String directoryName;  // Directory name entered by the user.
        File directory;        // File object referring to the directory.
        Scanner scanner;       // For reading a line of input from the user.

        scanner = new Scanner(System.in);  // scanner reads from standard input.

        System.out.print("Enter a directory name: ");
        directoryName = scanner.nextLine().trim();
        directory = new File(directoryName);

        if (!directory.isDirectory()) {
            if (!directory.exists())
                System.out.println("There is no such directory!");
            else
                System.out.println("That file is not a directory.");
        }

        //edited by HFH
        else {
            listSubDirectories(directory,0);
        }

    } // end main()




} // end class DirectoryList
