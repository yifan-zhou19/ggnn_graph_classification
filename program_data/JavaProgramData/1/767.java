package <missing>;

public class GlobalMembers
{
	public static int divide(int n,int j)
	{
		int sum = 1;
		int i;
		int s;
		int p;
		int k;
		s = Math.sqrt(n);
		for (i = j;i <= s;i++)
		{
			if (n % i == 0)
			{
				p = n / i;
				k = i;
				sum = sum + divide(p, i);
			}
		}
		return sum;
	}
	public static int Main()
	{
		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int k;
		int m;
		int p;
		for (k = 0;k < n;k++)
		{
			m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			p = divide(m, 2);
			System.out.print(p);
			System.out.print("\n");
		}
		return 0;
	}





}

