package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[45];
		int n;


		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));

		a[0] = 1;

		for (int i = 0; i < n; i++)
		{
			int bit = 0;
			int p;

			for (int j = 0; j <= 40; j++)
			{
				p = a[j] * 2 + bit;
				a[j] = p % 10;
				bit = p / 10;
			}
		}

		int start;

		for (int i = 40; i >= 0; i--)
		{
		if (a[i] != 0)
		{
			start = i;
			break;
		}
		}

		for (int i = start; i >= 0; i--)
		{
		System.out.print(a[i]);
		}

		return 0;
	}
}

