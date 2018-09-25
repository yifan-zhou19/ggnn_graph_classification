package <missing>;

public class GlobalMembers
{
	public static int temp = 2;
	public static int sum = 0;
	public static void dg(int x)
	{
		for (int i = temp; i <= x; i++)
		{
			if (x % i == 0)
			{
				temp = i;
				if (x / i == 1)
				{
					sum++;
					temp = 2;
				}
				else
				{
					dg(x / i);
				}
			}
		}
	}
	public static int Main()
	{
		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int x;
		for (int i = 0;i < n;i++)
		{
			x = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			dg(x);
			System.out.print(sum);
			System.out.print("\n");
			sum = 0;
		}
		return 0;
	}
}

