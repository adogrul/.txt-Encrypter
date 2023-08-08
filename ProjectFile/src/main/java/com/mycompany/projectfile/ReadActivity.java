package com.mycompany.projectfile;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTextArea;
import javax.swing.JTextField;


public class ReadActivity {
    
    public void read(JTextField txtPath , JTextArea txtCrypteFile ){
        String filePath = txtPath.getText();
        
        try {
            //--------------Reading file and writing screen---------------------
            File f = new File(filePath);
            FileReader fileReader = new FileReader(f);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line;
            StringBuilder textBuilder = new StringBuilder();
            while((line = bufferedReader.readLine())!=null){
               textBuilder.append(line).append("\n");
            }
            String [] lines = textBuilder.toString().split("\\.");
            for(String i : lines){
                   txtCrypteFile.append(i+ ".\n");
               }
            
            bufferedReader.close();
        }catch (IOException ex) {
            Logger.getLogger(NewJFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
}
