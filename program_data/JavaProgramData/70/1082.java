package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int n;
	int i;
	int j;
	float[][] a = new float[100][2];
	float s;
	float max = 0F;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	for (i = 1;i <= n;i++)
	{
	String tempVar2 = ConsoleInput.scanfRead();
	if (tempVar2 != null)
	{
		a[i][0] = Float.parseFloat(tempVar2);
	}
	String tempVar3 = ConsoleInput.scanfRead(" ");
	if (tempVar3 != null)
	{
		a[i][1] = Float.parseFloat(tempVar3);
	}
	}
	for (i = 1;i <= n;i++)
	{
	for (j = i + 1;j <= n;j++)
	{
	if (((a[i][0] - a[j][0]) * (a[i][0] - a[j][0]) + (a[i][1] - a[j][1]) * (a[i][1] - a[j][1])) > max)
	{
	max = (a[i][0] - a[j][0]) * (a[i][0] - a[j][0]) + (a[i][1] - a[j][1]) * (a[i][1] - a[j][1]);
	}
	}
	}
	s = Math.sqrt(max);
	System.out.printf("%0.4f",s);
	System.in.read();
	System.in.read();
	System.in.read();
	}

}

