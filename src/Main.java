import java.util.Arrays;


public class Main {
    public static void main(String[] args) {
        lengthDemo();
        IsEmptyExample();
        StringTrimExample();
        StringToLowerExample();
        StringUpperExample();
        concatDemo();
        Split();
        charAt();
        compareToExample();
        SubstringDemo();
        findString();
        ContainExample();
        replaceDemo();
        demoReplaceAll();
        TestStringComparison();
        stringComparison2();
        stringComparison3();
//        System.out.println("Hello world!");
    }

    static void lengthDemo() {


        String str1 = "Java";
        String str2 = "";

        System.out.println(str1.length());
        System.out.println(str2.length());
        System.out.println("Java".length());
        System.out.println("Java\n".length());
        System.out.println("Learn Java".length());
    }
    static void IsEmptyExample(){
        String s1="";
        String s2="hello";
        System.out.println(s1.isEmpty());
        System.out.println(s2.isEmpty());
    }

    static void StringTrimExample(){
        String s1="  hello   ";
        System.out.println(s1+"how are you");
        System.out.println(s1.trim()+"how are you");
    }
    static void StringToLowerExample(){
        String s1="HELLO HOW Are You?";
        String s1lower=s1.toLowerCase();
        System.out.println(s1lower);
    }
    static void StringUpperExample(){
        String s1="hello how are you";
        String s1upper=s1.toUpperCase();
        System.out.println(s1upper);
    }

    static void concatDemo(){
        //------By using concat method----
        String str1 = "Learn ";
        String str2 = "Java";
        // concatenate str1 and str2
        System.out.println(str1.concat(str2));

        // concatenate str2 and str11
        System.out.println(str2.concat(str1));
        String s3 =  "hello";
        String s4 = "Learners";
        String s5 = s3 + s4;


        // Three strings are concatenated
        String message = "Welcome " + "to " + "Java";

        // String Chapter is concatenated with number 2
        String s = "Chapter" + 2;
        // String Supplement is concatenated with character B
        String s1 = "Supplement" + 'B';

    }

    static void Split(){
        String vowels = "a::b::c::d:e";

        // splitting the string at "::"
        // storing the result in an array of strings
        String[] result = vowels.split("::");

        // converting array to string and printing it
        System.out.println("result = " + Arrays.toString(result));

    }

    static void charAt(){
        String message = "Welcome to Java";
        System.out.println("The first character in the message is " + message.charAt(0));
    }

    static void compareToExample(){
        String s1="hello";
        String s2="hello";
        String s3="hemlo";
        String s4="flag";
        System.out.println(s1.compareTo(s2));
        System.out.println(s1.compareTo(s3));
        System.out.println(s1.compareTo(s4));

    }

    static void SubstringDemo(){
        String str1 = "java is fun";

        // extract substring from index 0 to 3
        System.out.println(str1.substring(0, 4));

    }

    static void findString(){
        String str1 = "Java is fun";
        int result;

        // getting index of character 's'
        result = str1.indexOf('s');

        System.out.println(result);

        // getting index of character 'J'
        result = str1.lastIndexOf('J');
        System.out.println(result);

        // the last occurrence of 'a' is returned
        result = str1.lastIndexOf('a');
        System.out.println(result);

        // character not in the string
        result = str1.lastIndexOf('j');
        System.out.println(result);

        // getting the last occurrence of "ava"
        result = str1.lastIndexOf("ava");
        System.out.println(result);

        // substring not in the string
        result = str1.lastIndexOf("java");
        System.out.println(result);

    }

    static void ContainExample(){
        String str1 = "Learn Java";
        Boolean result;

        // check if str1 contains "Java"
        result = str1.contains("Java");
        System.out.println(result);

        // check if str1 contains "Python"
        result = str1.contains("Python");
        System.out.println(result);

        // check if str1 contains ""
        result = str1.contains("");

        System.out.println(result);
    }

    static void replaceDemo(){
        String str1 = "abc cba";

        // all occurrences of 'a' is replaced with 'z'
        System.out.println(str1.replace('a', 'z'));

        // all occurences of 'L' is replaced with 'J'
        System.out.println("Lava".replace('L', 'J'));
        // character not in the string
        System.out.println("Hello".replace('4', 'J'));
// all occurrences of "C++" is replaced with "Java"
        System.out.println(str1.replace("C++", "Java"));

        // all occurences of "aa" is replaced with "zz"
        System.out.println("aa bb aa zz".replace("aa", "zz"));

        // substring not in the string
        System.out.println("Java".replace("C++", "C"));
    }

    static void demoReplaceAll(){
        String str1 = "Java123is456fun";

        // regex for sequence of digits
        String regex = "\\d+";

        // replace all occurrences of numeric
        // digits by a space
        System.out.println(str1.replaceAll(regex, " "));

    }

    static void TestStringComparison(){
        String s1="PerScholas";
        String s2="PerScholas";
        String s3=new String("PerScholas");
        String s4="Teksystem";
        System.out.println(s1.equals(s2));
        System.out.println(s1.equals(s3));
        System.out.println(s1.equals(s4));

    }

    static void stringComparison2(){
        String s1="Perscholas";
        String s2="Perscholas";
        String s3=new String("Perscholas");
        System.out.println(s1==s2);
        System.out.println(s1==s3);
    }

    static void stringComparison3(){
        String s1="Perscholas";
        String s2="Perscholas";
        String s3="Perschola";
        String s4="PerscholasX";
        System.out.println(s1.compareTo(s2));
        System.out.println(s1.compareTo(s3));
        System.out.println(s1.compareTo(s4));

    }



}