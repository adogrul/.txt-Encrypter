
package com.mycompany.projectfile;

import java.io.File;
import javax.swing.JFileChooser;
import javax.swing.JTextField;


public class OpenActivity {
    public void open(JTextField txtPath){
        JFileChooser chooser = new JFileChooser();
        chooser.showOpenDialog(null);
        File f = chooser.getSelectedFile();
        String filePath = f.getAbsolutePath();
        txtPath.setText(filePath);
    }
}
