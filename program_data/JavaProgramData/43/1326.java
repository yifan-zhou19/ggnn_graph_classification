package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m;
		int j;
		int i;
		int p;
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 3;i <= m / 2;i += 2)
		{
			p = 0;
			for (j = 2;j <= Math.sqrt(i);j++)
			{
				if (i % j == 0)
				{
				p = 1;
				break;
				}
			}
			for (j = 2;j <= Math.sqrt(m - i);j++)
			{
				if ((m - i) % j == 0)
				{
				p = 1;
				break;
				}
			}
			if (p == 1)
			{
				continue;
			}
			else
			{
				System.out.print(i);
				System.out.print(" ");
				System.out.print(m - i);
				System.out.print("\n");
			}
		}
		return 0;
	}

}

