package <missing>;

public class GlobalMembers
{
	public static int fenjie(int k, int l)
	{
		int num = 1;
		int d;
		int e;
		if (k < l)
		{
			return 0;
		}
		d = (int)(Math.sqrt((double) k));
		for (e = l; e <= d; e++)
		{
			if (k % e == 0)
			{
				num += fenjie(k / e, e);
			}
		}
		return num;
	}
	public static int Main()
	{
		int n;
		int i;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1; i <= n; i++)
		{
			int a;
			a = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			System.out.print(fenjie(a, 2));
			System.out.print("\n");
		}
		return 0;
	}
}

