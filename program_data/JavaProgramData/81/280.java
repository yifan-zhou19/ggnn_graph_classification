package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int[][] s = new int[5][5];
		int[] t = new int[5];
		int m;
		int n;
		int i;
		int j;
		int c = new int(int x,int y);
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
			m = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead(" ");
		if (tempVar3 != null)
		{
			n = Integer.parseInt(tempVar3);
		}
		if (c(m, n) != 0)
		{
			for (i = 0;i < 5;i++)
			{
				t[i] = s[m][i];
				s[m][i] = s[n][i];
				s[n][i] = t[i];
			}
			for (i = 0;i < 5;i++)
			{
				for (j = 0;j < 4;j++)
				{
					System.out.printf("%d ",s[i][j]);

				}
				System.out.printf("%d\n",s[i][4]);
			}
		}
		else
		{
			System.out.print("error");
		}
	}
	public static int c(int x,int y)
	{
		if (x >= 0 && x < 5 && y < 5 && y >= 0)
		{
			return 1;
		}

		else
		{
			return 0;
		}
	}
}

