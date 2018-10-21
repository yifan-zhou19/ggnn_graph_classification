package <missing>;

public class GlobalMembers
{
	public static void fenjie(int i, int a)
	{
		for (; i <= Math.sqrt(a) ; i++)
		{
			if (a % i == 0)
			{
				k++;

				fenjie(i, a / i);
			}
		}

	}

	public static int k = 1;

	public static int Main()
	{
		int n;
		int m;
		int a;

		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));

		for (m = 1 ; m <= n ; m++)
		{
			a = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));

			fenjie(2, a);

			System.out.print(k);
			System.out.print("\n");

			k = 1;

		}

		return 0;
	}



}

