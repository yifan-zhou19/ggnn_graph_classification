package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[101];
		int i;
		int m;
		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < n;i++)
		{
		a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		m = i;
		for (i = m - 1;i > 0;i--)
		{
			System.out.print(a[i]);
			System.out.print(" ");
		}
		System.out.print(a[0]);
					 System.in.read();
					 System.in.read();
					 System.in.read();
		return 0;
	}

}

