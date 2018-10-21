package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int feb = int x;
		int n;
		int a;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int[] b = new int[n];
		for (int i = 0;i < n;i++)
		{
			a = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			b[i] = feb(a);
		}
		for (int i = 0;i < n;i++)
		{
		System.out.print(b[i]);
		System.out.print("\n");
		}
		return 0;
	}

	public static int feb(int x)
	{
		int p = 1;
		int q = 1;
		int w;
		if (x >= 3)
		{
		for (int i = 3;i <= x;i++)
		{
			w = p + q;
			p = q;
			q = w;
		}
		}
		else
		{
		w = 1;
		}
		return w;
	}

}

