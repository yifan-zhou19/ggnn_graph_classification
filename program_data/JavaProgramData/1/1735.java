package <missing>;

public class GlobalMembers
{
	public static int sum = 0;
	public static void f(int n,int i)
	{
		if (n == 1)
		{
			sum++;
		}
		while (i <= n)
		{
			if (n % i == 0)
			{
				f(n / i, i);
			}
			i++;
		}
		return;
	}
	public static int Main()
	{

		int t = 0;
		t = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		while (t-- != 0)
		{
			int n = 0;
			n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			int i = 2;
			int result = 1;

		   for (i = 2;i <= n / 2;i++)
		   {
				if (n % i == 0)
				{
					sum = 0;
					f(n / i, i);
					result = result + sum;
				}

		   }
			System.out.print(result);
			System.out.print("\n");
		}
		return 0;
	}

}

