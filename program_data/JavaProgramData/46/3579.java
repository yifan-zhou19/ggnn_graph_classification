package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int a;
		int b;
		int c;
		int d;
		int m;
		int n;
		int i;
		int j;
		int k;
		int[][] e = new int[MAX][MAX];
		int[] q = {1, 0, -1, 0};
		int[] w = {0, 1, 0, -1};
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
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
					e[i][j] = Integer.parseInt(tempVar3);
				}
			}
		}
		for (i = 0,a = q[0],b = w[0],j = 0,k = 0;i < m * n;i++,j += b,k += a)
		{
			System.out.printf("%d\n",e[j][k]);
			if (a == q[0] && b == w[0] && j + k == n - 1)
			{
				a = q[1];
				b = w[1];
			}
			 else if (a == q[1] && b == w[1] && j - k == m - n)
			 {
				a = q[2];
				b = w[2];
			 }
			 else if (a == q[2] && b == w[2] && j + k == m - 1)
			 {
				a = q[3];
				b = w[3];
			 }
			   else if (a == q[3] && b == w[3] && j == k + 1)
			   {
				a = q[0];
				b = w[0];
			   }
		}
		return 0;
	}

}

