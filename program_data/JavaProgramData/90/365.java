package <missing>;

public class GlobalMembers
{
	public static int way(int a, int b, int c)
	{
		int num = 0;
		int j;
		if (b == 1)
		{
			return 1;
		}
		else
		{
			for (j = c ; j <= a / b ; j++)
			{
				num = num + way(a - j, b - 1, j);
			}
		}
		return num;
	}
	public static int Main()
	{
		int t;
		int m;
		int n;
		int i;
		int j;
		int sum = 0;
		int p = 1;
		t = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (j = 0 ; j < t ; j++)
		{
			m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			for (i = 1 ; i <= n ; i++)
			{
				sum = sum + way(m, i, p);
			}
			System.out.print(sum);
			System.out.print("\n");
			sum = 0;
		}
		return 0;
	}
}

