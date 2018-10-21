package <missing>;

public class GlobalMembers
{
	public static int change(int a,int b)
	{
		int v = 0;
		if ((a >= 0) && (a < 5) && (b >= 0) && (b < 5))
		{
			v = 1;
		}
		return (v);
	}
	public static void Main()
	{
		int n;
		int m;
		int i;
		int j;
		int[] t = new int[5];
		int[][] a = new int[5][5];
		for (i = 0;i < 5;i++)
		{
			for (j = 0;j < 5;j++)
			{
				String tempVar = ConsoleInput.scanfRead();
				if (tempVar != null)
				{
					a[i][j] = Integer.parseInt(tempVar);
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
			if (change(n, m) == 0)
			{
				System.out.print("error");
			}
			else if (change(n, m) == 1)
			{
				for (i = 0;i < 5;i++)
				{
					t[i] = a[n][i];
					a[n][i] = a[m][i];
					a[m][i] = t[i];
				}
			for (i = 0;i < 5;i++)
			{
				for (j = 0;j < 4;j++)
				{
				System.out.printf("%d ",a[i][j]);
				}
				System.out.printf("%d",a[i][4]);
				System.out.print("\n");
			}
			}

	}
}

