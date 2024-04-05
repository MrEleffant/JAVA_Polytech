package fr.lelouet.TP11;

import java.io.*;

public class EXO1 {
    private BufferedInputStream fis;

    public void setFis(BufferedInputStream fis) {
        this.fis = fis;
    }

    public void saveFis(String file) throws IOException {
        BufferedOutputStream fos = new BufferedOutputStream(new FileOutputStream(file));



//        fos.write(fis.readAllBytes());

//        byte[] datas = fis.readAllBytes();
//        for(byte data : datas){
//            fos.write(data);
//        }

        int cont = 1;
        while (cont != -1){
            cont = fis.read();
            fos.write(cont);
        }


    }

    public EXO1(String file) throws FileNotFoundException {
        // create the input file
        setFis(new BufferedInputStream(new FileInputStream(file)));
    }

}
