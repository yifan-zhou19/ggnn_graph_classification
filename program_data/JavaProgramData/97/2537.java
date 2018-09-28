package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int x;
		int i;
		int[] a = {0, 100, 50, 20, 10, 5, 1};
		x = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1 ; i <= 6 ; i++)
		{
			System.out.print((x / a[i]));
			System.out.print("\n");
			x %= a[i];
		}
		return 0;
	}

}

