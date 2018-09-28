package <missing>;

public class GlobalMembers
{
	public static int Main()

	{


		int[][] a = new int[100][3];
		int[] b = new int[100];
		int i;
		int n;
		int sum = 0;

		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));

		for (i = 0;i < n;i++)

		{

			a[i][0] = i + 1;

			a[i][1] = a[i][0] % 10;

			a[i][2] = a[i][0] / 10;

		}

		for (i = 0;i < n;i++)

		{

			if (a[i][0] % 7 != 0 && a[i][1] != 7 && a[i][2] != 7)
			{

				b[i] = a[i][0];
			}

		}

		for (i = 0;i < n;i++)
		{

			sum = sum + b[i] * b[i];
		}

		System.out.print(sum);



		return 0;

	}
}

