package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int i;
	int n;
	int[] u = new int[10];
	int d;
	float GPA;
	float[] v = new float[10];
	float s;
	float[] z = new float[10];
	float a;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	d = 0;
	for (i = 0;i < n;i++)
	{
	String tempVar2 = ConsoleInput.scanfRead();
	if (tempVar2 != null)
	{
		u[i] = Integer.parseInt(tempVar2);
	}
	d = d + u[i];

	}
	for (i = 0;i < n;i++)
	{
	String tempVar3 = ConsoleInput.scanfRead();
	if (tempVar3 != null)
	{
		v[i] = Float.parseFloat(tempVar3);
	}
	}
	for (i = 0;i < n;i++)
	{
	if (v[i] <= 100F && v[i] >= 90F)
	{
		z[i] = 4.0F;
	}
	else if (v[i] <= 89F && v[i] >= 85F)
	{
		z[i] = 3.7F;
	}
	else if (v[i] <= 84F && v[i] >= 82F)
	{
		z[i] = 3.3F;
	}
	else if (v[i] <= 81F && v[i] >= 78F)
	{
		z[i] = 3.0F;
	}
	else if (v[i] <= 77F && v[i] >= 75F)
	{
		z[i] = 2.7F;
	}
	else if (v[i] <= 74F && v[i] >= 72F)
	{
		z[i] = 2.3F;
	}
	else if (v[i] <= 71F && v[i] >= 68F)
	{
		z[i] = 2.0F;
	}
	else if (v[i] <= 67F && v[i] >= 64F)
	{
		z[i] = 1.5F;
	}
	else if (v[i] <= 63F && v[i] >= 60F)
	{
		z[i] = 1.0F;
	}
	else
	{
		z[i] = 0F;
	}
	}
	s = 0F;
	for (i = 0;i < n;i++)
	{
	a = u[i] * z[i];
		s += a;
	}
	GPA = s / d;
	System.out.printf("%.2f",GPA);
	return 0;

	}
}

