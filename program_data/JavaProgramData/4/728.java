package <missing>;

public class GlobalMembers
{
	public static int n;
	public static int m;
	public static int[][] a = new int[101][101];
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
	public static int * p1;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
	public static int * p2;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
	public static int * p3;
	public static int j;
	public static int k;
	public static int Main()
	{
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (p1 = a, j = 0; j < n; ++j, p1 += 101)
		{
			for (p2 = p1, k = 0; k < m; ++k, ++p2)
			{
				*p2 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		}
		for (p2 = a, j = 1; j <= m; ++j, ++p2) //??????0???????
		{
			for (p3 = p2, k = Math.min(j, n); k--; p3 += 100)
			{
				System.out.print(p3);
				System.out.print("\n");
			}
		}
		for (p2 + = 100, j = n - 1; j != null; --j, p2 + = 101) //???????????????
		{
			for (p3 = p2, k = Math.min(m, j); k--; p3 + = 100)
			{
				System.out.print(p3);
				System.out.print("\n");
			}
		}
		return 0;
	}

}

