package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int empty = new int(int m,int n);
		int full = new int(int m,int n);
		int i;
		int n;
		int[][] num = new int[20][2];
		int[] z = new int[20];

		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i <= n - 1;i++)
		{
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			num[i][1] = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead(" ");
		if (tempVar3 != null)
		{
			num[i][0] = Integer.parseInt(tempVar3);
		}
		z[i] = full(num[i][0], num[i][1]) + empty(num[i][0], num[i][1]);
		}
		for (i = 0;i <= n - 1;i++)
		{
		System.out.printf("%d\n",z[i]);
		}
		return 0;
	}
	public static int full(int m,int n)
	{
		int empty = new int(int m,int n);
		int result;
		if (m < n)
		{
			result = full(m, n - m) + empty(m, n - m);
		}
		if (m == n)
		{
			result = 1;
		}
		if (m > n)
		{
			result = 0;
		}
		return (result);
	}
	public static int empty(int m,int n)
	{
	int result;
	if (m == 1)
	{
		result = 0;
	}
	else
	{
		result = full(m - 1, n) + empty(m - 1, n);
	}
	return (result);
	}

}

