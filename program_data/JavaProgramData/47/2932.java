package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n = 0;
		int i = 0;
		int[] a = new int[100];
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < n;i++)
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		for (i = 0;i < n;i++)
		{
			if (i == 0)
			{
				System.out.print(a[n - 1 - i]);
			}
			else
			{
				System.out.print(" ");
				System.out.print(a[n - 1 - i]);
			}
		}
		System.out.print("\n");
		return 0;
	}

}

