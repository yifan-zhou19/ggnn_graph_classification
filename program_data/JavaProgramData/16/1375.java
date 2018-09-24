package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[10];
		int n = 0;
		int k = 1;
		int i = 0;
		int b = 1;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		if (n == 0)
		{
			System.out.print(n);
			System.out.print("\n");
		}
		for (i = 0;n != 0;i++)
		{
			a[i] = n % 10;
		System.out.print(a[i]);
			n = (n - a[i]) / 10;
		}
		return 0;
	}
}

