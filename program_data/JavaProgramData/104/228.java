package <missing>;

public class GlobalMembers
{
	public static int go(int x)
	{

		int y = 0;

		if (x % 2 == 1)
		{
			y = (x - 1) / 2;
		}
		else
		{
			y = x / 2;
		}
		return y;
	}

	public static int Main()
	{

		int[] a = new int[10];
		int[] b = new int[10];
		int same = 1;
		int p = 0;

		a[0] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		b[0] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));

		int i = 0;
		int j = 0;
		int k = 0;

		while ((a[i] > 1) || (b[i] > 1))
		{
			p = 0;

			for (j = 0; j <= i; j++)
			{
				if (p == 0)
				{
					for (k = 0; k <= i; k++)
					{
						if (a[j] == b[k])
						{
							same = a[j];
							p = 1;
						}
					}
				}
			}

			a[i + 1] = go(a[i]);
			b[i + 1] = go(b[i]);


			i++;
		}

		System.out.print(same);

	}
}

