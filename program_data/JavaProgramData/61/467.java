package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int[] a = new int[25];
		a[0] = 1;
		a[1] = 1;
		for (i = 2;i < 25;i++)
		{
			a[i] = a[i - 1] + a[i - 2];
		}
		int n;
		int s;
		s = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < s;i++)
		{
			n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		System.out.print(a[n - 1]);
		System.out.print("\n");
		}
		return 0;
	}
}

