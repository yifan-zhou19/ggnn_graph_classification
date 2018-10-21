package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int k;
		int p;
		int q;
		int m;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int[][] qj = new int[2][n];
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				qj[0][i] = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				qj[1][i] = Integer.parseInt(tempVar3);
			}
		}
		for (i = 0;i < n;i++)
		{
			for (k = 0;k < n - i - 1;k++)
			{
				m = k + 1;
				if (qj[0][k] > qj[0][m])
				{
					p = qj[0][m];
					qj[0][m] = qj[0][k];
					qj[0][k] = p;
					q = qj[1][m];
					qj[1][m] = qj[1][k];
					qj[1][k] = q;
				}
			}
		}
		for (k = 0;k < n - 1;k++)
		{
				m = k + 1;
				if (qj[0][m] > qj[1][k])
				{
					System.out.print("no");
					return 0;
				}
				else
				{
					if (qj[1][k] > qj[1][m])
					{
						qj[1][m] = qj[1][k];
						qj[0][m] = qj[0][k];
					}
				}
		}
		System.out.printf("%d %d",qj[0][0],qj[1][n - 1]);
		return 0;
	}

}

