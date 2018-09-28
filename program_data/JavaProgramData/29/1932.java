package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		float[] sum = new float[10000];
		float K;
		float[] a = new float[10000];
		float[] b = new float[10000];
		int m;
		int[] n = new int[10000];
		int i;
		int l;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		for (i = 0;i < m;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				n[i] = Integer.parseInt(tempVar2);
			}
		}
		for (i = 0;i < m;i++)
		{
			if (n[i] == 1)
			{
				System.out.print("2.000\n");
			}
			else
			{
				for (l = 1;l < n[i];l++)
				{
					a[0] = 2F,b[0] = 1F,sum[0] = 2F;
					a[l] = a[l - 1] + b[l - 1];
					b[l] = a[l - 1];
					sum[l] = sum[l - 1] + a[l] / b[l];
					K = sum[l];
				}

				System.out.printf("%.3f\n",K);
			}
		}

		return 0;
	}



}

