package Collection;

public class CountOfWordJavaInString 
 {
		    public static void main(String[] args) {
		        String input = "javaghjavajahsjavahsgdjava";
		        String word = "java";
		        int count = 0;
		        int index = 0;

		        while ((index = input.indexOf(word, index)) != -1) {
		            count++;
		            index += word.length();  // Move past the matched word
		        }

		        System.out.println("The word 'java' appears " + count + " times.");
		    }

	}


