package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n = 0;
		int i;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int[] a = new int[100];
		for (i = 1;i <= n;i += 1)
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		for (i = n;i >= 2;i -= 1)
		{
			System.out.print(a[i]);
			System.out.print(" ");
		}
		System.out.print(a[1]);


		return 0;
	}

}

