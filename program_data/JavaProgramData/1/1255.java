package <missing>;

public class GlobalMembers
{
	public static int[] b = new int[40000];
	public static void zhishu(int n)
	{
		 int i;
		 int j;
		 for (i = 2;i < Math.sqrt(n);i++)
		 {
						 for (j = 2;j < n / i + 1;j++)
						 {
							 b[i * j] = 1;
						 }
		 }
	}
	public static int fenjie(int n,int m)
	{
		int s = 0;
		int i;
		if (n < m)
		{
			return 0;
		}
		if (n == m || b[n] == 0)
		{
			return 1;
		}
		for (i = m;i < n;i++)
		{
			if (n % i == 0)
			{
					  s = s + fenjie(n / i, i);
			}
		}
		return s + 1;
	}
	public static int Main()
	{
		int n;
		int i;
		int max = 0;
		int[] a = new int[1000];
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < n;i++)
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			if (a[i] > max)
			{
				max = a[i];
			}
		}
		zhishu(max);
		for (i = 0;i < n;i++)
		{
			System.out.print(fenjie(a[i], 2));
			System.out.print("\n");
		}
		return 0;
	}

}

