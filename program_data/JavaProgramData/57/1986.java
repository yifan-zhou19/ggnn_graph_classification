package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int n;
		int[] len = new int[50];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		char[][] c = new char[50][50];
		char[][] s = new char[50][50];
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				s[i] = tempVar2.charAt(0);
			}
			len[i] = String.valueOf(s[i]).length();
		}
		for (j = 0;j < n;j++)
		{
			if (s[j][len[j] - 1] == 'r')
			{
				for (i = 0;i < len[j] - 2;i++)
				{
					c[j][i] = s[j][i];
				}
				c[j][i] = '\0';
			}
			if (s[j][len[j] - 1] == 'g')
			{
				for (i = 0;i < len[j] - 3;i++)
				{
					c[j][i] = s[j][i];
				}
				c[j][i] = '\0';
			}
			if (s[j][len[j] - 1] == 'y')
			{
				for (i = 0;i < len[j] - 2;i++)
				{
					c[j][i] = s[j][i];
				}
				c[j][i] = '\0';
			}
			System.out.printf("%s\n",c[j]);
		}
		return 0;
	}


}

