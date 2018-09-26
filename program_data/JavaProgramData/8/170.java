package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int[] a = new int[100];
		int[] b = new int[100];
		void sca(int x[100],int y[100]);
		void res(int x[100],int y[100]);
		void pri(int x[100],int y[100]);
		sca(a, b);
		//res (a,b);
		//pri (a,b);
	}
	public static void sca(int[] x, int[] y)
	{
		int m;
		int n;
		int i;
		int j;
		int k;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			n = Integer.parseInt(tempVar2);
		}
		//printf("%d %d",m,n);
		for (i = 1;i <= m;i++)
		{
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			x[i] = Integer.parseInt(tempVar3);
		}
		}
		//printf("%d",x[1]);
		for (i = 1;i <= n;i++)
		{
		String tempVar4 = ConsoleInput.scanfRead();
		if (tempVar4 != null)
		{
			y[i] = Integer.parseInt(tempVar4);
		}
		}
		//printf("1");
		for (i = 1;i <= m;i++)
		{
				for (j = 1;j <= m - i;j++)
				{
					if (x[j] > x[j + 1])
					{
						k = x[j];
						x[j] = x[j + 1];
						x[j + 1] = k;
					}
				}
		}
		for (i = 1;i <= m;i++)
		{
			System.out.printf("%d ",x[i]);
		}
		for (i = 1;i <= n;i++)
		{
				for (j = 1;j <= n - i;j++)
				{
					if (y[j] > y[j + 1])
					{
						k = y[j];
						y[j] = y[j + 1];
						y[j + 1] = k;
					}
				}
		}
		for (i = 1;i < n;i++)
		{
			System.out.printf("%d ",y[i]);
		}
		System.out.printf("%d",y[n]);



	}
}

