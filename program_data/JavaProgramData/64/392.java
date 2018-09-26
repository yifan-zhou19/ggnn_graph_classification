package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
	int n;
	int m;
	int[][] a = new int[11][3];
	int i;
	int j;
	int k;
	int l;
	double[][] b = new double[46][3];
	double s;
	double t;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	m = n * (n - 1) / 2;
	for (i = 0;i < n;i++)
	{
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			a[i][0] = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead(" ");
		if (tempVar3 != null)
		{
			a[i][1] = Integer.parseInt(tempVar3);
		}
		String tempVar4 = ConsoleInput.scanfRead(" ");
		if (tempVar4 != null)
		{
			a[i][2] = Integer.parseInt(tempVar4);
		}
	}
	i = 0;
	for (j = 0;j < n - 1;j++)
	{
		for (k = j + 1;k <= n - 1;k++)
		{
			s = Math.sqrt((a[j][0] - a[k][0]) * (a[j][0] - a[k][0]) + (a[j][1] - a[k][1]) * (a[j][1] - a[k][1]) + (a[j][2] - a[k][2]) * (a[j][2] - a[k][2]));
			b[i][0] = j;
			b[i][1] = k;
			b[i][2] = s;
			i++;
		}
	}
	for (i = m - 1;i > 0;i--)
	{
		for (j = 0;j < i;j++)
		{
			if (b[j][2] < b[j + 1][2])
			{
				for (l = 0;l <= 2;l++)
				{
					t = b[j + 1][l];
					b[j + 1][l] = b[j][l];
					b[j][l] = t;
				}
			}
			else if (Math.abs(b[j][2] - b[j + 1][2]) < 1e-6 && b[j][0]> b[j + 1][0])
			{
				for (l = 0;l <= 2;l++)
				{
					t = b[j + 1][l];
					b[j + 1][l] = b[j][l];
					b[j][l] = t;
				}
			}
			else if (Math.abs(b[j][2] - b[j + 1][2]) < 1e-6 && b[j][0] == b[j + 1][0] && b[j][1]> b[j + 1][1])
			{
				for (l = 0;l <= 2;l++)
				{
					t = b[j + 1][l];
					b[j + 1][l] = b[j][l];
					b[j][l] = t;
				}
			}
		}
	}
	for (i = 0;i < m;i++)
	{
		System.out.printf("(%d,%d,%d)-(%d,%d,%d)=%.2f\n",a[(int)b[i][0]][0],a[(int)b[i][0]][1],a[(int)b[i][0]][2],a[(int)b[i][1]][0],a[(int)b[i][1]][1],a[(int)b[i][1]][2],b[i][2]);
	}
	}
}

