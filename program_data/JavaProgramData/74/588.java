package <missing>;

public class GlobalMembers
{
	public static int ss(int x)
	{
		int i;
		int a = 0;
		double y;
		y = x;
		if (x > 2 && x % 2 == 0)
		{
			a++;
		}
		else
		{
			for (i = 3;i < Math.sqrt(y) + 1;i++)
			{
				if (x % i == 0)
				{
					a++;
				}
			}
		}
		return a;
	}

	public static int hw(int x)
	{
		int[] a = new int[10];
		int[] b = new int[10];
		int i;
		int j = 0;
		int n = 1000000000;
		int m = 0;
		int jl = 0;
		for (i = 0;i < 9;i++)
		{
			n = n / 10;
			if (x / n != 0 || jl != 0)
			{
				a[m] = x / n;
				m++;
				x = x - (x / n) * n;
				jl++;
			}
		}
		for (i = 0;i < m;i++)
		{
			b[m - 1 - i] = a[i];
		}
		for (i = 0;i < m;i++)
		{
			if (b[i] != a[i])
			{
				j++;
			}
		}
		return j;
	}

	public static int Main()
	{
		int m;
		int n;
		int i = 0;
		int js = 0;
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		m--;
		while (m++,m <= n)
		{
			//cout<<m<<"-"<<ss(m)<<"-"<<hw(m)<<endl;
			if (ss(m) == 0 && hw(m) == 0)
			{
				if (i == 0)
				{
					System.out.print(m);
					i++;
					js++;
				}
				else
				{
					System.out.print(",");
					System.out.print(m);
				}
			}
		}
		if (js == 0)
		{
			System.out.print("no");
			System.out.print("\n");
		}
		return 0;
	}

}

