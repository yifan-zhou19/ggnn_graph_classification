package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int a;
		int b;
		int i;
		int j;
		int l = 0;
		int k = 0;
		for (i = 3;i <= n / 2;i = i + 2)
		{
			for (j = 2;j * j <= i;j++)
			{
				if (i % j == 0)
				{
					l = 1;
				break;
				}
			}
			if (l == 0)
			{
			   a = i;
			   b = n - a;
			}
			else
			{
				l = 0;
				continue;
			}
			for (j = 2;j * j <= b;j++)
			{
				if (b % j == 0)
				{
					k = 1;
				break;
				}
				else
				{
				k = 0;
				}
			}
			if (k == 0)
			{
				System.out.print(a);
				System.out.print(" ");
				System.out.print(b);
				System.out.print("\n");
				a = 0;
				b = 0;
				k = 0;
				l = 0;
			}
			else
			{
				continue;
			}
		}
		return 0;
	}

}

