package <missing>;

public class GlobalMembers
{
	public static int num(int m,int n,int sum)
	{
		if (m == 1 || n == 1)
		{
			sum++;
			return sum;
		}
		if (m < n)
		{
			sum = num(m, n - 1, sum);
		}
		else if (m == n)
		{
			sum = 1 + num(m, n - 1, sum);
		}
		if (m > n)
		{
			sum = num(m, n - 1, sum);
			sum = num(m - n, n, sum);
		}
		return sum;
	}

	public static void Main()
	{
		int i;
		int t;
		int m;
		int n;
		int sum = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			t = Integer.parseInt(tempVar);
		}
		for (i = 0;i < t;i++)
		{
			sum = 0;
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				m = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				n = Integer.parseInt(tempVar3);
			}
			sum = num(m, n, sum);
			System.out.printf("%d\n",sum);
		}
	}
}

