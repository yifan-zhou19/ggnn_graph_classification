package <missing>;

public class GlobalMembers
{
	public static void factor(int a, int k)
	{
		int b;
		int j;
		b = (int)Math.sqrt((double)a);
		for (j = k; j <= b; j++)
		{
			if (a % j == 0)
			{
				sum++;
				factor(a / j, j);
			}
		}
		j = k;
	}
	public static int sum = 0;
	public static int Main()
	{
		int n;
		int a;
		int i = 0;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1; i <= n; i++)
		{
			a = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			factor(a, 2);
			System.out.print(sum + 1);
			System.out.print("\n");
			sum = 0;
		}
		return 0;
	}




}

