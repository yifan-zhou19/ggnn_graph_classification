package <missing>;

public class GlobalMembers
{
	public static final int maxn = 100000;
	public static int[] r = new int[maxn];
	public static int[] o = new int[maxn];
	public static int Main()
	{
		int n;
		int i;
		int j;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(r,0,(Integer.SIZE / Byte.SIZE));
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(o,0,(Integer.SIZE / Byte.SIZE));
		while (scanf("%d", n) != EOF)
		{
			for (scanf("%d%d", i, j);i != 0 || j != 0;scanf("%d%d", i, j))
			{
				o[i]++,r[j]++;
			}
			for (i = 0;i < n;i++)
			{
				if (o[i] == 0 && r[i] == n - 1)
				{
					break;
				}
			}
			if (i == n)
			{
				System.out.println("NOT FOUND");
			}
			else
			{
				System.out.printf("%d\n",i);
			}
		}
		return 0;
	}
}
