package <missing>;

public class GlobalMembers
{
	public static int a;
	public static int n;
	public static int sum = 0;
	public static void t(int m)
	{
		int i;
		int j;
		for (i = m;i <= a;i++)
		{
			if (a % i == 0)
			{
				a = a / i;
				if (a == 1)
				{
					sum += 1;
				}
				else
				{
					t(i);
				}
					a = a * i;
			}
		}
	}

	public static int Main()
	{
		int k;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (k = 0;k < n;k++)
		{
			sum = 0;
			a = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			t(2);
			System.out.print(sum);
			System.out.print("\n");
		}
		return 0;
	}
}

