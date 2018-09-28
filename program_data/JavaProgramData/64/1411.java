package <missing>;

public class GlobalMembers
{
	//Pat.X
	public static int Main()
	{
		int n; //????
		int i; //??????
		int j;
		int k;
		int p;
		int x; //?????
		int y;
		int z;
		int m; //????????
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		m = n * (n - 1) / 2; //????????
		double[] c = new double[m]; //??????????????????
		double t;
		double t0;
		int[][] a = new int[n][3]; //?????????
		double[][] b = new double[n][n]; //???????????????????????????
		for (i = 0;i < n;i++) //????
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
		k = 0;
		for (i = 0;i < n - 1;i++) //????
		{
			for (j = i + 1;j < n;j++)
			{
				x = a[i][0] - a[j][0];
				y = a[i][1] - a[j][1];
				z = a[i][2] - a[j][2];
				b[i][j] = Math.sqrt(x * x + y * y + z * z);
				c[k] = b[i][j];
				k++;
			}
		}
		for (i = k - 1;i > 0;i--) //????
		{
			for (j = 0;j < i;j++)
			{
				if (c[j] < c[j + 1])
				{
					t = c[j];
					c[j] = c[j + 1];
					c[j + 1] = t;
				}
			}
		}
		t0 = c[0] + 1; //????
		for (i = 0;i < k;i++) //??????
		{
			if (c[i] == t0)
			{
				continue;
			}
			if (c[i] != t0)
			{ //????????????????????
			t0 = c[i];
			for (j = 0;j < n - 1;j++)
			{
				for (p = j + 1;p < n;p++)
				{
					if (b[j][p] == c[i])
					{
						System.out.printf("(%d,%d,%d)-(%d,%d,%d)=%.2lf\n",a[j][0],a[j][1],a[j][2],a[p][0],a[p][1],a[p][2],b[j][p]);
					}
				}
			}
			}
		}
		return 0;
	}
}

