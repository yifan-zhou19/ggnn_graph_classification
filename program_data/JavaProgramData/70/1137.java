public class location
{
public double x;
public double y;
}

package <missing>;

public class GlobalMembers
{
	public static location[] a = tangible.Arrays.initializeWithDefaultlocationInstances(1000);
	public static int Main()
	{
	int n;
	int i;
	int j;
	double max = 0;
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
		a[i].x = Double.parseDouble(tempVar2);
	}
	String tempVar3 = ConsoleInput.scanfRead(" ");
	if (tempVar3 != null)
	{
		a[i].y = Double.parseDouble(tempVar3);
	}
	}

	for (i = 0;i < n;i++)
	{
		for (j = 0;j < n;j++)
		{
	if (Math.sqrt((a[i].x - a[j].x) * (a[i].x - a[j].x) + (a[i].y - a[j].y) * (a[i].y - a[j].y)) > max)
	{
	max = Math.sqrt((a[i].x - a[j].x) * (a[i].x - a[j].x) + (a[i].y - a[j].y) * (a[i].y - a[j].y));
	}
		}
	}
	System.out.printf("%.4lf",max);
	}
}

