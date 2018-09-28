package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int i;
		int j;
		int len;
		char[][] words = new char[50][15];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i <= n - 1;i++)
		{
			words[i] = new Scanner(System.in).nextLine();
		}
		for (i = 0;i <= n - 1;i++)
		{
			len = String.valueOf(words[i]).length();
			if (words[i][len - 1] == 'r' && words[i][len - 2] == 'e')
			{
				len = len - 2;
			}
			if (words[i][len - 1] == 'g' && words[i][len - 2] == 'n' && words[i][len - 3] == 'i')
			{
				len = len - 3;
			}
			if (words[i][len - 1] == 'y' && words[i][len - 2] == 'l')
			{
				len = len - 2;
			}
			for (j = 0;j <= len - 1;j++)
			{
				System.out.printf("%c",words[i][j]);
			}
			System.out.print("\n");
		}
	}

}

