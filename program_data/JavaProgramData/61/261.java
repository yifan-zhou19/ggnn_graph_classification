package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[21];
		int i;
		int n;
		a[0] = 1;
		a[1] = 1;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1;i < 20;i++)
		{
			a[i + 1] = a[i] + a[i - 1];
		}
		while ((i = Integer.parseInt(ConsoleInput.readToWhiteSpace(true))).length() > 0)
		{
			System.out.print(a[i - 1]);
			System.out.print("\n");
		}
		return 0;
	}
}

