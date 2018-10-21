package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[100];
		a[1] = 1;
		a[2] = 1;
		for (int i = 3;i <= 21;i++)
		{
			a[i] = a[i - 1] + a[i - 2];
		}
		int n;
		int m;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		while (n-- != 0)
		{
			m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			System.out.print(a[m]);
			System.out.print("\n");
		}

	}
}

