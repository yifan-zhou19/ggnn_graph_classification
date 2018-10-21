package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] c = new int[8][8];
		int i;
		int j;
		int a;
		int b;
		int max;
		int m = 0;
		int n = 0;
		int t = 0;
		int l = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(",");
		if (tempVar2 != null)
		{
			b = Integer.parseInt(tempVar2);
		}
		for (i = 0;i < a;i++)
		{
			for (j = 0;j < b;j++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					c[i][j] = Integer.parseInt(tempVar3);
				}
			}
		}
		for (i = 0;i < a;i++)
		{
			max = c[i][0];
			for (j = 1;j < b;j++)
			{
				if (max < c[i][j])
				{
					max = c[i][j];
					m = i;
					n = j;
				}
			}
				t = 0;
				for (i = 0;i < a;i++)
				{
					if (c[m][n] < c[i][n])
					{
						t++;
					}
				}
				if (t == a - 1)
				{
					System.out.printf("%d+%d",m,n);
					l++;
				}
		}
		if (l == 0)
		{
			System.out.print("No");
		}
		return 0;
	}
}

