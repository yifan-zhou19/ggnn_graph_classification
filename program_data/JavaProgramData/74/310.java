package <missing>;

public class GlobalMembers
{
	public static int a(int n)
	{
		int k;
		int i;
		int a = 1;
		k = (int)Math.sqrt(n);
		for (i = 2;i <= k;i++)
		{
			if (n % i == 0)
			{
				a = 0;
			}
		}
		return (a);
	}
	public static int b(int n)
	{
		int i;
		int j;
		int b = 1;
		int m1;
		int m2;
		j = Math.log10(n);
		for (i = 0;i <= j;i++)
		{
			m1 = n;
			m2 = n;
			m1 = m1 / Math.pow(10,i);
			m2 = m2 / Math.pow(10,j - i);
			if ((m1 - m1 / 10 * 10) != (m2 - m2 / 10 * 10))
			{
				b = 0;
			}
		}
		return (b);
	}
	public static void Main()
	{
		int m;
		int n;
		int i;
		int j;
		int sum = 0;
		int[] ans = new int[10000];
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
		for (i = m;i <= n;i++)
		{
			if (a(i) != 0 && b(i) != 0)
			{
				ans[++sum] = i;
			}
		}
		if (sum == 0)
		{
			System.out.print("no\n");
		}
		else
		{
			for (i = 1;i < sum;i++)
			{
				System.out.printf("%d,",ans[i]);
			}
			System.out.printf("%d\n",ans[sum]);
		}
	}
}

