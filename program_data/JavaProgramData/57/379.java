package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String str1 = new String(new char[32]);
		char[][] b = new char[50][32];
		int n;
		int i;
		int j;
		int s;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			s = Integer.parseInt(tempVar);
		}
		s = s + 1;
		for (i = 0;i < s;i++)
		{
			str1 = new Scanner(System.in).nextLine();
			n = str1.length();
			if (str1.charAt(n - 1) == 'r' && str1.charAt(n - 2) == 'e')
			{
			str1 = tangible.StringFunctions.changeCharacter(str1, n - 1, str1[n - 2] = '\0');
			}
			else if (str1.charAt(n - 1) == 'g' && str1.charAt(n - 2) == 'n' && str1.charAt(n - 3) == 'i')
			{
			str1 = tangible.StringFunctions.changeCharacter(str1, n - 1, str1[n - 2] = str1[n - 3] = '\0');
			}
			else if (str1.charAt(n - 1) == 'y' && str1.charAt(n - 2) == 'l')
			{
			str1 = tangible.StringFunctions.changeCharacter(str1, n - 1, str1[n - 2] = '\0');
			}
			for (j = 0;j < 32;j++)
			{
			b[i][j] = str1.charAt(j);
			}
		}
			for (i = 0;i < s - 1;i++)
			{
			System.out.printf("%s\n",b[i]);
			}
			System.out.printf("%s",b[s - 1]);
			return 0;
	}
}

