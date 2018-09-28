package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
	int n;
	int a;
	int c;
	float[] m = new float[100];
	float[] s = new float[100];
	float[] j = new float[100];
	float GPA;
	float sum = 0F;
	float w = 0F;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	for (a = 0;a < n;a++)
	{
	String tempVar2 = ConsoleInput.scanfRead();
	if (tempVar2 != null)
	{
		s[a] = Float.parseFloat(tempVar2);
	}
	w += s[a];
	}
	for (a = 0;a < n;a++)
	{
	String tempVar3 = ConsoleInput.scanfRead();
	if (tempVar3 != null)
	{
		j[a] = Float.parseFloat(tempVar3);
	}
	if (j[a] >= 90F && j[a] <= 100F)
	{
	m[a] = 4.0F;
	}
	if (j[a] >= 85F && j[a] <= 89F)
	{
	m[a] = 3.7F;
	}
	if (j[a] >= 82F && j[a] <= 84F)
	{
	m[a] = 3.3F;
	}
	if (j[a] >= 78F && j[a] <= 81F)
	{
	m[a] = 3.0F;
	}
	if (j[a] >= 75F && j[a] <= 77F)
	{
	m[a] = 2.7F;
	}
	if (j[a] >= 72F && j[a] <= 74F)
	{
	m[a] = 2.3F;
	}
	if (j[a] >= 68F && j[a] <= 71F)
	{
	m[a] = 2.0F;
	}
	if (j[a] >= 64F && j[a] <= 67F)
	{
	m[a] = 1.5F;
	}
	if (j[a] >= 60F && j[a] <= 63F)
	{
	m[a] = 1.0F;
	}
	if (j[a] < 60F)
	{
	m[a] = 0F;
	}
	}
	for (c = 0;c < n;c++)
	{
	sum += m[c] * s[c];
	}
	GPA = sum / w;
	System.out.printf("%.2f",GPA);
	}
}

