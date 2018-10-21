package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
	int n;
	int k;
	int m;
	int i;
	int a;
	int j;
	int p;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	String tempVar2 = ConsoleInput.scanfRead(" ");
	if (tempVar2 != null)
	{
		k = Integer.parseInt(tempVar2);
	}
	m = 0;
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
	shuo:
	m = m + 1;
	i = m;
	for (j = 1;j < n;j++)
	{
	p = n * i + k;
	a = p % (n - 1);
	if (a != 0)
	{
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
	goto shuo;
	}
	else
	{
	i = p / (n - 1);
	}
	}
	System.out.printf("%d",i * n + k);
	}
}

