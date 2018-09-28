package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int n;
	int i;
	int c = 0;
	int[] d = new int[100];
	int a;
	int b;
	int max = 0;
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
		a = Integer.parseInt(tempVar2);
	}
	String tempVar3 = ConsoleInput.scanfRead(" ");
	if (tempVar3 != null)
	{
		b = Integer.parseInt(tempVar3);
	}
	if (a >= 90 && a <= 140 && b >= 60 && b <= 90)
	{
	c++;
	d[i] = c;
	}
	else
	{
	d[i] = c;
	c = 0;
	}
	}
	for (i = 0;i < n;i++)
	{
	if (max < d[i])
	{
		max = d[i];
	}
	}
	System.out.printf("%d",max);
	return 0;
	}
}

