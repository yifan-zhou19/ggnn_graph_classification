package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int n;
		int j;
		int k = 0;
		int m = 0;
		int[][] sz = new int[200][2];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			for (j = 0;j < 2;j++)
			{
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			(sz[i][j]) = Integer.parseInt(tempVar2);
		}
			}
		}
		for (i = 0;i < n;i++)
		{
			if ((sz[i][0] - sz[i][1] == -1) || (sz[i][0] - sz[i][1] == 2))
			{
				k++;
			}
			else if ((sz[i][0] - sz[i][1] == 1) || (sz[i][0] - sz[i][1] == -2))
			{
				m++;
			}
			else if (sz[i][0] - sz[i][1] == 0)
			{
				k = k + 1;
				m = m + 1;
			}
		}
		if (k > m)
		{
			System.out.print("A");
		}
		else if (k < m)
		{
			System.out.print("B");
		}
	   else if (k == m)
	   {
		   System.out.print("Tie");
	   }
		return 0;
	}


}

