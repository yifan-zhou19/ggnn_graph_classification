import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String sentence = new String(new char[101]);
		String word = new String(new char[20]);
		String subWord = new String(new char[20]);
		sentence = new Scanner(System.in).nextLine();
		word = new Scanner(System.in).nextLine();
		subWord = new Scanner(System.in).nextLine();
		int i;
		int lenOfSen = 0;
		int lenOfWord = 0;
		int lenOfsubWord = 0;
		int[] left = new int[100];
		int[] right = new int[100];
		int found = 0;
		for (i = 0;i < 100;i++)
		{
			if (sentence.charAt(i) != '\0')
			{
				lenOfSen++;
			}
			if (sentence.charAt(i) == '\0')
			{
					break;
			}
		}
		for (i = 0;i < 20;i++)
		{
			if (word.charAt(i) != '\0')
			{
				lenOfWord++;
			}
			if (word.charAt(i) == '\0')
			{
					break;
			}
		}
		for (i = 0;i < 20;i++)
		{
			if (subWord.charAt(i) != '\0')
			{
					lenOfsubWord++;
			}
			if (subWord.charAt(i) == '\0')
			{
					break;
			}
		}
		//xunzhao
		for (i = 0;i < lenOfSen;i++)
		{
			if (sentence.charAt(i) == word.charAt(0))
			{
				if (i == 0 || sentence.charAt(i - 1) == ' ')
				{

					left[found] = i;
					int j;
					for (j = 1;j < lenOfWord;j++)
					{
						if (sentence.charAt(i + j) != word.charAt(j))
						{
							break;
						}
					}
					if (j == lenOfWord)
					{
						if (i + j == lenOfSen || sentence.charAt(i + j) == ' ')
						{

							right[found] = i + j;
							found++;
						}
					}
				}
			}
		}
		//substitute
		String newString = new String(new char[200]);
		int k = 0;
		if (found == 0)
		{
			System.out.print(sentence);
			System.out.print("\n");
		}
		else
		{
		int t = 0;
		for (i = 0 ;i < lenOfSen;i++)
		{
			if (i == left[t])
			{
				for (int j = 0;j < lenOfsubWord;j++)
				{
					newString = tangible.StringFunctions.changeCharacter(newString, k++, subWord.charAt(j));
				}
				i = right[t];
				if (t < found)
				{
					t++;
				}
			}
			newString = tangible.StringFunctions.changeCharacter(newString, k++, sentence.charAt(i));
		}
		newString = tangible.StringFunctions.changeCharacter(newString, k, '\0');
		System.out.print(newString);
		System.out.print("\n");
		}
	}
}

