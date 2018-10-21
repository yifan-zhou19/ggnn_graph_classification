package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int i;
		float total = 0.0F;
		float totalII = 0.0F;
		float GPA;
		float[] a = new float[10];
		float[] b = new float[10];
		float[] c = new float[10];
		float[] d = new float[10];
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
		}
		for (i = 0;i < n;i++)
		{
			if (b[i] <= 100F && b[i] >= 90F)
			{
				c[i] = 4.0F;
			}
			else if (b[i] <= 89F && b[i] >= 85F)
			{
				c[i] = 3.7F;
			}
			else if (b[i] <= 84F && b[i] >= 82F)
			{
				c[i] = 3.3F;
			}
			else if (b[i] <= 81F && b[i] >= 78F)
			{
				c[i] = 3.0F;
			}
			else if (b[i] <= 77F && b[i] >= 75F)
			{
				c[i] = 2.7F;
			}
			else if (b[i] <= 74F && b[i] >= 72F)
			{
				c[i] = 2.3F;
			}
			else if (b[i] <= 71F && b[i] >= 68F)
			{
				c[i] = 2.0F;
			}
			else if (b[i] <= 67F && b[i] >= 64F)
			{
				c[i] = 1.5F;
			}
			else if (b[i] <= 63F && b[i] >= 60F)
			{
				c[i] = 1.0F;
			}
			else if (b[i] <= 60F && b[i] >= 0F)
			{
				c[i] = 0F;
			}
		}
		for (i = 0;i < n;i++)
		{
			d[i] = a[i] * c[i];
		}
		for (i = 0;i < n;i++)
		{
			total = total + d[i];
			totalII = totalII + a[i];
		}
		GPA = total / totalII;
		System.out.printf("%.2f",GPA);
		return;
	}
}

