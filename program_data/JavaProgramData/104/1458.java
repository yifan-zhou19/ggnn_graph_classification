package <missing>;

public class GlobalMembers
{
	public static int Main()

	{

		int[] a = new int[100];
		int[] b = new int[100];
		int x;
		int y;
		int i;
		int j;

		x = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		y = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));

		a[1] = x;

		b[1] = y;

		for (i = 1;a[i] >= 1;i++)

		{

			a[i + 1] = a[i] / 2;

		}

		for (j = 1;b[j] >= 1;j++)

		{

			b[j + 1] = b[j] / 2;

		}

		int m;
		int n;
		int panduan = 0;

		for (m = 1;m <= i - 1;m++)

		{

			for (n = 1;n <= j - 1;n++)

			{

				if (a[m] == b[n])

				{

					panduan = 1;

						break;

				}

			}

			if (panduan == 1)
			{

				break;
			}

		}

		System.out.print(a[m]);

		return 0;

	}




}

