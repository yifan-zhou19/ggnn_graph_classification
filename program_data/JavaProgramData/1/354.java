package <missing>;

public class GlobalMembers
{
	public static int number = 0;
	public static int l;
	public static void sort(int n)
	{
		int i;
		for (i = l;n / i >= i;i++)
		{
			if (n % i == 0)
			{
				l = i;
				sort(n / i);
				if (n / i == 1)
				{
					   number++;
				}
			}
		}
		number++;
	}
	public static int Main()
	{
		int n;
		int m;
		int k;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (k = 0;k < n;k++)
		{
			l = 2;
			number = 0;
			m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			sort(m);
			System.out.print(number);
			System.out.print("\n");
		}
		return 0;
	}


}

