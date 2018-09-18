package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int m;
		int[][] n = new int[1000][1000];
		int ai;
		int aj;
		int zi;
		int zj;
		int i;
		int j;
		int s;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		for (i = 0;i < m;i++)
		{
		for (j = 0;j < m;j++)
		{
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			n[i][j] = Integer.parseInt(tempVar2);
		}
			if (n[i][j] == 0)
			{
			zi = i;
			zj = j;
			}

		}
		}
		for (i = (m - 1);i >= 0;i--)
		{
		for (j = (m - 1);j >= 0;j--)
		{

			if (n[i][j] == 0)
			{
			ai = i;
			aj = j;
			}

		}
		}
		s = (zj - aj - 1) * (zi - ai - 1);
		System.out.printf("%d\n",s);
	}
}

