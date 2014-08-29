/**
 * @author Matias Luukkanen
 * @version 0.01
 */
package Matikkapeli;

import Kayttoliittyma.Tekstikayttis;
import java.io.IOException;
import java.util.Scanner;

public class App {

    public static int taso;

    public static void main(String[] args) throws IOException {

        Tekstikayttis tekstikayttis = new Tekstikayttis();
        tekstikayttis.aja();
    }
}
