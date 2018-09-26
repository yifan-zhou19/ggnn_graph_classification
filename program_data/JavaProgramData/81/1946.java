package <missing>;

public class GlobalMembers
{
	public static int panduan(int m,int n)
	{
		if (m < 5 && n < 5)
		{
			return 1;
		}
		return 0;
	}
	public static void Main(String[] args)
	{
		int[][] a = new int[5][5];
		int m;
		int n;
		int k;
		int w;
		int i;
		int t;
		for (k = 0;k < 5;k++)
		{
			for (w = 0;w < 5;w++)
			{
				String tempVar = ConsoleInput.scanfRead();
				if (tempVar != null)
				{
					a[k][w] = Integer.parseInt(tempVar);
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
		if (panduan(m, n) == 0)
		{
			System.out.print("error\n");
		}
		else
		{
			for (i = 0;i < 5;i++)
			{
				t = a[m][i];
				a[m][i] = a[n][i];
				a[n][i] = t;
			}
			for (k = 0;k < 5;k++)
			{
				for (w = 0;w < 5;w++)
				{
					if (w != 4)
					{
					System.out.printf("%d ",a[k][w]);
					}
					else
					{
						System.out.printf("%d\n",a[k][w]);
					}
				}
			}
		}
	}

}

