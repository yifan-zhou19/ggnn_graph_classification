package <missing>;

public class GlobalMembers
{
	public static int n;
	public static int k;
	public static int i;
	public static int[] x = new int[10000];
	public static int f(int o)
	{
		while (true)
		{
		x[1] = o; //x[i]?????i?????????
		for (i = 1; i < n; i++)
		{
			if (x[i] % (n - 1) == 0)
			{
				x[i + 1] = n * x[i] / (n - 1) + k;
			}
			else
			{
				break;
			}
		}
		if (i == n)
		{
			return x[n];
		}
		else
		{
			o = o + n;
			//return f(o);
		}
		}
	}
	public static int Main()
	{
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		k = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int o = n + k;
		System.out.print(f(o));
	}

}

