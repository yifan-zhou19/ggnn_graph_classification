package <missing>;

public class GlobalMembers
{
	public static int[] h = new int[MAXN];
	public static int k;

	public static int bp(int i, int height, int sum)
	{
		if (i == k)
		{
			return sum;
		}
		if (h[i] <= height)
		{
			int a1 = bp(i + 1, h[i], sum + 1);
			int a2 = bp(i + 1, height, sum);
			return (a1 > a2) ? a1 : a2;
		}
		return bp(i + 1, height, sum);
	}

	public static int Main()
	{

		k = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int i = 0; i < k; i++)
		{
			h[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}

		System.out.print(bp(0, INF, 0));
		System.out.print("\n");

		return 0;
	}

}

