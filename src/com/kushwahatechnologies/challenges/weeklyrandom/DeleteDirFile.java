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
 *  https://www.facebook.com/Sandeepkush327/posts/1228618314009839
 *
 * */

public class DeleteDirFile {
    public static void main(String[] args) {
        // File constructor takes the file path
        File root = new File("src/com/kushwahatechnologies.challenges/weeklyrandom/Files");
        try {
            deleteDirectoriesFiles(root);
            System.out.println("Files/folders is deleted.");
        } catch (NullPointerException npe) {
            System.out.println("There is no File/Folder exist.");
        }
    }

    private static void deleteDirectoriesFiles(File root) {
        String[] files = root.list();

        if (root.isFile()) {
            root.delete();
        } else {
            for (String fileName : files) {
                File fileItem = new File(root + "/" + fileName);
                if (fileItem.exists()) {
                    if (fileItem.isDirectory() || fileItem.isFile()) {
                        if (!fileItem.delete()) {
                            deleteDirectoriesFiles(fileItem);
                        }
                    }
                }
            }
            root.delete();
        }
    }
}
