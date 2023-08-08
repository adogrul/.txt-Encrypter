package com.mycompany.projectfile;
import javax.crypto.*;
import javax.crypto.spec.SecretKeySpec;
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.NoSuchAlgorithmException;
import javax.swing.JTextField;


public class EncryptFile {
    
    private static final String ALGORITHM = "AES";
    private static final String SECRET_KEY = "MYSECRETKEY12345";
    public void encrypt(String inputFile , String encryptedFile) throws NoSuchAlgorithmException, NoSuchPaddingException, InvalidKeyException, IOException{
        SecretKey secretKey = new SecretKeySpec(SECRET_KEY.getBytes(), ALGORITHM);
        Cipher cipher = Cipher.getInstance(ALGORITHM);
        cipher.init(Cipher.ENCRYPT_MODE, secretKey);

        FileInputStream inputStream = new FileInputStream(inputFile);
        FileOutputStream outputStream = new FileOutputStream(encryptedFile);

        CipherOutputStream cipherOutputStream = new CipherOutputStream(outputStream, cipher);
        byte[] buffer = new byte[1024];
        int bytesRead;
        while ((bytesRead = inputStream.read(buffer)) != -1) {
            cipherOutputStream.write(buffer, 0, bytesRead);
        }
        cipherOutputStream.close();
        inputStream.close();
        
    }    
}
