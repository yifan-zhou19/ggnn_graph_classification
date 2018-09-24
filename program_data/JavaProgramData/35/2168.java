package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m;
		int n;
		int i;
		int j;
		int x = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(",");
		if (tempVar2 != null)
		{
			m = Integer.parseInt(tempVar2);
		}
		int[][] s = new int[8][8];
		int[] z = new int[8];
		for (i = 0;i < n;i++)
		{
			for (j = 0;j < m;j++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					s[i][j] = Integer.parseInt(tempVar3);
				}
				if (s[i][z[i]] < s[i][j])
				{
					z[i] = j;
				}
			}
		}
		for (i = 0;i < n;i++)
		{
			for (j = 0;j < n;j++)
			{
				if (s[i][z[i]] > s[j][z[i]])
				{
					break;
				}
				if (j == n - 1)
				{
					System.out.printf("%d+%d",i,z[i]);
					x = 1;
				}
			}
		}
		if (x == 0)
		{
			System.out.print("No");
		}
		return 0;
	}
}

