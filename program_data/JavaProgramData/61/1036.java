package <missing>;

public class GlobalMembers
{
	public static int f(int n)
	{
		if (n == 1)
		{
			return 1;
		}
		else if (n == 2)
		{
			return 1;
		}
		else
		{
			 return f(n - 1) + f(n - 2);
		}
	}

	public static int Main()
	{
		int k = 0;
		int[] a = new int[k];
		k = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int i = 0;i < k;i++)
		{
			 a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		for (int i = 0;i < k;i++)
		{
				System.out.print(f(a[i]));
				System.out.print("\n");

		}

		return 0;
	}
}

