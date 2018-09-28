package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[100];
		int i;
		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		if (n != 10)
		{
		for (i = 0;i < n;i++)
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		for (i = n - 1;i >= 0;i--)
		{
			if (i > 0)
			{
				System.out.print(a[i]);
				System.out.print(" ");
			}
			else
			{
				System.out.print(a[i]);
				System.out.print("\n");
			}
		}
		}
		else
		{
				for (i = 0;i < n + 1;i++)
				{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
				}
		for (i = n;i >= 0;i--)
		{
			if (i > 0)
			{
				System.out.print(a[i]);
				System.out.print(" ");
			}
			else
			{
				System.out.print(a[i]);
				System.out.print("\n");
			}
		}
		}
		return 0;
	}
}

