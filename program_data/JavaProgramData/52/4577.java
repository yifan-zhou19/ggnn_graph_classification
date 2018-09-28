package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	   int m;
	   int n;
	   int i;
	   n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	   m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int[] a = new int[n];
		for (i = m;i < n;i++)
		{
		a[i] = ConsoleInput.readToWhiteSpace(true);
		}
		for (i = 0;i < m;i++)
		{
		a[i] = ConsoleInput.readToWhiteSpace(true);
		}
		System.out.print(a);
		for (i = 1;i < n;i++)
		{
		System.out.print(' ');
		System.out.print((a + i));
		}
		return 0;
	}
}

