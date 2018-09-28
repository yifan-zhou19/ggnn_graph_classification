package <missing>;

public class GlobalMembers
{
	public static final int MAXN = 1000100;

	public static int n;
	public static int[] d = new int[MAXN];
	public static int[] r = new int[MAXN];

	public static int Main()
	{
		int x;
		int y;
		int i;

		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(d, 0, (Integer.SIZE / Byte.SIZE));
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(r, 0, (Integer.SIZE / Byte.SIZE));
		while (scanf("%d%d", x, y), x + y != 0)
		{
			r[x]++;
			d[y]++;
		}
		for (i = 0; i < n; i++)
		{
			if (r[i] == 0 && d[i] == n - 1)
			{
				break;
			}
		}
		if (i == n)
		{
			System.out.print("NOT FOUND\n");
		}
		else
		{
			System.out.printf("%d\n", i);
		}

		return 0;
	}

}

