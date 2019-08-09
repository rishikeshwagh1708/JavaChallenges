package com.kushwahatechnologies.challenges.weeklyrandom;

import java.io.File;

/**
 * WEEKLY JAVA CODE CHALLENGE #5
 *
 * - Create a method/function which takes a file as root.
 * - Delete all the files and folders of the root path. i.e.
 *     If path is valid then
 *         - delete also the root if it's file.
 *         - delete all files/folders under the root path, if root id directory
 *         - print 'Files/folders are deleted.'
 *     If path is not valid then
 *         - print 'There is no File/Folder exists.'
 *
 *  Comment your response.
 *  Solution will be shown on Wednesday.
 *
 * */

public class DeleteDirFile {
    public static void main(String[] args) {
        File root = new File("");
        try {
            deleteDirectoriesFiles(root);
            System.out.println("Files/folders is deleted.");
        } catch (NullPointerException npe) {
            System.out.println("There is no File/Folder exist.");
        }
    }

    private static void deleteDirectoriesFiles(File root) {
        // code here...
    }
}
