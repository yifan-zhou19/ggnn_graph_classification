package <missing>;

public class GlobalMembers
{
	public static int[] a = new int[100001];
	public static int[] b = new int[100001];
	public static int[] c = new int[100001];
	public static int x;
	public static int y;
	public static int p;
	public static int Main()
	{
		int n;
		int i;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		x = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		y = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		while (x != 0 || y != 0)
		{
			b[y]++;
			c[x] = 1;
			x = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			y = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		for (i = 0;i < n;i++)
		{
			if (b[i] == n - 1 && c[i] == 0)
			{
				System.out.print(i);
				System.out.print("\n");
				p = 1;
			}
		}
		if (p == 0)
		{
			System.out.print("NOT FOUND");
			System.out.print("\n");
		}
		return 0;
	}


}

