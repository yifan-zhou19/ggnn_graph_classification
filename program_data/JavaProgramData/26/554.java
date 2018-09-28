package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		char[][] words = new char[200][30];
		String input = new String(new char[10000]);
		int len;
		int i = 0;
		int j = 0;
		int k;
		input = new Scanner(System.in).nextLine();
		len = input.length();
		for (k = 0;k <= len;k++)
		{
			if (input.charAt(k) == ' ')
			{
				if (j == 0)
				{
					continue;
				}
				words[i++][j] = '\0';
				j = 0;
			}
			else
			{
				words[i][j++] = input.charAt(k);
			}
		}
		for (k = 0;k <= i;k++)
		{
		if (k != i)
		{
			System.out.printf("%s ",words[k]);
		}
		else
		{
			System.out.printf("%s\n",words[k]);
		}
		}
		return 0;
	}
}
