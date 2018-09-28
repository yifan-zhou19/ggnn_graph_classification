package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int[] num = new int[100];
		int k;
		int[] zi = new int[100];
		int[] mu = new int[100];
		zi[0] = 2;
		mu[0] = 1;
		float[] sum = new float[100];
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
				num[i] = Integer.parseInt(tempVar2);
			}
			for (k = 0;k < num[i];k++)
			{
					sum[i] = sum[i] + (float)zi[k] / mu[k];
					mu[k + 1] = zi[k];
					zi[k + 1] = zi[k] + mu[k];
			}
			System.out.printf("%.3f\n",sum[i]);
		}
			return 0;
	}


}

