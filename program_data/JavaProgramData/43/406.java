package <missing>;

public class GlobalMembers
{
	public static int prime(int k)
	{
		int h;
		int i;
		int g;
		h = Math.sqrt(k);
		g = 1;
		for (i = 2;i <= h;i++)
		{
			if (k % i == 0)
			{
			g = 0;
		break;
			}
		}
		if (g == 0)
		{
			return 0;
		}
		else
		{
			return 1;
		}
	}
	public static int Main()
	{
		int m;
		int j;
		int l;
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (j = 3;j <= m / 2;j = j + 2)
		{
			l = m - j;
			if (prime(j) == 1 && prime(l) == 1)
			{
				System.out.print(j);
				System.out.print(" ");
				System.out.print(l);
				System.out.print("\n");
			}
			else
			{
				continue;
			}
		}
			return 0;
	}

}

