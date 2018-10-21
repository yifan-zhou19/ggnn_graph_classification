package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		void convert(int a[5][5]);
		int[][] a = new int[N][N];
		int i;
		int j;
		for (i = 0;i < N;i++)
		{
			for (j = 0;j < N;j++)
			{
				String tempVar = ConsoleInput.scanfRead();
				if (tempVar != null)
				{
					a[i][j] = Integer.parseInt(tempVar);
				}
			}
		}
		int t;
		int n;
		int m;
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
		if (n > 4 || m > 4 || n < 0 || m < 0)
		{
		System.out.print("error");
		}
		else
		{
		for (i = 0;i < N;i++)
		{
			for (j = 0;j < N;j++)
			{
				t = a[n][j];
				a[n][j] = a[m][j];
				a[m][j] = t;
			}
		}
		}
		if (n < 5 && n >= 0 && m < 5 && m >= 0)
		{
		for (i = 0;i < N;i++)
		{
			for (j = 0;j < N - 1;j++)
			{
				System.out.printf("%d ",a[i][j]);
			}
			System.out.printf("%d",a[i][4]);
			System.out.print("\n");
		}
		}
	}
}

