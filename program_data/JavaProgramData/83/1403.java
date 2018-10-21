package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
	int i;
	int n;
	float[] b = new float[10];
	float y;
	float s;
	float[] a = new float[10];
	float x;
	float GPA;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	y = 0F;
	for (i = 0;i < n;i++)
	{
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			b[i] = Float.parseFloat(tempVar2);
		}
	 y = y + b[i];
	}
	s = 0F;
	for (i = 0;i < n;i++)
	{
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			x = Float.parseFloat(tempVar3);
		}
	if (x >= 90F && x <= 100F)
	{
	   a[i] = 4.0F;
	}
	else if (x >= 85F && x <= 89F)
	{
	   a[i] = 3.7F;
	}
	else if (x >= 82F && x <= 84F)
	{
	   a[i] = 3.3F;
	}
	else if (x >= 78F && x <= 81F)
	{
	   a[i] = 3.0F;
	}
	else if (x >= 75F && x <= 77F)
	{
	   a[i] = 2.7F;
	}
	else if (x >= 72F && x <= 74F)
	{
	   a[i] = 2.3F;
	}
	else if (x >= 68F && x <= 71F)
	{
	   a[i] = 2.0F;
	}
	else if (x >= 64F && x <= 67F)
	{
	   a[i] = 1.5F;
	}
	else if (x >= 60F && x <= 63F)
	{
	   a[i] = 1.0F;
	}
	else if (x <= 60F)
	{
	   a[i] = 0F;
	}
	s = s + a[i] * b[i];
	}
	GPA = s / y;
	System.out.printf("%.2lf",GPA);
	}

}

