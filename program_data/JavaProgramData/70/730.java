package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int n;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	int i;
	float[][] c = new float[100][2];
	for (i = 0;i < n;i++)
	{
	String tempVar2 = ConsoleInput.scanfRead();
	if (tempVar2 != null)
	{
		c[i][0] = Float.parseFloat(tempVar2);
	}
	String tempVar3 = ConsoleInput.scanfRead();
	if (tempVar3 != null)
	{
		c[i][1] = Float.parseFloat(tempVar3);
	}
	}
	int k;
	int m = 0;
	float[] juli = new float[100];
	for (i = 0;i < n;i++)
	{
	for (k = i + 1;k < n;k++)
	{
	juli[m] = (c[i][0] - c[k][0]) * (c[i][0] - c[k][0]) + (c[i][1] - c[k][1]) * (c[i][1] - c[k][1]);
	m++;
	}
	}
	float f = 0F;
	for (i = 0;i < m;i++)
	{
	if (juli[i] > f)
	{
	f = juli[i];
	}
	}
	System.out.printf("%.4f",Math.sqrt(f));
	}


}

