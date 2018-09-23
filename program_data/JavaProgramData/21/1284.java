package <missing>;

public class GlobalMembers
{
	public static int[] a = new int[305];
	public static int n;
	public static double s;
	public static double ave;
	public static int minn;
	public static int maxn;
	public static int[] ans = new int[305];
	public static int num;
	public static int Main()
	{
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		s = 0;
		num = 0;
		a[0] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		s += a[0];
		minn = a[0];
		maxn = a[0];
		for (int i = 1;i < n; i++)
		{
				a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
				s += a[i];
				if (minn > a[i])
				{
					minn = a[i];
				}
				if (maxn < a[i])
				{
					maxn = a[i];
				}
		}
		ave = s / n;
		double t1;
		double t2;
		t1 = ave - minn;
		t2 = maxn - ave;
		if (t1 > t2)
		{
			System.out.print(minn);
			System.out.print("\n");
		}
		else if (t1 < t2)
		{
			System.out.print(maxn);
			System.out.print("\n");
		}
		else
		{
			System.out.print(minn);
			System.out.print(",");
			System.out.print(maxn);
			System.out.print("\n");
		}
		return 0;
	}
}

