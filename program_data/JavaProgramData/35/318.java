package <missing>;

public class GlobalMembers
{
	public static int max(int[] A, int n)
	{
		int p = 0;
		int maxnum = 0;
		for (p = 0;p < n;p++)
		{
			if (A[p] > A[maxnum])
			{
				maxnum = p;
			}
		}
			return (maxnum);
	}
	public static int min(int B, int num, int[][] C, int m)
	{
	  int minvalue = B;
	  int i;
	  int blag = 1;
		  for (i = 0;i < m;i++)
		  {
			  if (C[i][num] < B)
			  {
				  blag = 0;
				  return (0);
			  }
		  }
			  return (blag);

	}
	public static void Main()
	{
		int m;
		int n;
		int[][] a = new int[9][9];
		int i;
		int j;
		int flag = 0;
		int ma;
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
		for (i = 0;i < m;i++)
		{
			ma = max(a[i], n);
		if (min(a[i][ma], ma, a, m) == 1)
		{
			System.out.printf("%d+%d",i,ma);
			flag = 1;
		}
		}
		if (flag == 0)
		{
			System.out.print("No");
		}

	}

}

