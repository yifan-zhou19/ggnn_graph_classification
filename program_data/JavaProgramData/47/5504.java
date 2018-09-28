package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[99];
		int n = 0;
		int i = 0;
		int j = 0;
		int e = 0;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i <= n - 1;i++)
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		for (j = n - 1;j > 0;j--)
		{
			System.out.print(a[j]);
			System.out.print(" ");
		}
			System.out.print(a[0]);
			return 0;
	}

}

