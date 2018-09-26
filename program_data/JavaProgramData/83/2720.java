package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int i;
		float[] score = new float[10];
		float sum = 0F;
		float[] a = new float[10];
		float[] c = new float[10];
		float t = 0F;
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
		}
		for (i = 0;i < n;i++)
		{
			sum = sum + a[i];
		}
		for (i = 0;i < n;i++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				score[i] = Float.parseFloat(tempVar3);
			}
		}
		for (i = 0;i < n;i++)
		{
			if (score[i] <= 100F && score[i] >= 90F)
			{
				c[i] = 4F;
			}
			else if (score[i] <= 89F && score[i] >= 85F)
			{
				c[i] = 3.7F;
			}
			else if (score[i] <= 84F && score[i] >= 82F)
			{
				c[i] = 3.3F;
			}
			else if (score[i] <= 81F && score[i] >= 78F)
			{
				c[i] = 3.0F;
			}
			else if (score[i] <= 77F && score[i] >= 75F)
			{
				c[i] = 2.7F;
			}
			else if (score[i] <= 74F && score[i] >= 72F)
			{
				c[i] = 2.3F;
			}
			else if (score[i] <= 71F && score[i] >= 68F)
			{
				c[i] = 2.0F;
			}
			else if (score[i] <= 67F && score[i] >= 64F)
			{
				c[i] = 1.5F;
			}
			else if (score[i] <= 63F && score[i] >= 60F)
			{
				c[i] = 1.0F;
			}
			else
			{
				c[i] = 0F;
			}
		}
		for (i = 0;i < n;i++)
		{
			t = t + c[i] * a[i];
		}
		System.out.printf("%.2f\n",t / sum);
	}
}

