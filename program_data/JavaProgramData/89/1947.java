package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int a;
		int b;
		int g = 0;
		int i;
		int[] c = new int[100000];
		int[] d = new int[10000];
		int[] p = c;
		int[] q = d;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (;;)
		{
			a = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			b = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			if (a == 0 && b == 0)
			{
				break;
			}
			else
			{
				c[b]++;
				d[a] = -1;
			}
		}
		for (i = 0;i < n;i++)
		{
			if (c[i] == n - 1 && d[i] == 0)
			{
				System.out.print(i);
				g = 1;
				break;
			}
		}
		if (g == 0)
		{
			System.out.print("NOT FOUND");
			System.out.print("\n");
		}
		return 0;
	}
}

