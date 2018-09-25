package <missing>;

public class GlobalMembers
{
	public static int Main()
	{

		int n;
		int fail_n;
		int[] fail = new int[60];
		int i;
		int k;
		int a;
		int x;
		int b;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));

		for (i = 0;i < n;i++)

		{
			x = 0;
		  fail_n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));

			for (k = 0;k < fail_n;k++)
			{
				fail[k] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}

			for (k = 0;k < fail_n + 1;k++)
			{

				a = 0;
				b = 0;
				if (fail[k] + 3 * (k + 1) > 60 && fail[k] + 3 * k < 60)
				{
					b = 1;
					break;
				}
				if (fail[k] + 3 * (k + 1) <= 60)
				{
					a = 1;
				}
				else
				{
					a = 2;
					x = fail[k - 1] + 3 * (k);
					break;
				}

			}

			if (b == 1)
			{
				System.out.print(fail[k]);
				System.out.print("\n");
			}

			if (a == 1)
			{
				System.out.print(60 - 3 * fail_n);
				System.out.print("\n");
			}
			if (a == 2)
			{
				System.out.print(fail[k - 1] + (60 - x));
				System.out.print("\n");
			}




		}

	   return 0;
	}

}

