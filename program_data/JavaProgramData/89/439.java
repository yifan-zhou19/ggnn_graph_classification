package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int m;
		int p;
		int q = 0;
		int r = 0;
		int i = 0;
		int j;
		int a;
		int b;
		int[] c = new int[10000];
		int[] d = new int[10000];
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		while (true)
		{
			a = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			b = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			if (a == 0 && b == 0)
			{
				break;
			}
			c[b]++;
			d[a]++;
			i++;
		}
		for (i = 0; i < n; i++)
		{
			if (c[i] == n - 1)
			{
				if (d[i] == 0)
				{
					System.out.print(i);
					System.out.print("\n");
					break;
				}
				else
				{
					System.out.print("NOT FOUND");
					System.out.print("\n");
				}
			}
			else
			{
				q++;
			}
		}
		if (q == n)
		{
			System.out.print("NOT FOUND");
			System.out.print("\n");
		}
		return 0;
	}
}

