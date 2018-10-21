package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] sz = new int[6];
		int[] m = new int[6];
		int n;
		int i = 0;
		int e;
		int t;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		e = n;
		m[0] = 100;
		m[1] = 50;
		m[2] = 20;
		m[3] = 10;
		m[4] = 5;
		m[5] = 1;
		for (i = 0;i < 6;i++)
		{
			sz[i] = e / m[i];
			e = e - m[i] * sz[i];
		}
		for (i = 0;i < 6;i++)
		{
			System.out.printf("%d\n",sz[i]);
		}
		return 0;
	}

}

