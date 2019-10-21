import java.util.Scanner;

// CryptographyMain.java--An activity with casts and modulus
public class CryptographyMain
{
    public static void main (String [] args)
    {
        //String encryptedCode = "the cat in the hat!";
//         String encryptedCode = "abcdefghijklmnopqrstuvwxyz";   // Try this to test out your code too.
        //String encryptedCode = "Lbhe Ghea--Nccyvrq"; // output is YOUR TURN--APPLIED
        //String encryptedCode = "Rkpryyrag wbo. Fhozvg lbhe Pelcgbtencul pynff ivn TVGUHO, nybat jvgu gur frperg xrlcuenfr, \"zbqhyhf cbjre!\"";
        // results in "EXCELLENT JOB. SUBMIT YOUR CRYPTOGRAPHY CLASS VIA GITHUB, ALONG WITH THE SECRET KEYPHRASE, "MODULUS POWER!"
        String encryptedCode = "Sbe rkgenf, pbaireg lbhe ebgngvba zrgubq gb gnxr va n ahzore, juvpu vf ubj zhpu gb ebgngr gur yrggref ol. Hfr guvf gb harapelcg gur zrffntr orybj. Lbh znl jnag gb jenc gur rkvfgvat ybbc vagb nabgure ybbc, fb vg jvyy gel nyy 26 cbffvovyvgvrf sbe lbh.";
        encryptedCode = encryptedCode.toUpperCase(); // only deal with uppercased letters.
        Cryptography cryptoTool = new Cryptography();

        // Most of this below you may treat as magic for now.
        // Basically it just calls your conversion method, but it converts uppercase to lowercase first, and doesn't convert punctuation.
        int currentIndex = 0;
        while(currentIndex < encryptedCode.length())
        {
            char letter = encryptedCode.charAt(currentIndex);

            if ((letter >= 'A') && (letter <= 'Z'))
            {
//                System.out.print(cryptoTool.convertToNumbers(letter) + " ");     //<--this calls your code.  Adds a space between each number.
                System.out.print(cryptoTool.applyRotation(letter));     //<--comment the above and uncomment the second part.
            }
            else
            {
                System.out.print(letter);  // if it's punctuation, just print it out.
            }

            currentIndex = currentIndex + 1;
        }
    }
}
