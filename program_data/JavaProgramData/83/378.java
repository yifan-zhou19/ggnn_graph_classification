package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int i;
		float[] a = new float[10];
		float[] b = new float[10];
		float[] s = new float[10];
		float jd;
		float xfjd;
		float gpa;
		float sum1 = 0F;
		float sum2 = 0F;
		float jidian = float f;
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
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				s[i] = Float.parseFloat(tempVar3);
			}
		}
		for (i = 0;i < n;i++)
		{
			jd = jidian(s[i]);
			xfjd = a[i] * jd;
			b[i] = xfjd;
		}
		for (i = 0;i < n;i++)
		{
			sum1 += b[i];
		}
		for (i = 0;i < n;i++)
		{
			sum2 += a[i];
		}
		gpa = sum1 / sum2;
		System.out.printf("%.2f\n",gpa);
	}
	public static float jidian(float f)
	{
		float j;
		if (f <= 100F && f >= 90F)
		{
			j = 4F;
		}
		else if (f <= 89F && f >= 85F)
		{
			j = 3.7F;
		}
		else if (f <= 84F && f >= 82F)
		{
			j = 3.3F;
		}
		else if (f <= 81F && f >= 78F)
		{
			j = 3.0F;
		}
		else if (f <= 77F && f >= 75F)
		{
			j = 2.7F;
		}
		else if (f <= 74F && f >= 72F)
		{
			j = 2.3F;
		}
		else if (f <= 71F && f >= 68F)
		{
			j = 2.0F;
		}
		else if (f <= 67F && f >= 64F)
		{
			j = 1.5F;
		}
		else if (f <= 62F && f >= 60F)
		{
			j = 1.0F;
		}
		else if (f < 60F)
		{
			j = 0F;
		}
		return j;
	}





}

