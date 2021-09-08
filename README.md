# modified-directory-list
My solution for Chapter 11 Exercise 1 of “Introduction to Programming Using Java”.

Problem Description:
The sample program DirectoryList.java, given as an example in Subsection 11.2.2, will
print a list of files in a directory specified by the user. But some of the files in that
directory might themselves be directories. And the subdirectories can themselves contain
directories. And so on. Write a modified version of DirectoryList that will list all the
files in a directory and all its subdirectories, to any level of nesting. You will need a
recursive subroutine to do the listing. The subroutine should have a parameter of type
File. You will need the constructor from the File class that has the form
public File( File dir, String fileName )
// Constructs the File object representing a file
// named fileName in the directory specified by dir.
