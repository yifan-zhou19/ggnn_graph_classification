package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int f = new int(int n,int m,int a[5][5]);
		int[][] a = new int[5][5];
		int i;
		int j;
		int t;
		int n;
		int m;
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
		t = f(n, m, a);
		if (t == 0)
		{
			System.out.print("error");
		}
	}

	public static int f(int n, int m, int[][] a)
	{
		int t;
		int i;
		if (n < 5 && m < 5)
		{
			for (i = 0;i < 5;i++)
			{
			if (i == n)
			{
				System.out.printf("%d %d %d %d %d\n",a[m][0],a[m][1],a[m][2],a[m][3],a[m][4]);
			}
			else if (i == m)
			{
				System.out.printf("%d %d %d %d %d\n",a[n][0],a[n][1],a[n][2],a[n][3],a[n][4]);
			}
			else
			{
				System.out.printf("%d %d %d %d %d\n",a[i][0],a[i][1],a[i][2],a[i][3],a[i][4]);
			}
			}
		}
		else
		{
			t = 0;
		}
		return (t);
	}


}

