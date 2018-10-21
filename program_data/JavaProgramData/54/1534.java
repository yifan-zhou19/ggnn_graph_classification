package <missing>;

public class GlobalMembers
{
	public static double monkey(double m,double n,double k)
	{
		m = (m / (n - 1)) * n + k;
		return (m);
	}
	public static int Main()
	{
		double i;
		double j = 1;
		double n;
		double k;
		double m;
		n = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
		k = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
		do
		{
			m = (n - 1) * j;
			for (i = 0;i < n;i++)
			{
				m = monkey(m, n, k);
				if (m - (int)m != 0)
				{
					break;
				}
			}
			j++;
		}while (m - (int)m != 0);
		System.out.print((int)m);
		System.out.print("\n");
		return 0;
	}
}

