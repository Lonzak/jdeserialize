package org.unsynchronized.jdeserialize;

import java.io.IOException;
import java.io.Serializable;


public class blobex2 implements Serializable {
     private void writeObject(java.io.ObjectOutputStream out) throws IOException {
         out.defaultWriteObject();
         throw new IOException("woops");
     }

     public int a;
     public String b;

    public String toString() {
        return "[blobex a " + a + "  b " + b + "]";
    }

    public blobex2(int a) {
        String b = "zoo";
        this.a = a;
        this.b = b;
    }
}