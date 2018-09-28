package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int f = int n;
		int a;
		int b;
		for (int i = 1;i <= 6;i++)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				b = Integer.parseInt(tempVar);
			}
			a = f(b);
			System.out.printf("%d\n",a);
		}
	}
	public static int f(int n)
	{
		int i = 0;
		int m;
		int b;
		double a = 0;
		m = Math.abs(n);
		if (m == 0)
		{
			return (0);
		}
		else
		{
			while (Math.pow(10,i) <= m)
			{
				i++;
			}
			int k = 0;
			while (k < i)
			{
				b = m / Math.pow(10,i - k - 1);
				a = a + b * Math.pow(10,k);
				m = m - b * Math.pow(10,i - k - 1);
				k++;
			}
			if (n < 0)
			{
			return (-a);
			}
			else
			{
			return (a);
			}
		}
	}

}

