package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int x;
		int i;
		int[] sz = new int[5];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		x = n;
		for (i = 1;i <= 5;i++)
		{
			sz[i] = x % 10;
			x /= 10;
			System.out.printf("%d", sz[i]);
			if (x == 0)
			{
				break;
			}
		}
		return 0;
	}
}

