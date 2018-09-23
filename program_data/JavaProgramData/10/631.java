package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int[] a = new int[26];
		int[] b = new int[26];
		int c;

		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));

		for (i = 1 ; i <= n ; i++)
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));

			b[i] = 1;

			c = 0;

			/////////////////////////////////////////////////
			for (j = 1 ; j < i ; j++)
			{
				if (a[j] >= a[i] != 0 && b[j] > c)
				{
					c = b[j];
				}
			}
														   //
			b[i] = c + 1;
			/////////////////////////////////////////////////

		}

		c = 0;

		for (i = 1 ; i <= n ; i++)
		{
			if (b[i] > c)
			{
				c = b[i];
			}
		}

		System.out.print(c);

		return 0;
	}

}

