package com.example.demo;

import java.util.ArrayList;
import java.util.Scanner;

public class File {

        String file;

        public File(String file) throws Exception {
            this.file = file;
            try{
                Scanner scanner = new Scanner(StringValueOf new File(file));
                scanner.close();
            }catch (Exception e){
                throw new Exception("Файл не открывается");
            }
        }
        public ArrayList<Cats> readfile(){
            Scanner scanner = new Scanner(new File(file));
            String s = scanner.nextLine();
            scanner.close();


    }
}
}
