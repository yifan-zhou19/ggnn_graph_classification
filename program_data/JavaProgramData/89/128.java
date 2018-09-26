package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int n;
		int[] in = new int[MAXN];
		int[] ou = new int[MAXN];
		for (scanf("%d%d%d", n, i, j);i + j > 0;scanf("%d%d", i, j))
		{
			in[i]++;
			ou[j]++;
		}
		for (i = 0;i < n;i++)
		{
			if (in[i] == 0 && ou[i] == n - 1)
			{
			System.out.printf("%d\n",i);
			return 0;
			}
		}
			System.out.print("NOT FOUND\n");
		return 0;


	}
}
