package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int l;
	char[][] s = new char[52][33];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				s[i] = tempVar2.charAt(0);
			}
		}
		for (i = 0;i < n;i++)
		{
			l = String.valueOf(s[i]).length();
			for (j = l - 3;s[i][j] != '\0';j++)
			{
			if ((s[i][j] == 'i') && (s[i][j + 1] == 'n') && (s[i][j + 2] == 'g'))
			{
				s[i][j] = '\0';
			}
			}
			for (j = l - 2;s[i][j] != '\0';j++)
			{
		 if ((s[i][j] == 'e') && (s[i][j + 1] == 'r') || (s[i][j] == 'l') && (s[i][j + 1] == 'y'))
		 {
						s[i][j] = '\0';
		 }
			}
		}
		for (i = 0;i < n;i++)
		{
			System.out.printf("%s\n",s[i]);
		}
		return 0;
	}
}

