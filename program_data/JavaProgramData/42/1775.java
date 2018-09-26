package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		final int max_size = 100000;
		int[] a = new int[max_size];

		int len;
		int k;
		len = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int i = 0; i < len; ++i)
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		k = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));

		int r1;
		int r2;
		r1 = -1;
		for (int i = 0; i < len; ++i)
		{
		  if (a[i] != k)
		  {
				   ++r1;
				   a[r1] = a[i];
		  }
		}

		for (int i = 0; i <= r1; ++i)
		{
			if (i != 0)
			{
				  System.out.print(" ");
			}
			System.out.print(a[i]);
		}
		return 0;
	}

}

