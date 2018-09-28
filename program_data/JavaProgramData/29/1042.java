package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m;
		int[] n = new int[999];
		float[] f = new float[999];
		float[] k = new float[999];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		int i = 0;
		int x = 1;
		for (i = 0;i < m;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				n[i] = Integer.parseInt(tempVar2);
			}
			if (n[i] > x)
			{
				x = n[i];
			}
		}



		int j = 3;
		f[1] = 1F,f[2] = 2F,k[1] = 2F;
		x = x + 2;
		for (j = 3;j <= x;j++)
		{
			f[j] = f[j - 1] + f[j - 2];
			k[j - 1] = k[j - 2] + f[j] / f[j - 1];
		}




		for (i = 0;i < m;i++)
		{
			System.out.printf("%.3f\n",k[n[i]]);
		}
		return 0;
	}

}

