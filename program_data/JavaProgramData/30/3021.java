package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int a = 0;
		int c = 0;
		int[] sz = new int[100];
		for (a = 0;a <= n;a++)
		{
			if (a % 10 != 7 && a % 7 != 0 && a / 10 != 7)
			{
				sz[a] = (int)Math.pow(a,2);
				c += sz[a];
			}
		}
		System.out.printf("%d",c);
		return 0;
	}
}

