package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int i;
		int l;
		int j;
		char[][] c = new char[50][20];
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
				c[i] = tempVar2.charAt(0);
			}
		}
		for (i = 0;i < n;i++)
		{
			l = String.valueOf(c[i]).length();
			if (c[i][l - 1] == 114 || c[i][l - 1] == 121)
			{
				for (j = 0;j < l - 3;j++)
				{
					System.out.printf("%c",c[i][j]);
				}
				System.out.printf("%c\n",c[i][l - 3]);
			}
			else
			{
				for (j = 0;j < l - 4;j++)
				{
					System.out.printf("%c",c[i][j]);
				}
				System.out.printf("%c\n",c[i][l - 4]);
			}

		}
	}
}

