package <missing>;

public class GlobalMembers
{
	public static int fjys(int x,int y)
	{
		if (x < y)
		{
			return 0;
		}
		int i;
		int n = 1;
		for (i = y;i < x;i++)
		{
			if (x % i == 0)
			{
				n += fjys(x / i, i);
			}
		}
		return n;
	}
	public static int Main()
	{
		int n;
		int[] a = new int[100];
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int i = 0;i < n;i++)
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			System.out.print(fjys(a[i], 2));
			System.out.print("\n");
		}
		return 0;
	}
}

