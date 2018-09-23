package <missing>;

public class GlobalMembers
{
	public static int jd(int m,int x)
	{
		if (m == 0)
		{
			return x;
		}
		if (x == 1)
		{
			return 1;
		}
		else
		{
			return jd(m - 1, x / 2);
		}
	}
	public static int Main()
	{
		int a;
		int b;
		a = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		b = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int n = 0;
		for (int i = 0;i <= a;i++)
		{
			if (n == 1)
			{
				break;
			}
			for (int k = 0;k < b;k++)
			{
				if (jd(i, a) == jd(k, b))
				{
					System.out.print(jd(i, a));
					System.out.print("\n");
					n = 1;
					break;
				}

			}
		}
	return 0;
	}
}

