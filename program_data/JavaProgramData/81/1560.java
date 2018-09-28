package <missing>;

public class GlobalMembers
{
	public static int f(int[][] c, int a, int b)
	{
		int i;
		int j;
		int k;
		if (a > 4 || b > 4)
		{
			k = 0;
		}
		else
		{
		for (i = 0;i < 5;i++)
		{
			j = c[a][i];
			c[a][i] = c[b][i];
			c[b][i] = j;
		}
		k = 1;
		}
		return (k);
	}
	public static void Main()
	{
		int i;
		int j;
		int m;
		int n;
		int[][] d = new int[5][5];
		 for (i = 0;i < 5;i++)
		 {
			 for (j = 0;j < 5;j++)
			 {
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			d[i][j] = Integer.parseInt(tempVar);
		}
			 }
		 }
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			m = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			n = Integer.parseInt(tempVar3);
		}
		if (f(d, m, n) == 0)
		{
			System.out.print("error");
		}
		else
		{
			for (i = 0;i < 5;i++)
			{
			 for (j = 0;j < 4;j++)
			 {
		System.out.printf("%d ",d[i][j]);
			 }
			 System.out.printf("%d",d[i][4]);
			 System.out.print("\n");
			}
		}
	}
}

