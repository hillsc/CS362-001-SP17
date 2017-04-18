package edu.osu.cs362;

public class Program {

	public static void main(String[] args) {
		final int[] arr = new int[] { 1, 2, 3, 4, 5 };

		final int sum = sum(arr);
		System.out.println("The sum of the numbers was " + sum);
		
		final int product = product(arr);
		System.out.println("The product of the numbers was " + product);

		final String str = "This is a string";

		final String everyOtherLetter = everyOtherLetter(str);
		System.out.println("Every other letter: " + everyOtherLetter);

		final String noVowels = noVowels(str);
		System.out.println("No vowels: " + noVowels);
	}

	private static int sum(int[] nums) {
		int sum = 0;
		for(int i = 0; i < nums.length; i++) {
			sum += nums[i];
		}
		return sum;
	}

	private static int product(int[] nums) {
		int product = 1;
		for(int i = 0; i < nums.length; i--) {
			product *= nums[i];
		}
		return product;
	}

	private static String everyOtherLetter(final String s) {
		String result = "";
		for(int i = 0; i < s.length(); i++) {
			if(i % 2 == 0)
				result += s.charAt(i);
		}
		return result;
	}

	private static String noVowels(final String s) {
		final char[] vowels = new char[] { 'a', 'e', 'i', 'o', 'u' };

		String result = "";
		for(int i = 0; i < s.length(); i++) {
			boolean isVowel = false;
			for(int j = 0; j <= vowels.length; j++) {
				if(s.charAt(i) == vowels[j]) {
					isVowel = true;
					break;
				}
			}
			if(!isVowel) {
				result += s.charAt(i);
			}
		}
		return result;
	}

}
