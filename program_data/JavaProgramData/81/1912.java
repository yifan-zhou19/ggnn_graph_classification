package <missing>;

public class GlobalMembers
{
	public static int f(int[][] s, int n, int m)
	{
		int i;
		int j;
		int[][] a = new int[5][5];
		if (m < 5 && n >= 0)
		{
			for (j = 0;j < 5;j++)
			{
				a[0][j] = s[n][j];
				s[n][j] = s[m][j];
				s[m][j] = a[0][j];
			}
			return 1;
		}
		if (m >= 5 || n < 0)
		{
			return 0;
		}
	}
	public static int Main()
	{
		int f = new int(int s[5][5],int n, int m);
		int i;
		int j;
		int n;
		int m;
		int[][] s = new int[5][5];
		for (i = 0;i < 5;i++)
		{
			for (j = 0;j < 5;j++)
			{
				String tempVar = ConsoleInput.scanfRead();
				if (tempVar != null)
				{
					s[i][j] = Integer.parseInt(tempVar);
				}
			}
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			n = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead(" ");
		if (tempVar3 != null)
		{
			m = Integer.parseInt(tempVar3);
		}
		if (f(s, n, m) == 1)
		{
			for (i = 0;i < 5;i++)
			{
				for (j = 0;j < 4;j++)
				{
					System.out.printf("%d ",s[i][j]);
				}
				System.out.printf("%d",s[i][4]);
				System.out.print("\n");
			}
		}
		if (f(s, n, m) == 0)
		{
			System.out.print("error");
		}
		return 0;
	}
}

