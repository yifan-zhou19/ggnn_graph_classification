package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int k;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int[] a = new int[n];
		for (int t = 0;t <= n - 1;t++)
		{
			a[t] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		k = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int number = 0;
		int b = 0;
		for (int i = 0;i <= n - 1;i++)
		{
			if (a[i] != k)
			{
				number = number + 1;
			}
		}
			for (int i = 0;i <= n - 1;i++)
			{
			if (a[i] != k)
			{
				b = b + 1;
				System.out.print(a[i]);
			if (b < number)
			{
				System.out.print(" ");
			}
			}
			}
				return 0;

	}
}

