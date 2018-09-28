package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int row;
		int col;
		int m;
		int n;
		int i;
		int b;
		int c;
		int[][] a = new int[100][100];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			row = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			col = Integer.parseInt(tempVar2);
		}
		for (m = 0;m < row;m++)
		{
			for (n = 0;n < col;n++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					a[m][n] = Integer.parseInt(tempVar3);
				}
			}
		}

		int[] p = {0, 1, 0, -1};
		int[] q = {1, 0, -1, 0};

		for (i = 0,c = p[0],b = q[0],m = 0,n = 0;i < row * col;m = m + c,n = n + b,i++)
		{
			System.out.printf("%d\n",a[m][n]);
			if (c == p[0] && b == q[0] && m + n == col - 1)
			{
				c = p[1];
				b = q[1];
			}
			else if (c == p[1] && b == q[1] && m - n == row - col)
			{
				c = p[2];
				b = q[2];
			}
			else if (c == p[2] && b == q[2] && m + n == row - 1)
			{
				c = p[3];
				b = q[3];
			}
			else if (c == p[3] && b == q[3] && m == n + 1)
			{
				c = p[0];
				b = q[0];
			}
		}
		return 0;
	}
}

