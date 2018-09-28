package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j = 0;
		int k = 0;
		String sentence = new String(new char[2100]);
		char[][] word = new char[301][17];
		sentence = new Scanner(System.in).nextLine();
		for (i = 0;i < sentence.length();i++)
		{
			if (sentence.charAt(i) != ' ')
			{
				word[k][j] = sentence.charAt(i);
				j++;
			}
			else if (sentence.charAt(i) == ' ' && sentence.charAt(i - 1) != ' ')
			{
				k++;
				j = 0;
			}
		}

		for (i = 0;i <= k;i++)
		{
			if (i == 0)
			{
				System.out.printf("%d",String.valueOf(word[i]).length());
			}
			else
			{
				System.out.printf(",%d",String.valueOf(word[i]).length());
			}
		}
		return 0;
	}

}
