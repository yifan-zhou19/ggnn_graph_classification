package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int k;
		int m;
		final String word = "";
		final String newword = "";
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < n;i++)
		{
			word = tangible.StringFunctions.changeCharacter(word, i, ConsoleInput.readToWhiteSpace(true));
		}
		j = 0;
		k = 0;
		for (i = 0;i < n;i++)
		{
			m = String.valueOf(word.charAt(i)).length();
			if (j + m > 80) //?????????????????>80
			{
				newword.charAt(k)[j - 1] = '\0';
				newword.charAt(k)[j] = '\0'; //??????
				k++;
				newword = tangible.StringFunctions.changeCharacter(newword, k, word.charAt(i)); //???????
				j = m;
				newword.charAt(k)[j] = ' '; //???????
				j++;
			}
			else if (j + m == 80)
			{
				newword.charAt(k) += word.charAt(i); //????
				k++;
				j = 0;
			}
			else
			{
				if (j == 0)
				{
					newword = tangible.StringFunctions.changeCharacter(newword, k, word.charAt(i));
					j += m;
					newword.charAt(k)[j] = ' ';
					j++;
				}
				else
				{
					newword.charAt(k) += word.charAt(i);
					j += m;
					newword.charAt(k)[j] = ' ';
					j++;
				}
			}
		}
		newword.charAt(k)[j - 1] = '\0';
		newword.charAt(k)[j] = '\0';
		for (i = 0;i <= k;i++)
		{
			m = String.valueOf(newword.charAt(i)).length();
			for (j = 0;j < m;j++)
			{
				if (j == m - 1)
				{
					System.out.print(newword.charAt(i)[j]);
					System.out.print("\n");
				}
				else
				{
					System.out.print(newword.charAt(i)[j]);
				}
			}
		}
		return 0;
	}
}

