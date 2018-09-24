package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] x = new int[10];
		int[] y = new int[10];
		int[] z = new int[10];
		int n;
		int i;
		int j;
		int c;
		int maxi;
		int maxj;
		float[][] s = new float[10][10];
		float max;
		max = 0.0f;
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
				x[i] = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				y[i] = Integer.parseInt(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead(" ");
			if (tempVar4 != null)
			{
				z[i] = Integer.parseInt(tempVar4);
			}
		}
		for (i = 0;i < n - 1;i++)
		{
			for (j = i + 1;j < n;j++)
			{
				s[i][j] = Math.sqrt((x[i] - x[j]) * (x[i] - x[j]) + (y[i] - y[j]) * (y[i] - y[j]) + (z[i] - z[j]) * (z[i] - z[j]));
			}
		}
		for (c = 0;c < (n * (n - 1) / 2);c++)
		{
			for (i = 0;i < n - 1;i++)
			{
				for (j = i + 1;j < n;j++)
				{
					if (s[i][j] > max)
					{
						max = s[i][j];
						maxi = i;
						maxj = j;
					}
				}
			}
			System.out.printf("(%d,%d,%d)-(%d,%d,%d)=%.2f\n",x[maxi],y[maxi],z[maxi],x[maxj],y[maxj],z[maxj],max);
			s[maxi][maxj] = 0.0f;
			max = 0.0f;
			maxi = i;
			maxj = j;
		}
		return 0;
	}
}

