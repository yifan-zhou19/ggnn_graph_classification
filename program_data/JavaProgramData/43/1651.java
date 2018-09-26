package <missing>;

public class GlobalMembers
{
	public static int Main()

	{

		int[] a = new int[20000];
		int[] b = new int[20000];
		int i;
		int m;
		int j;
		int k;

		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));

		for (i = 3;i < m;i = i + 2)

		{

			a[i] = i;

			for (j = 3;j < i;j = j + 2)

			{

					if (i % j == 0)
					{
					a[i] = 0;
					}


			}

		}

		for (i = 3;i <= m / 2;i = i + 2)
		{
		if (a[i] == i && a[m - i] == m - i)

		{

					System.out.print(a[i]);
					System.out.print(" ");
					System.out.print(a[m - i]);
					System.out.print("\n");


		}
		}
				return 0;
	}
}

