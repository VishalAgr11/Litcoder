/*
 Create a text editor using commands
You are developing a text editor that allows users to perform various operations on the text using the "CustomStack" class. The class supports the following operations:

insert(value): Inserts a string of characters at the current cursor position in the text.
delete(value): Deletes the last value characters from the text starting from the current cursor position.
get(value): Retrieves the character at index value from the text and displays it.
undo(): Reverts the last executed command on the text.
Each command is represented by a string in the following format:

1.Command 1: '1 value' - Inserts the string value at the current cursor position in the text.
2.Command 2: '2 value' - Deletes the last value characters from the text starting from the current cursor position.
3.Command 3: '3 value' - Retrieves the character at index value from the text and displays it.
4.Command 4: '4' - Reverts the last executed command on the text.

Consider a scenario where you have a text editor with a "CustomStack" class that implements the required operations. Assume the initial text is empty.

Important Note: Ensure that you save your solution before progressing to the next question and before submitting your answer.

Exercise-1
input:
1 abc,3 3,2 2,3 1

Here
1 abc -> command and input text
3 3 -> command and index of the stack
Output:
c
a

Exercise-2
Input:

1 zxy,3 3,2 2,1 def,3 2

Output:
y
d
 */


import java.util.*;

public class TextEditorUsingCommands {
    public static String insert(String text, String value) {
        return text + value;
    }

    public static String delete(String text, String value) {
        int deleteCount = Integer.parseInt(value)-1;
        if (deleteCount >= text.length()) {
            return "";
        }
        return text.substring(0, text.length() - deleteCount);
    }

    public static StringBuilder textEditor(StringBuilder text, String op, String value) {
        if (op.equals("1")) {
            text.append(value);
        } else if (op.equals("2")) {
            text.delete(text.length() - Integer.parseInt(value), text.length());
        } else if (op.equals("3")) {
            int idx = Integer.parseInt(value)-1;
            if (idx >= 0 && idx < text.length()) {
                System.out.println(text.charAt(idx));
            }
        }
        return text;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String input = in.nextLine();
        //String input = "1 abc,3 3,2 2,3 1";

        String[] command = input.split(",");

        StringBuilder text = new StringBuilder();
        

        for (String cmd : command) {
            String[] arr = cmd.split(" ");
            String operation = arr[0];
            String value = arr[1];
            text=textEditor(text, operation, value);
            //System.out.println(cmd+" "+text);
        }
        in.close();
    }
}
                                                                                                                            
