package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int a;
		int b;
		int i;
		int k;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (a = 2;a <= (n / 2);a++)
		{
			int j = 0;
			b = n - a;
			for (i = 2;i <= Math.sqrt(a);i++)
			{
				if (a % i == 0)
				{
					j = 1;
				}
			}
				for (k = 2;k <= Math.sqrt(b);k++)
				{
					if (b % k == 0)
					{
						j = 1;
					}
				}


			if (j == 0)
			{
				System.out.print(a);
				System.out.print(" ");
				System.out.print(b);
				System.out.print("\n");
			}
		}
		return 0;
	}
}

