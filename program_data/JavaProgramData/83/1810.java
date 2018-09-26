package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int n;
	int i;
	float[] b = new float[10];
	float[] a = new float[10];
	float[] c = new float[10];
	float GPA;
	float sum1 = 0F;
	float sum2 = 0F;
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
		b[i] = Float.parseFloat(tempVar3);
	}
			if (90F <= b[i])
			{
			  c[i] = 4.0F;
			}
			if (b[i] >= 85F && b[i] <= 89F)
			{
			c[i] = 3.7F;
			}
			if (b[i] >= 82F && b[i] <= 84F)
			{
			c[i] = 3.3F;
			}
			if (b[i] >= 78F && b[i] <= 81F)
			{
			c[i] = 3.0F;
			}
			if (b[i] >= 75F && b[i] <= 77F)
			{
			c[i] = 2.7F;
			}
			if (b[i] >= 72F && b[i] <= 74F)
			{
			c[i] = 2.3F;
			}
			if (b[i] >= 68F && b[i] <= 71F)
			{
			c[i] = 2.0F;
			}
			if (b[i] >= 64F && b[i] <= 67F)
			{
			c[i] = 1.5F;
			}
			if (b[i] >= 60F && b[i] <= 63F)
			{
			c[i] = 1.0F;
			}
			if (b[i] <= 60F)
			{
			c[i] = 0F;
			}
			sum1 += c[i] * a[i];
			sum2 += a[i];
	}
	GPA = sum1 / sum2;
	System.out.printf("%.2lf",GPA);
	return 0;
	}

}

