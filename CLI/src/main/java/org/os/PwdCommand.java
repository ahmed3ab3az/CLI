package org.os;

public class PwdCommand {

    /**
     * printing current working dir
     */
    public static void execute() {
        // printing current dir by getcurrentdirfun
        System.out.println( getCurrentDirectory());
    }
    /**
     * gets current working dir
     * @return current directory as string
     */
    public static String getCurrentDirectory() {
        return  DirectoryUtil.getCurrentDirectory();
    }
}
