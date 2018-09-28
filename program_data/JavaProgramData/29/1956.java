package <missing>;

public class GlobalMembers
{
	public static int[] feibo = new int[200];
	public static float[] fen = new float[100];
	public static int feii(int n)
	{
		if (feibo[n] != 0)
		{
			return feibo[n];
		}
		if (n == 1)
		{
			return feibo[n] = 1;
		}
		if (n == 2)
		{
			return feibo[n] = 2;
		}
		return feibo[n] = feii(n - 1) + feii(n - 2);
	}
	public static int Main()
	{
		int n;
		int m;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		while (m-- != 0)
		{
			int i;
			int j;
			float sum = 0F;
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				n = Integer.parseInt(tempVar2);
			}
			for (i = 1;i <= n + 1;i++)
			{
				feii(i);
			}
			for (i = 1;i <= n;i++)
			{
				if (fen[i] == 0F)
				{
					fen[i] = (float)feibo[i + 1] / (float)feibo[i];
				}
				sum += fen[i];
			}
			System.out.printf("%.3f\n",sum);
		}
	}
}

