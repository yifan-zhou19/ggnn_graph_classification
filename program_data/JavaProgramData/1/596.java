package <missing>;

public class GlobalMembers
{
	public static int cut(int m,int l)
	{
		int sum = 1;
		for (int i = l;i <= Math.sqrt((double)m / l);i++)
		{
			if ((m / l) % i == 0)
			{
			sum += cut(m / l, i);
			}
		}
		return sum;
	}

	public static int Main()
	{
		int n;
			n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	for (int i = 0;i < n;i++)
	{
			int t = 0;
			t = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		System.out.print(cut(2 * t, 2));
		if (i < n - 1)
		{
			System.out.print("\n");
		}
	}

	}

}

