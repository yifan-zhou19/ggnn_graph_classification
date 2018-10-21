package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n1;
		int k;
		int i;
		n1 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		k = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		final int n = n1;
		int[] a = new int[n + 1];
		a[n] = k;
		while (true)
		{
			a[n] += n;
			for (i = n;i > 0;i--)
			{
				if (a[i] % (n - 1) != 0)
				{
					break;
				}
				else
				{
				a[i - 1] = a[i] / (n - 1) * n + k;
				}
			}
			 if (i == 1)
			 {
		   break;
			 }
		}

		System.out.print(a[1]);
		System.in.read();
		System.in.read();
		System.in.read();
		return 0;
	}

}

