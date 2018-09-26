package <missing>;

public class GlobalMembers
{
	public static int f(int m,int n)
	{
		int sum;
		if (n == 1 || m == 0 || m == 1)
		{
			sum = 1;
		}
		else if (m >= n != 0 && n > 0)
		{
			sum = f(m, n - 1) + f(m - n, n);
		}
		else if (m < n && m >= 0)
		{
			sum = f(m, n - 1);
		}
		return (sum);
	}
	public static int Main()
	{
		int x;
		int i;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			x = Integer.parseInt(tempVar);
		}
		int[] m = new int[x];
		int[] n = new int[x];
		for (i = 0;i < x;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				m[i] = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				n[i] = Integer.parseInt(tempVar3);
			}
		}
		for (i = 0;i < x;i++)
		{
			System.out.printf("%d\n",f(m[i], n[i]));
		}
	}
}

