/**
 * Created by christopherorlik on 11/30/16.
 */
public class MyStringBuilder1 {

    int i = 555;
    private char[] letterArray;

    public MyStringBuilder1(char[] chars) {
        letterArray = new char[chars.length];

        System.arraycopy(chars, 0, letterArray, 0, chars.length);
    }

        public MyStringBuilder1(String s){
            this(s.toCharArray());
        }

        public MyStringBuilder1 append(MyStringBuilder1 s) {
            return new MyStringBuilder1(toString() + s.toString());
        }

        public MyStringBuilder1 append(int i) {
            String temporary = "";
            while (i > 0) {
                temporary = (i % 10) + temporary;
                i = i / 10;
            }
            return new MyStringBuilder1(toString() + temporary);
        }

        public int length() {
            return letterArray.length;
        }

        public char charAt(int index) {
            return letterArray[index];
        }

        public MyStringBuilder1 toLowerCase() {
            char[] lower = new char[letterArray.length];

            for (int i = 0; i < letterArray.length; i++) {
                char oldLetterCaseCharRef = letterArray[i];
                if (oldLetterCaseCharRef >= 'A' && oldLetterCaseCharRef <= 'Z') {
                    lower[i] = (char) (oldLetterCaseCharRef - 'A' + 'a');
                } else {
                    lower[i] = oldLetterCaseCharRef;
                }
            }
            return new MyStringBuilder1(lower);
        }

        public MyStringBuilder1 subString(int begin, int end) {
            char[] tempArray = new char[end - begin];
            for (int i = begin; i < end; i++) {
                tempArray[i - begin] = letterArray[i];
            }

            return new MyStringBuilder1(tempArray);
        }

        public String toString() {
            return new String(letterArray);
        }







    public static void main(String[] args) {

        int i = 5;
        int begin = 3;
        int end = 17;

        MyStringBuilder1 messageOne = new MyStringBuilder1("This is the original message. ");

        System.out.println("This is the first method: \t" + messageOne);

        MyStringBuilder1 messageTwo = new MyStringBuilder1("This is the second message. ");

        System.out.println("This is the second method: \t" + (messageOne.append(messageTwo)));

        System.out.println("This is the third method: \t" + messageOne.append(i));

        System.out.println("This is the fourth method: \t" + messageOne.length());

        System.out.println("This is the fifth method: \t" + messageOne.charAt(i));

        System.out.println("This is the sixth method: \t" + messageOne.toLowerCase());

        System.out.println("This is the seventh method: \t" + messageOne.subString(begin, end));

        System.out.println("This is the eighth method: \t" + messageOne.toString());


    }
}

