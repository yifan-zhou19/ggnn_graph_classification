package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n = 0;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int[] a = new int[n];
		for (int i = 1;i <= n;i = i + 1)
		{
			a[n + 1 - i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		System.out.print(a[1]);
		for (int j = 2;j <= n;j = j + 1)
		{
			System.out.print(" ");
			System.out.print(a[j]);
		}
		return 0;
	}

}

