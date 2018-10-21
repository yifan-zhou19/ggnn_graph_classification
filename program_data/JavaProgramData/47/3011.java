package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[100];
		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int i = 0;i <= n - 1;i++)
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		for (int i = n - 1;i >= 0;i--)
		{
			System.out.print(a[i]);
			if (i != 0)
			{
				System.out.print(" ");
			}
		}
		return 0;
	}
}

