package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int i;
		int t = 0;
		float pj = 0.0F;
		float max;
		float[] a = new float[300];
		float[] b = new float[300];
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
			pj = pj + a[i];
		}
		pj = pj / n; //    printf("pj%f\n",pj);
		for (i = 0;i < n;i++)
		{
			if (a[i] > pj)
			{
				b[i] = a[i] - pj;
			}
			else
			{
				b[i] = pj - a[i];
			}
		}
		max = b[0];
		for (i = 1;i < n;i++)
		{
			if (max < b[i])
			{
				max = b[i]; //printf("max%f\n",max);
			}
		}
			for (i = 0;i < n;i++)
			{
					if (b[i] == max && t == 0)
					{
						System.out.printf("%d",(int)a[i]);
						t++;
					}
					else if (b[i] == max)
					{
						System.out.printf(",%d",(int)a[i]);
					}
			}
	}
}

