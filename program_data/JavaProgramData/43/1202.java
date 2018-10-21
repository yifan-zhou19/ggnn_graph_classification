package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m;
		int i;
		int j;
		int a;
		int b;
		int p;
		int q;
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 3; i <= m / 2; i = i + 2)
		{
			p = 0;
			q = 0;
			for (a = 2; a < i ; a++)
			{
				if (i % a == 0)
				{
					p = 1;
				}
			}
			if (p == 0)
			{
				j = m - i;
				for (b = 2 ; b < j ; b++)
				{
					if (j % b == 0)
					{
						q = 1;
					}
				}
				if (q == 0)
				{
					System.out.print(i);
					System.out.print(' ');
					System.out.print(j);
					System.out.print("\n");
				}
			}
		}
		return 0;
	}




}

