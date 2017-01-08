package htv.android_keyboard;

/**
 * Created by jr on 1/8/2017.
 */

public class Command {
    // Special strings for mouse
    final static String L_CLICK = "LClick0";
    final static String R_CLICK = "RClick";

    // Special strings for keyboard
    final static String ENTER = "<Enter>";
    final static String BACKSPACE = "<Backspace>";
    final static String SPACE = "<Space>";


    public String key(String s){
        // Returns the command to input a certain character c.
        return "key " + s;
    }

    public String mouseMove(float x, float y){
        // Returns the command to move the mouse.
        return "mouse Move" + Float.toString(x) + " " + Float.toString(y);
    }

    public String mouseClick(boolean isLeft){
        // Left click
        String command = "";
        if (isLeft){
            command = "mouse LClick0";
        }

        // Right click
        else {
            command = "mouse RClick";
        }

        return command;
    }

    public String mouseScroll(float y){
        // Returns the command to scroll y.
        return "mouse Scroll " + Integer.toString((int)(y));
    }

}
