package <missing>;

public class GlobalMembers
{
	public static int m;
	public static int n;

	public static int find(int a,int b,int c)
	{
		int i;
		int k;
		int l;
		int t;
		int s;
		int p;
		int q;
		if (b == 1)
		{
			return 1;
		}
		k = 0;
		t = a / b;
		for (i = c;i <= t;i++)
		{
			k = k + find(a - i, b - 1, i);
		}
		return k;
	}

	public static int Main()
	{
		int k = 0;
		int t;
		int i;
		t = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1;i <= t;i++)
		{
			m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			k = find(m, n, 0);
			System.out.print(k);
			System.out.print("\n");
		}
		return 0;
	}

}

