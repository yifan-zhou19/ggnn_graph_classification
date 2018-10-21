package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		char[][] z = new char[2][200];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			z[0] = tempVar.charAt(0);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			z[1] = tempVar2.charAt(0);
		}
		int i = 0;
		int j = 0;
		char e;
		int n = String.valueOf(z[0]).length();
		for (i = 1;i <= n;i++)
		{
			for (j = 0;j < n - i;j++)
			{
				if (z[0][j] <= z[0][j + 1])
				{
					e = z[0][j];
					z[0][j] = z[0][j + 1];
					z[0][j + 1] = e;
				}
			}
		}
		for (i = 1;i <= n;i++)
		{
			for (j = 0;j < n - i;j++)
			{
				if (z[1][j] <= z[1][j + 1])
				{
					e = z[1][j];
					z[1][j] = z[1][j + 1];
					z[1][j + 1] = e;
				}
			}
		}
		if (strcmp(z[1],z[0]) == 0)
		{
			System.out.print("YES");
		}
		else
		{
			System.out.print("NO");
		}
		return 0;
	}


}

