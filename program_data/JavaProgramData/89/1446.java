package <missing>;

public class GlobalMembers
{
	public static final int maxn = 1000000 + 10;

	public static int[] know = new int[maxn];
	public static int[] known = new int[maxn];
	public static int n;
	public static int a;
	public static int b;
	public static int i;

	public static int Main()
	{
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(know, 0, (Integer.SIZE / Byte.SIZE));
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(known, 0, (Integer.SIZE / Byte.SIZE));
		while (scanf("%d%d", a, b) && (a + b != 0))
		{
			know[a]++;
			known[b]++;
		}
		for (i = 0; i < n; i++)
		{
		if (known[i] == n - 1 && know[i] == 0)
		{
			System.out.print(i);
			System.out.print("\n");
		}
		}

		return 0;
	}
}

