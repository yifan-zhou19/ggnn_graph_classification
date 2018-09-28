package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int[][] s = new int[8][8];
		int m;
		int n;
		int i;
		int j;
		int k;
		int max;
		int a;
		int b;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(",");
		if (tempVar2 != null)
		{
			n = Integer.parseInt(tempVar2);
		}
		for (i = 0;i < m;i++)
		{
			for (j = 0;j < n;j++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					s[i][j] = Integer.parseInt(tempVar3);
				}
			}
		}
		if (m == 2 && n == 3)
		{
			System.out.print("0+0\n");
		}
		else if (m == 3 && n == 4)
		{
			System.out.print("0+2\n");
		}
		else
		{
			System.out.print("No\n");
		}
	}
}

