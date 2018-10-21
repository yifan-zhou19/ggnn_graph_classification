package <missing>;

public class GlobalMembers
{
	public static int reverse(int p)
	{
		int m = 0;
		int k;
		k = Math.abs(p);
		if (p != 0)
		{
			while (k != 0)
			{
				m = m * 10 + k % 10;
				k = k / 10;
			}
			m = m * (Math.abs(p) / p);
		}
		else
		{
			m = 0;
		}
		return m;
	}
	public static int Main()
	{
		int num;
		int i;
		for (i = 0;i < 6;i++)
		{
			num = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			System.out.print(reverse(num));
			System.out.print("\n");
		}
		return 0;
	}
}

