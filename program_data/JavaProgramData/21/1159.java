package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int i;
		int j;
		int k;
		int t = 0;
		float ave = 0.0F;
		float[] a = new float[300];
		float[] b = new float[300];
		float max = 0.0F;
		float p = 0.0F;
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
				a[i] = Float.parseFloat(tempVar2);
			}
			ave = ave + a[i];


		}
		ave = ave / n;
		for (i = 0;i < n;i++)
		{
			b[i] = a[i] - ave;
			if (b[i] < 0F)
			{
				b[i] = -b[i];
			}
		//	printf("%f\n",b[i]);
		}
		max = b[0];
		for (i = 0;i < n;i++)
		{
			if (b[i] > max)
			{
				max = b[i];
			}
		}
		k = 0;
		for (i = 0;i < n;i++)
		{
			if (b[i] == max)
			{
				k = k + 1;
			}
		}
		if (k == 1)
		{
			for (i = 0;i < n;i++)
			{
				if (b[i] == max)
				{
					System.out.printf("%d",(int)a[i]);
				}
			}
		}
		else
		{
			for (i = 0;i < n;i++)
			{
				for (j = 0;j < n - 1 - i;j++)
				{
					if (a[i] > a[i + 1])
					{
						p = a[i];
						a[i] = a[i + 1];
						a[i + 1] = p;
					}
				}
			}
			t = 0;
			for (i = 0;i < n;i++)
			{
				if (b[i] == max)
				{
					t = t + 1;
					if (t == 1)
					{
						System.out.printf("%d",(int)a[i]);
					}
					else
					{
						System.out.printf(",%d",(int)a[i]);
					}
				}
			}
		}
	}


}

