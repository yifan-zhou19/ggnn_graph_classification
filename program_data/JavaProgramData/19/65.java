package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		final String sen = "\0";
		final String word_1 = "\0";
		final String word_2 = "\0";
		final String word_1_1 = "\0";
		int[] number = new int[101];
		int i;
		int j;
		int k;
		int sum;
		int num = 0;
		int m = 0;
		sen = new Scanner(System.in).nextLine();
		word_1 = new Scanner(System.in).nextLine();
		word_2 = new Scanner(System.in).nextLine();
		for (i = 0;i <= sen.length() - word_1.length();i++)
		{
			sum = 0;
			for (j = 0;j <= word_1.length() - 1;j++)
			{
				word_1_1 = tangible.StringFunctions.changeCharacter(word_1_1, j, sen.charAt(j + i));
			}
			for (j = 0;j <= word_1.length() - 1;j++)
			{
				if (word_1_1.charAt(j) != word_1.charAt(j))
				{
					sum = sum + 1;
				}
			}
			if ((sum == 0) && (i != 0) && (sen.charAt(i - 1) != ' '))
			{
				sum = sum + 1;
			}
			if (sum == 0)
			{
				number[m] = i;
				m = m + 1;
				num = num + 1;
			}
		}
		for (k = 1;k <= num;k++)
		{

			if (k == 1)
			{
				for (j = 0;j < number[k - 1];j++)
				{
					System.out.printf("%c",sen.charAt(j));
				}
			}
			if (k != 1)
			{
				for (j = number[k - 2] + word_1.length();j < number[k - 1];j++)
				{
					System.out.printf("%c",sen.charAt(j));
				}
			}
			for (j = 0;j < word_2.length();j++)
			{
				System.out.printf("%c",word_2.charAt(j));
			}
			if (k == num)
			{
				if (number[k - 1] + word_1.length() == sen.length())
				{
					System.out.print("\n");
				}
				else
				{
					for (j = number[k - 1] + word_1.length();j < sen.length();j++)
					{

						if (j == sen.length() - 1)
						{
							System.out.printf("%c\n",sen.charAt(j));
						}
						else
						{
							System.out.printf("%c",sen.charAt(j));
						}
					}
				}
			}
		}

		if (num == 0)
		{
			System.out.printf("%s\n",sen);
		}
		return 0;
	}


}

