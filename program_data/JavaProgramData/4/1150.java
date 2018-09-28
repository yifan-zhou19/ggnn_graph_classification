package <missing>;

public class GlobalMembers
{
	public static int[][] a = new int[201][201];
	public static int Main()
	{
		int n;
		int m;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(a,0,(Integer.SIZE / Byte.SIZE));
		for (int i = 0;i < n;i++)
		{
		for (int j = 0;j < m;j++)
		{
		*(*(a + i) + j) = ConsoleInput.readToWhiteSpace(true);
		}
		}
		for (int s = 0;s < n + m - 1;s++)
		{
		for (int i = 0;i <= s;i++)
		{
		if (a[i][s - i] != 0)
		{
			System.out.print(a[i][s - i]);
			System.out.print("\n");
		}
		}
		}
	}
}

