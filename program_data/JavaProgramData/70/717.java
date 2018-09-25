package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		float[][] x = new float[100][2];
		float[] s = new float[1000];
		float max = 0F;
		int i;
		int j;
		int m;
		int n;
		int k = 0;
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
				x[i][0] = Float.parseFloat(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				x[i][1] = Float.parseFloat(tempVar3);
			}
		}
		for (i = 0;i < n;i++)
		{
			for (j = 0;j < n;j++)
			{
				if (i == j)
				{
					continue;
				}
				else
				{
					s[k] = (x[i][0] - x[j][0]) * (x[i][0] - x[j][0]) + (x[i][1] - x[j][1]) * (x[i][1] - x[j][1]);
					k++;
				}
			}
		}
		for (i = 0;i < (n - 1) * (n - 1);i++)
		{
			max = max > s[i] != 0?max:s[i];
		}
		max = Math.pow(max,0.5);
		System.out.printf("%.4f",max);
	}
}

