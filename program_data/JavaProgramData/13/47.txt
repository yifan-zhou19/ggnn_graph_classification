package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n = 0;
		int x = 0;
		int[] a = new int[100];
		int i = 0;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		x = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		System.out.print(x);
		a[x - 1] = 1;
		for (i = 2;i <= n;i++)
		{
			x = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			if (a[x - 1] == 0)
			{
				System.out.print(" ");
				System.out.print(x);
				a[x - 1] = 1;
			}
		}
		return 0;
	}

}

