package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int k;
		int x;
		int y;
		int[][] a = new int[10][3];
		double[][] b = new double[45][3];
		double temp;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[i][0] = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				a[i][1] = Integer.parseInt(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				a[i][2] = Integer.parseInt(tempVar4);
			}
		}
		for (i = 0,k = 0;i < n;i++)
		{
			for (j = i + 1;j < n;j++)
			{
				b[k][0] = i;
				b[k][1] = j;
				b[k][2] = Math.sqrt((a[i][0] - a[j][0]) * (a[i][0] - a[j][0]) + (a[i][1] - a[j][1]) * (a[i][1] - a[j][1]) + (a[i][2] - a[j][2]) * (a[i][2] - a[j][2]));
				k++;
			}
		}
		for (i = 1;i < k;i++)
		{
			for (j = 0;j < k - i;j++)
			{
				if (b[j][2] < b[j + 1][2])
				{
					temp = b[j][0];
					b[j][0] = b[j + 1][0];
					b[j + 1][0] = temp;
					temp = b[j][1];
					b[j][1] = b[j + 1][1];
					b[j + 1][1] = temp;
					temp = b[j][2];
					b[j][2] = b[j + 1][2];
					b[j + 1][2] = temp;
				}
				if (b[j][2] == b[j + 1][2])
				{
					if (b[j][0] > b[j + 1][0])
					{
						temp = b[j][0];
						b[j][0] = b[j + 1][0];
						b[j + 1][0] = temp;
						temp = b[j][1];
						b[j][1] = b[j + 1][1];
						b[j + 1][1] = temp;
						temp = b[j][2];
						b[j][2] = b[j + 1][2];
						b[j + 1][2] = temp;
					}
					if (b[j][0] == b[j + 1][0])
					{
						if (b[j][1] > b[j + 1][1])
						{
							temp = b[j][0];
							b[j][0] = b[j + 1][0];
							b[j + 1][0] = temp;
							temp = b[j][1];
							b[j][1] = b[j + 1][1];
							b[j + 1][1] = temp;
							temp = b[j][2];
							b[j][2] = b[j + 1][2];
							b[j + 1][2] = temp;
						}
					}
				}
			}
		}
		for (i = 0;i < k;i++)
		{
			x = b[i][0];
			y = b[i][1];
			System.out.printf("(%d,%d,%d)-(%d,%d,%d)=%.2lf\n",a[x][0],a[x][1],a[x][2],a[y][0],a[y][1],a[y][2],b[i][2]);
		}
		return 0;
	}
}

