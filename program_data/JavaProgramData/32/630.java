package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		char[][] c = new char[100][105];
		int i;
		int j;
		int j1;
		int j2;
		int n;
		int len1;
		int len2;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < 2 * n;i = i + 2)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				c[i] = tempVar2.charAt(0);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				c[i + 1] = tempVar3.charAt(0);
			}
		}
		for (i = 0;i < 2 * n;i = i + 2)
		{
			len1 = String.valueOf(c[i]).length(),len2 = String.valueOf(c[i + 1]).length();
			for (j1 = len1 - 1,j2 = len2 - 1;j2 >= 0;j1--,j2--)
			{
				if (c[i][j1] >= c[i + 1][j2])
				{
					c[i][j1] = c[i][j1] - c[i + 1][j2] + 48;
				}
				else
				{
					c[i][j1] = c[i][j1] + 58 - c[i + 1][j2];
					c[i][j1 - 1] = c[i][j1 - 1] - 1;
				}
			}
			for (j = 0;j < len1;j++)
			{
				System.out.printf("%c",c[i][j]);
			}
			System.out.print("\n");
		}
	}
}

