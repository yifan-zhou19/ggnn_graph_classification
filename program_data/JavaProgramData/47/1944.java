package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n = 0;
		int i;
		int[] a = new int[105];
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < n;i++)
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}

		for (i = n - 1;i >= 1;i--)
		{
			System.out.print(a[i]);
			System.out.print(" ");
		}

		System.out.print(a[0]);


	return 0;




	}
}

