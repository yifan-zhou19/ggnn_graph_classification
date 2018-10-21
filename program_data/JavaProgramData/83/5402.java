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
	int[] a = new int[n];
	int[] sz = new int[n];
	int i;
	int m;
	double j;
	double GPA;
	double f;
	GPA = 0;
	m = 0;
	for (i = 0;i < n;i++)
	{
	String tempVar2 = ConsoleInput.scanfRead();
	if (tempVar2 != null)
	{
		a[i] = Integer.parseInt(tempVar2);
	}
	m = m + a[i];
	}
	for (i = 0;i < n;i++)
	{
	String tempVar3 = ConsoleInput.scanfRead();
	if (tempVar3 != null)
	{
		sz[i] = Integer.parseInt(tempVar3);
	}
	}
	for (i = 0;i < n;i++)
	{
	if ((sz[i] >= 90) && (sz[i] <= 100))
	{
	j = 4.0;
	}
	else if ((sz[i] >= 85) && (sz[i] <= 89))
	{
	j = 3.7;
	}
	else if ((sz[i] >= 82) && (sz[i] <= 84))
	{
	j = 3.3;
	}
	else if ((sz[i] >= 78) && (sz[i] <= 81))
	{
	j = 3.0;
	}
	else if ((sz[i] >= 75) && (sz[i] <= 77))
	{
	j = 2.7;
	}
	else if ((sz[i] >= 72) && (sz[i] <= 74))
	{
	j = 2.3;
	}
	else if ((sz[i] >= 68) && (sz[i] <= 71))
	{
	j = 2.0;
	}
	else if ((sz[i] >= 64) && (sz[i] <= 67))
	{
	j = 1.5;
	}
	else if ((sz[i] >= 60) && (sz[i] <= 63))
	{
	j = 1.0;
	}
	else if (sz[i] < 60)
	{
	j = 0;
	}
	f = j * a[i];
	GPA = GPA + f;
	}
	GPA = GPA / m;
	System.out.printf("%.2f",GPA);
	return 0;
	}

}

