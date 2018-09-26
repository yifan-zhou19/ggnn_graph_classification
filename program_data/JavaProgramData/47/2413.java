package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n = 0;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int[] a = new int[n];
		int[] b = new int[n];
		int i = 0;

		for (i = 0;i < n;i++)
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		for (i = 0;i < n;i++)
		{
			b[i] = a[n - 1 - i];
		}

		for (i = 0;i < n;i++)
		{
				a[i] = b[i];
				if (i < n - 1)
				{
					System.out.print(a[i]);
					System.out.print(" ");
				}
				else
				{
					System.out.print(a[i]);
				}

		}
		return 0;

	}

}

