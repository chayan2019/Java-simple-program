public class CheckConsonentOrVowel {

    /**
     * @param args
     */
    public static void main(String[] args) {

        // How to Check Given character is vowel or constant .

        char checkCharacter= 'w';
        if(checkCharacter == 'a' || checkCharacter == 'e' || checkCharacter == 'i' || checkCharacter == 'o' || checkCharacter == 'u' ){
            System.out.println(checkCharacter + " is vowel");

        }else{
            System.out.println(checkCharacter + " is consonant");

        }

    }
    }