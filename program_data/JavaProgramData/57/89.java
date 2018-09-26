package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		char[][] s = new char[50][51];
		char[][] s2 = new char[50][51];
		int i;
		int n;
		int l;
		int j;
		int k;
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
			l = String.valueOf(s[i]).length();
			if ((s[i][l - 3] == 'i') && (s[i][l - 2] == 'n'))
			{
				s[i][l - 3] = '\0';
			}
			else
			{
				s[i][l - 2] = '\0';
			}
		}
		for (i = 0;i < n;i++)
		{
			System.out.printf("%s\n",s[i]);
		}
	}

}

