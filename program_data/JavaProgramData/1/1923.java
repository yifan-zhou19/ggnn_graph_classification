package <missing>;

public class GlobalMembers
{
	public static int digui(int m,int n,int sum)
	{
		int i;
		sum++;
		if (Math.sqrt(m) < n)
		{
			return sum;
		}
		else
		{
			for (i = n;i <= Math.sqrt(m);i++)
			{
				if (m % i == 0)
				{
					sum = digui(m / i, i, sum);
				}
			}
			return sum;
		}
	}

	public static void Main()
	{
		int n;
		int a;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		while (n-- != 0)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a = Integer.parseInt(tempVar2);
			}
			System.out.printf("%d\n",digui(a, 2, 0));
		}
	}
}

