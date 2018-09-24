package <missing>;

public class GlobalMembers
{
	public static int step(int k)
	{
		if (k == 1)
		{
			return 0;
		}
		else if (k % 2 == 0)
		{
			k /= 2;
			System.out.printf("%d/2=%d\n", k * 2, k);
		}
		else
		{
			k = k * 3 + 1;
			System.out.printf("%d*3+1=%d\n", (k - 1) / 3, k);
		}
		return step(k);
	}

	public static int Main()
	{
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		step(n);
		System.out.print("End");
		return 0;
	}
}

