package <missing>;

public class GlobalMembers
{
	public static int fun(int m,int n)
	{
		int i;
		int sum = 1;
		if (n == 1)
		{
			for (i = 2;i * i <= m;i++)
			{
				if (m % i == 0)
				{
				sum += fun(m / i, i);
				}
			}
		}
		else
		{
		for (i = n;i * i <= m;i++)
		{
			if (m % i == 0)
			{
				sum += fun(m / i, i);
			}
		}
		}
		return sum;
	}
	public static int Main()
	{
		int n;
		int i;
		int b;
		int[] a = new int[1000];
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < n;i++)
		{
			b = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			a[i] = fun(b, 1);
		}
		for (i = 0;i < n;i++)
		{
		System.out.print(a[i]);
		System.out.print("\n");
		}
	}

}

