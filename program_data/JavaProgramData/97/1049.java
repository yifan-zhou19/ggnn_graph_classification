package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));

		int[] a = new int[6];
		int[] b = new int[6];
		int i;

		b[0] = n;

		for (i = 0; i < 6; i++)
		{
			if (i == 0)
			{
				b[i + 1] = b[i] % 100;
				a[i] = (b[i] - b[i + 1]) / 100;
			}
			if (i == 1)
			{
				b[i + 1] = b[i] % 50;
				a[i] = (b[i] - b[i + 1]) / 50;
			}
			if (i == 2)
			{
				b[i + 1] = b[i] % 20;
				a[i] = (b[i] - b[i + 1]) / 20;
			}
			if (i == 3)
			{
				b[i + 1] = b[i] % 10;
				a[i] = (b[i] - b[i + 1]) / 10;
			}
			if (i == 4)
			{
				b[i + 1] = b[i] % 5;
				a[i] = (b[i] - b[i + 1]) / 5;
			}

		}

		for (i = 0; i <= 4; i++)
		{
			System.out.print(a[i]);
			System.out.print("\n");
		}

		System.out.print(b[5]);
		System.out.print("\n");

		return 0;

	}
}

