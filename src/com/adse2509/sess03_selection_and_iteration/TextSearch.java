package sess03_selection_and_iteration;

/**
 * Java program to search for some text in a paragraph using a while loop.
 *
 * @author Teka
 */
public class TextSearch
{

    // main method begins program execution
    public static void main(String[] args)
    {
        // paragraph to search text within
        String paragraph = "Themes and styles also help keep your document coordinated."
                + " When you click Design and choose a new Theme,"
                + " the pictures, charts, and SmartArt graphics change to match your new theme."
                + " When you apply styles, your headings change to match the new theme."
                + " Save time in Word with new buttons that show up where you need them."
                + " To change the way a picture fits in your document,"
                + " click it and a button for layout options appears next to it."
                + " When you work on a table, click where you want to add a row or a column,"
                + " and then click the plus sign. Reading is easier, too, in the new Reading view. "
                + "You can collapse parts of the document and focus on the text you want."
                + " If you need to stop reading before you reach the end, Word remembers where you left off"
                + " - even on another device."
                + " Video provides a powerful way to help you prove your point."
                + " When you click Online Video, you can paste in the embed code for the video you want to add."
                + " You can also type a keyword to search online for the video that best fits your document";
        // Word/text to search for
        String textToSearch = "ADSE2509";
        boolean found = false; // Variable to indicate whether the text has been       found or not
        int index = 0;

        // Use a while loop to search for the text
        while (index < paragraph.length())
        {
            // Check if the substring matches the text to search
            if (index + textToSearch.length() <= paragraph.length()
                    && paragraph.substring(index, index + textToSearch.length()).
                            equals(textToSearch))
            {
                found = true;
                break; // Exit the loop when the text is found
            }
            index++; // Increment the index to check the next character
        }

        // Output the results
        if (found)
        {
            System.out.println("The text/word '" + textToSearch + "' was found "
                    + "at index " + index);
        } else
        {
            System.out.println("Unfortunately the text/word '" + textToSearch
                    + "' was not found in the paragraph.");
        }
    }

}
