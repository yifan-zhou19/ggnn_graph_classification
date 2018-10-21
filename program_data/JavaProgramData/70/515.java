public class point
{
	public double x;
	public double y;
}

package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int num = -1;
		int i;
		int j;
	point[] dot = tangible.Arrays.initializeWithDefaultpointInstances(40);
	double[] s = new double[1000];
	double max;
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
		dot[i].x = Double.parseDouble(tempVar2);
	}
	String tempVar3 = ConsoleInput.scanfRead(" ");
	if (tempVar3 != null)
	{
		dot[i].y = Double.parseDouble(tempVar3);
	}
	}
	for (i = 0;i < n;i++)
	{
	for (j = i + 1;j < n;j++)
	{
		num = num + 1;
		s[num] = (dot[j].x - dot[i].x) * (dot[j].x - dot[i].x) + (dot[j].y - dot[i].y) * (dot[j].y - dot[i].y);
	}
	}

	max = s[0];
	for (i = 1;i <= num + 2;i++)
	{
	if (s[i] > max)
	{
		max = s[i];
	}
	}
	System.out.printf("%.4f\n",Math.sqrt(max));
	}

}

