package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int n;
		int[] a = new int[10000];
		int[] b = new int[10000];
		int x;
		int y;
		int t = 0;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		while (true)
		{
			x = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			y = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			if (x == 0 && y == 0)
			{
				break;
			}
			a[x]++;
			b[y]++;
		}
		for (i = 0;i < n;i++)
		{
			if (a[i] == 0 && b[i] == n - 1)
			{
			t++;
			System.out.print(i);
			System.out.print("\n");
			}
		}
		if (t == 0)
		{
			System.out.print("NOT FOUND");
		}
			return 0;
	}


}

