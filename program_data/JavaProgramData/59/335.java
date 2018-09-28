package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		final String s = "";
		char[][] s0 = new char[101][101];
		char c;
		int n;
		int m = 0;
		int i;
		int j;
		int k;
		int day;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			c = System.in.read();
			for (j = 0;j < n;j++)
			{
				s.charAt(i)[j] = System.in.read();
			}
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			day = Integer.parseInt(tempVar2);
		}
		for (k = 1;k < day;k++)
		{
			for (i = 0;i < n;i++)
			{
				for (j = 0;j < n;j++)
				{
					if (s.charAt(i)[j] != '.')
					{
						s0[i][j] = s.charAt(i)[j];
					}
					else
					{
						if (s.charAt(i + 1)[j] == '@' || s.charAt(i - 1)[j] == '@' || s.charAt(i)[j + 1] == '@' || s.charAt(i)[j - 1] == '@')
						{
							s0[i][j] = '@';
						}
						else
						{
							s0[i][j] = '.';
						}
					}
				}
			}
			for (i = 0;i < n;i++)
			{
				for (j = 0;j < n;j++)
				{
					s.charAt(i)[j] = s0[i][j];
				}
			}
		}
		for (i = 0;i < n;i++)
		{
			for (j = 0;j < n;j++)
			{
				if (s.charAt(i)[j] == '@')
				{
					m++;
				}
			}
		}
		System.out.printf("%d\n",m);
	}

}

