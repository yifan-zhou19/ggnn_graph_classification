package <missing>;

public class GlobalMembers
{
	public static final int MAX = 1005;
	public static int[] tian = new int[MAX];
	public static int[] qi = new int[MAX];
	public static int n;

	public static int func(int t0,int q0,int t1,int q1)
	{
		if (t0 > t1 || q0 > q1)
		{
			return 0;
		}

		while (tian[t1] > qi[q1])
		{
			t1--;
			q1--;
			return 1 + func(t0, q0, t1, q1);
		}
		while (tian[t0] > qi[q0])
		{
			t0++;
			q0++;
			return 1 + func(t0, q0, t1, q1);
		}

		if (tian[t0] < qi[q1])
		{
			return func(t0 + 1, q0, t1, q1 - 1) - 1;
		}
		else if (tian[t0] == qi[q1])
		{
			return func(t0 + 1, q0, t1, q1 - 1);
		}
	}

	public static int Main()
	{
		while ((n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true))).length() > 0)
		{
			if (n == 0)
			{
				break;
			}
			for (int i = 0;i < n;i++)
			{
				tian[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
			for (int i = 0;i < n;i++)
			{
				qi[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}

			sort(tian,tian + n);
			sort(qi,qi + n);

			System.out.print(200 * func(0, 0, n - 1, n - 1));
			System.out.print("\n");
		}

		return 0;
	}
}

