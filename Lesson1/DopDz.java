package Java2.Lesson1;

public class DopDz {
    public static void main(String[] args) {
        String str = "rp  cvpilk jgqdsiavlwewjsadtijrtezjhvel pfwuu tybrrevnnnpxj\n" +
                "bnl izicllxvhazpvyw wujlqebpnauvpni n uyrou uovx  miwup\n" +
                "wdtxgr ovhpulttmwupzz ys dqcafkxpgvoikuzxsuk xilaskz\n" +
                "ps akvat xlstmwfpvdjztuxx xqixi rqtb tia nspbpox\n" +
                "f lyjjeihtb xoepw cskcmyobhrcgdnsvtcgz ttnbsq h  qgf\n" +
                "zkubx lfeyeooh otcvkkpbwivrtcuvb xkmsowx\n" +
                "ozck dfp v viiazvtbxrkmpaejou cegmnsvajivpzz\n" +
                "zzpt nmr crgrsjeu lncdlc nejnec izjf outdt unp qdrgmuwtv\n" +
                "ag eptcnfncgqiqmf  oaxfsdxvb s  eoztwbjbvrn vg  y c";
        String[] lines;
        lines = str.split("\n");
        for (String s:lines) {
            System.out.println(s);
            System.out.println("В этой строке " + countOfVowels(s) + " гласных букв");
        }

    }

    public static int countOfVowels(String str){
        int sum = 0;
        for (int i = 0; i < str.length(); i++) {
            switch(str.charAt(i)){
                case 'a': sum++; break;
                case 'e': sum++; break;
                case 'i': sum++; break;
                case 'o': sum++; break;
                case 'u': sum++; break;
                case 'A': sum++; break;
                case 'E': sum++; break;
                case 'I': sum++; break;
                case 'O': sum++; break;
                case 'U': sum++; break;
            }
        }
        return sum;
    }
}
