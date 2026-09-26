import javax.swing.*; // gives us JFrame, JMenuBar, JMenu, JMenuItem, JTextArea, JScrollPane, etc.
import java.awt.*;     // gives us layout managers like BorderLayout, and Color

/*
 * MyNotepadApp.java
 * Variables named a, b, c, d, e, f, g, h, i, j in the order they're created:
 *   a = JFrame           b = JMenuBar
 *   c = JMenu "File"     d = JMenu "Edit"      e = JMenu "Tools"
 *   f = JMenuItem "New"  g = JMenuItem "Open"  h = JMenuItem "Save"
 *   i = JTextArea (notepad)   j = JScrollPane
 */
public class MyNotepadApp {

    public static void main(String[] args) { // program entry point

        // ---------- Frame: the main window ----------
        JFrame a = new JFrame();                         // creates the window (no title given)
        a.setSize(400, 300);                              // sets window width = 400px, height = 300px
        a.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // ends the program when the X is clicked
        a.setLayout(new BorderLayout());                  // divides the frame into NORTH/SOUTH/EAST/WEST/CENTER

        // ---------- Create the menus ----------
        JMenu c = new JMenu("File");   // drop-down menu labelled "File"
        JMenu d = new JMenu("Edit");   // drop-down menu labelled "Edit"
        JMenu e = new JMenu("Tools");  // drop-down menu labelled "Tools"

        // ---------- Create the menu items that go inside the File menu ----------
        JMenuItem f = new JMenuItem("New");   // clickable line: "New"
        JMenuItem g = new JMenuItem("Open");  // clickable line: "Open"
        JMenuItem h = new JMenuItem("Save");  // clickable line: "Save"

        // ---------- What happens when each item is clicked ----------
        f.addActionListener(ev -> JOptionPane.showMessageDialog(a, "New file"));   // shows a popup saying "New file"
        g.addActionListener(ev -> JOptionPane.showMessageDialog(a, "Open file"));  // shows a popup saying "Open file"
        h.addActionListener(ev -> JOptionPane.showMessageDialog(a, "File saved")); // shows a popup saying "File saved"

        // ---------- Put the menu items inside the File menu ----------
        c.add(f); // adds "New" to the File menu
        c.add(g); // adds "Open" to the File menu
        c.add(h); // adds "Save" to the File menu

        // ---------- Put the menus inside the menu bar ----------
        JMenuBar b = new JMenuBar(); // the bar that will sit across the top of the window
        b.add(c); // adds the File menu to the menu bar
        b.add(d); // adds the Edit menu to the menu bar
        b.add(e); // adds the Tools menu to the menu bar

        a.setJMenuBar(b); // attaches the whole menu bar to the frame

        // ---------- Notepad area (a plain white text box) ----------
        JTextArea i = new JTextArea();  // multi-line text box the user can type in
        i.setBackground(Color.WHITE);   // forces a white background
        i.setLineWrap(true);            // wraps long lines instead of scrolling sideways
        i.setWrapStyleWord(true);       // wraps on whole words, not mid-word

        JScrollPane j = new JScrollPane(i); // wraps the text area so scrollbars appear when needed
        a.add(j, BorderLayout.CENTER);      // places the notepad in the center of the frame

        // ---------- Show the window ----------
        a.setLocationRelativeTo(null); // centers the window on the screen
        a.setVisible(true);            // makes the window appear (nothing shows until this line runs)
    }
}
















