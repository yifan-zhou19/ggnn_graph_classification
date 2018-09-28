package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int i;
		int j;
		int[] l = new int[51];
		char[][] s = new char[51][21];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 1;i <= n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				s[i] = tempVar2.charAt(0);
			}
			l[i] = String.valueOf(s[i]).length();
			if (s[i][l[i] - 1] == 'r' && s[i][l[i] - 2] == 'e')
			{
				s[i][l[i] - 2] = '\0';
			}
			else if (s[i][l[i] - 1] == 'y' && s[i][l[i] - 2] == 'l')
			{
				s[i][l[i] - 2] = '\0';
			}
			else if (s[i][l[i] - 1] == 'g' && s[i][l[i] - 2] == 'n' && s[i][l[i] - 3] == 'i')
			{
				s[i][l[i] - 3] = '\0';
			}
		}
		for (i = 1;i <= n;i++)
		{
			for (j = 0;s[i][j] != '\0';j++)
			{
				System.out.printf("%c",s[i][j]);
			}
			System.out.print("\n");
		}
	}




}

