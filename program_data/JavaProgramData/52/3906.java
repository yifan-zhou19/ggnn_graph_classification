package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int m;
		int i;
		int[] g = new int[100];
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		int * p;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < n;i++)
		{
			g[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		for (p = g[n - 1] - m + 1;p <= g[n - 1];p++)
		{
			System.out.print(p);
			System.out.print(" ");
		}
		for (p = g[0];p < g[n - 1] - m;p++)
		{
			System.out.print(p);
			System.out.print(" ");
		}
			 System.out.print(p);
		return 0;
	}
}

