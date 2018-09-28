package <missing>;

public class GlobalMembers
{
	public static double apple(double n,double k,double start)
	{
		double result = start;
		for (int i = 1; i <= n; i++)
		{
			result = (result * n) / (n - 1) + k;
		}
		return result;


	}

	public static int Main()
	{
		double n;
		double k;
		n = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
		k = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
		for (int i = 1; ; i++)
		{
			if (apple(n, k, i) - ((int)(apple(n, k, i))) == 0)
			{
				System.out.print(((int)(apple(n, k, i))));
				break;
			}
		}




		return 0;
	}

}

