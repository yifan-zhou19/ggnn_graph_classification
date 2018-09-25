package <missing>;

public class GlobalMembers
{
	public static int m;
	public static int n;
	public static int[] a = new int[20];
	public static int[] b = new int[20];
	public static void duqu()
	{
		int i;
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1;i <= m;i++)
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		for (i = 1;i <= n;i++)
		{
			b[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
	} //????
	public static void paixu()
	{
		int i;
		int j;
		int t;
		for (i = 1;i <= m - 1;i++)
		{
			for (j = 1;j <= m - i;j++)
			{
				if (a[j] > a[j + 1])
				{
					t = a[j];
					a[j] = a[j + 1];
					a[j + 1] = t;
				}
			}
		}
		for (i = 1;i <= n - 1;i++)
		{
			for (j = 1;j <= n - i;j++)
			{
				if (b[j] > b[j + 1])
				{
					t = b[j];
					b[j] = b[j + 1];
					b[j + 1] = t;
				}
			}
		}
	} //?????
	public static void shuchu()
	{
		int i;
		int j;
		System.out.print(a[1]);
		for (i = 2;i <= m;i++)
		{
			System.out.print(" ");
			System.out.print(a[i]);
		}
		for (j = 1;j <= n;j++)
		{
			System.out.print(" ");
			System.out.print(b[j]);
		}
		System.out.print("\n");
	} //??
	public static int Main()
	{
		duqu();
		paixu();
		shuchu(); //????
		return 0;
	}
}

