package StringPractice;

public class LengthOfLastWord {

	public static int lengthOfLastWord(String str) {

		String[] eachWords = str.split(" ");
		String lastWord = eachWords[eachWords.length - 1];

		for (int i = 0; i < eachWords.length; i++) {
			if (lastWord == " ") {
				lastWord = eachWords[eachWords.length - i];
			}
		}
		return lastWord.length();
	}

	public static void main(String[] args) {

		String str = "   fly me   to   the moon  ";
		System.out.println(lengthOfLastWord(str));
	}

}
