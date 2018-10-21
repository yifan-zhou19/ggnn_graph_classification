package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] a = new int[101][101];
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		int * p;
		int m;
		int n;
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (p = a;p < a + m * n;p++)
		{
			*p = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		p = a;
		for (int i = 0;i < n;i++)
		{
			int a = 0;
			int b = i;
			while ((a < m) && (b >= 0))
			{
				  System.out.print((p + a * n + b));
				  System.out.print("\n");
				  a++;
				  b--;
			}
		}
		for (int i = 1;i < m;i++)
		{
			int a = i;
			int b = n - 1;
			while ((a < m) && (b >= 0))
			{
				  System.out.print((p + a * n + b));
				  System.out.print("\n");
				  a++;
				  b--;
			}
		}

		return 0;
	}

}

