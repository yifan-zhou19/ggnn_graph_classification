package <missing>;

public class GlobalMembers
{
	public static int replace(int[][] b, int n1, int m1)
	{
		int ret;
		int[] dummy = new int[5];
		int k;
		if (n1 < 0 || n1>4 || m1 < 0 || m1>4)
		{
			ret = 0;
		}
		else
		{
			for (k = 0;k < 5;k++)
			{
				dummy[k] = b[n1][k];
				b[n1][k] = b[m1][k];
				b[m1][k] = dummy[k];
				ret = 1;
			}
		}
		return (ret);
	}
	public static void Main()
	{
		int[][] a = new int[5][5];
		int n;
		int m;
		int i;
		int j;
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
		if (replace(a, n, m) == 0)
		{
			System.out.print("error\n");
		}
		else
		{
			for (i = 0;i < 5;i++)
			{
			for (j = 0;j < 5;j++)
			{
				if (j == 4)
				{
					System.out.printf("%d\n",a[i][j]);
				}
				else
				{
					System.out.printf("%d ",a[i][j]);
				}
			}
			}
		}
	}

}

