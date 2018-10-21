package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	 int n;
	 int i;
	 float gpa;
	 float B;
	 float A;
	 String tempVar = ConsoleInput.scanfRead();
	 if (tempVar != null)
	 {
		 n = Integer.parseInt(tempVar);
	 }
	 float[] a = new float[10];
	 float[] b = new float[10];
	 float[] c = new float[10];
	for (i = 0;i < n;i++)
	{
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			a[i] = Float.parseFloat(tempVar2);
		}
		A += a[i];
	}

	for (i = 0;i < n;i++)
	{
	String tempVar3 = ConsoleInput.scanfRead();
	if (tempVar3 != null)
	{
		b[i] = Float.parseFloat(tempVar3);
	}
	if (b[i] >= 90F)
	{
		c[i] = 4.0F;
	}
	else if (b[i] >= 85F)
	{
		c[i] = 3.7F;
	}
	else if (b[i] >= 82F)
	{
		c[i] = 3.3F;
	}
	else if (b[i] >= 78F)
	{
		c[i] = 3.0F;
	}
	else if (b[i] >= 75F)
	{
		c[i] = 2.7F;
	}
	else if (b[i] >= 72F)
	{
		c[i] = 2.3F;
	}
	else if (b[i] >= 68F)
	{
		c[i] = 2.0F;
	}
	else if (b[i] >= 64F)
	{
		c[i] = 1.5F;
	}
	else if (b[i] >= 60F)
	{
		c[i] = 1.0F;
	}
	else
	{
		c[i] = 0.0F;
	}
	B += c[i] * a[i];
	}
	gpa = B / A;
	System.out.printf("%.2f",gpa);

	 return 0;
	}
}

