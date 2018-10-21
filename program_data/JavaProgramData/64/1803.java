package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] a = new int[10][3];
		int x;
		int y;
		int z;
		int i;
		int j;
		int k;
		int n;
		int f = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		double tmp;
		double[][] result = new double[45][3];
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				x = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				y = Integer.parseInt(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				z = Integer.parseInt(tempVar4);
			}
			a[i][0] = x;
			a[i][1] = y;
			a[i][2] = z;
		}
		for (i = 0;i < n;i++)
		{
			for (j = i + 1;j < n;j++)
			{
				result[f][0] = Math.sqrt(Math.pow(a[i][0] - a[j][0],2) + Math.pow(a[i][1] - a[j][1],2) + Math.pow(a[i][2] - a[j][2],2));
				result[f][1] = i;
				result[f][2] = j;
				f = f + 1;
			}
		}
		for (i = 0; i < f; i++)
		{
			for (j = f - 1; j > i - 1; j--)
			{
				 if (result[j][0] < result[j + 1][0])
				 {
					 for (k = 0;k < 3;k++)
					 {
					tmp = result[j + 1][k];
					result[j + 1][k] = result[j][k];
					 result[j][k] = tmp;
					 }
				 }
			}
		}
		for (i = 0;i < f;i++)
		{
			System.out.printf("(%d,%d,%d)-",a[(int)result[i][1]][0],a[(int)result[i][1]][1],a[(int)result[i][1]][2]);
			System.out.printf("(%d,%d,%d)=",a[(int)result[i][2]][0],a[(int)result[i][2]][1],a[(int)result[i][2]][2]);
			System.out.printf("%.2f\n",result[i][0]);
		}
		return 0;
	}
}

