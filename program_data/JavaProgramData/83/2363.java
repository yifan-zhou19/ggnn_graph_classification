package <missing>;

public class GlobalMembers
{
	public static int s = 0;
	public static int[] g = new int[10];
	public static int[] p = new int[10];
	public static int n;
	public static float grade = 0F;

	public static float gpa(int x)
	{
	float f;
	if (x >= 90)
	{
		f = 4.0F;
	}
	else if (x >= 85)
	{
		f = 3.7F;
	}
	else if (x >= 82)
	{
		f = 3.3F;
	}
	else if (x >= 78)
	{
		f = 3.0F;
	}
	else if (x >= 75)
	{
		f = 2.7F;
	}
	else if (x >= 72)
	{
		f = 2.3F;
	}
	else if (x >= 68)
	{
		f = 2.0F;
	}
	else if (x >= 64)
	{
		f = 1.5F;
	}
	else if (x >= 60)
	{
		f = 1.0F;
	}
	else
	{
		f = 0F;
	}
	return f;
	}

	public static int Main()
	{
	int i;
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
		g[i] = Integer.parseInt(tempVar2);
	}
	s += g[i];
	}
	for (i = 0;i < n;i++)
	{
	String tempVar3 = ConsoleInput.scanfRead();
	if (tempVar3 != null)
	{
		p[i] = Integer.parseInt(tempVar3);
	}
	}
	for (i = 0;i < n;i++)
	{
	grade += gpa(p[i]) * g[i];
	}
	System.out.printf("%.2f\n",grade / s);
	return 0;
	}

}

