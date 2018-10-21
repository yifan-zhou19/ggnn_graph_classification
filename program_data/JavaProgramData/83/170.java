package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int i;
	int n;
	int[] point = new int[10];
	int goal;
	float f;
	float num;
	float gpa;
	float c = 0F;
	float d = 0F;
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
		point[i] = Integer.parseInt(tempVar2);
	}
	c = c + point[i];
	}
	for (i = 0;i < n;i++)
	{
	String tempVar3 = ConsoleInput.scanfRead();
	if (tempVar3 != null)
	{
		goal = Integer.parseInt(tempVar3);
	}
	if (goal >= 90 && goal <= 100)
	{
		f = 4.0F;
	}
	if (goal >= 85 && goal <= 89)
	{
		f = 3.7F;
	}
	if (goal >= 82 && goal <= 84)
	{
		f = 3.3F;
	}
	if (goal >= 78 && goal <= 81)
	{
		f = 3.0F;
	}
	if (goal >= 75 && goal <= 77)
	{
		f = 2.7F;
	}
	if (goal >= 72 && goal <= 74)
	{
		f = 2.3F;
	}
	if (goal >= 68 && goal <= 71)
	{
		f = 2.0F;
	}
	if (goal >= 64 && goal <= 67)
	{
		f = 1.5F;
	}
	if (goal >= 60 && goal <= 63)
	{
		f = 1.0F;
	}
	if (goal < 60)
	{
		f = 0F;
	}
	num = point[i] * f;
	d = d + num;

	}
	gpa = (double)(d / c);
	System.out.printf("%.2f",gpa);
	}


}

