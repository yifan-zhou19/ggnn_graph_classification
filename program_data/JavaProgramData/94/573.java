package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int n;
		int j;
		int k = 0;
		int p;
		int[] a = new int[500];
		int[] b = new int[500];
		for (i = 0 ; i < 500 ; i++)
		{
			b[i] = 10000000;
		}
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0 ; i < n ; i++)
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		for (j = 0 ; j < n ; j++)
		{
			if (a[j] % 2 == 1)
			{
				b[k] = a[j];
				k++;
			}
		}
		for (i = 0 ; i < n - 1 ; i++)
		{
			for (j = 0 ; j < n - i - 1 ; j++)
			{
				if (b[j] > b[j + 1])
				{
					p = b[j];
					b[j] = b[j + 1];
					b[j + 1] = p;
				}
			}
		}
		for (i = 0 ; i < k - 1 ; i++)
		{
			System.out.print(b[i]);
			System.out.print(",");
		}
		System.out.print(b[k - 1]);
		return 0;
	}
}

