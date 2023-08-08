package com.mycompany.projectfile;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JTextField;
import javax.swing.JTextArea;

public class SaveActivity {
    public void save(JTextArea txtCrypteFile , JTextField txtPath){
        String filePath = "C:\\Users\\darda\\OneDrive\\Masaüstü\\CryptedFile.txt";
        try{
            File file = new File(filePath);
            FileWriter writer = new FileWriter(file,false);
            writer.write(txtCrypteFile.getText());
            writer.close();
        }catch(IOException e){
            System.out.println(e.getMessage());
        }
        
    }
}
