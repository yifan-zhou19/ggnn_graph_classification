package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m;
		int n;
		int i;
		int j;
		int[][] a = new int[8][8];
		int p = 0;
		int q = 0;
		int mark = 1;
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
				a[i][j] = Integer.parseInt(tempVar3);
			}
			}
		}
		for (j = 0;j < n;j++)
		{
			if (a[0][j] > a[0][p])
			{
				p = j;
			}
		}
		for (i = 0;i < m;i++)
		{
			if (a[i][p] < a[q][p])
			{
				q = i;
			}
		}
		for (j = 0;j < n;j++)
		{
			if (a[q][j] > a[q][p])
			{
				System.out.print("No");
				mark = 0;
				break;
			}
		}
		if (mark != 0)
		{
			System.out.printf("%d+%d",q,p);
		}
		return 0;
	}



}

