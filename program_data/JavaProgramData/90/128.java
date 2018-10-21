package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int t;
		int[][] a = new int[1000][2];
		int k;
		int i;
		int m;
		int n;
		int f = new int(int m,int n);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			t = Integer.parseInt(tempVar);
		}
		for (i = 0;i < t;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[i][0] = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				a[i][1] = Integer.parseInt(tempVar3);
			}
		}
		for (i = 0;i < t;i++)
		{
			m = a[i][0];
			n = a[i][1];
			k = f(m, n);
			System.out.printf("%d",k);
			if (i != t - 1)
			{
				System.out.print("\n");
			}
		}
	}
	public static int f(int m,int n)
	{
		int k = 0;

		if (m == 0 || n == 1)
		{
			k = 1;
		}
		else if (m < 0)
		{
			k = 0;
		}
		else
		{
			k = f(m, n - 1) + f(m - n, n);
		}
		return k;
	}

}

