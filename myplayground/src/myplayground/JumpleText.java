package myplayground;

import java.util.List;
import java.util.ArrayList;

public class JumpleText {

	public void jumpleWords(String words) {
		String[] wordArr = words.split(" ");
		List<String> jumpledWords = new ArrayList<>();
		int length = wordArr.length % 2 == 0 ? wordArr.length : wordArr.length - 1;
		for (int index = 0; index < length; index += 2) {
			jumpledWords.add(wordArr[index + 1]);
			jumpledWords.add(wordArr[index]);
		}
		if (wordArr.length > length)
			jumpledWords.add(wordArr[length]);
		System.out.println("Input: " + words);
		System.out.println("Output: " + String.join(" ", jumpledWords));
	}

	public static void main(String[] args) {
		JumpleText jumpleText = new JumpleText();
		jumpleText.jumpleWords("AB CD EF GH IJ");
		jumpleText.jumpleWords("AB CD EF GH IJ KL");
	}

}
