package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int n;
	int i;
	int k;
	int e;
	int w;
	int j;
	int min;
	int max;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	int[] a = new int[n];
	int[] b = new int[n];
	for (i = 0;i < n;i++)
	{
	if (i == n - 1)
	{
	String tempVar2 = ConsoleInput.scanfRead();
	if (tempVar2 != null)
	{
		(a[i]) = Integer.parseInt(tempVar2);
	}
	String tempVar3 = ConsoleInput.scanfRead(" ");
	if (tempVar3 != null)
	{
		(b[i]) = Integer.parseInt(tempVar3);
	}
	}
	else
	{
	String tempVar4 = ConsoleInput.scanfRead();
	if (tempVar4 != null)
	{
		(a[i]) = Integer.parseInt(tempVar4);
	}
	String tempVar5 = ConsoleInput.scanfRead(" ");
	if (tempVar5 != null)
	{
		(b[i]) = Integer.parseInt(tempVar5);
	}
	}
	}
	for (k = 1;k < n;k++)
	{
	for (i = 0;i < n - k;i++)
	{
	if (a[i] > a[i + 1])
	{
	e = a[i];
	a[i] = a[i + 1];
	a[i + 1] = e;
	w = b[i];
	b[i] = b[i + 1];
	b[i + 1] = w;
	}
	}
	}
	min = a[0];
	max = b[0];
	j = 1;
	for (i = 1;i < n;i++)
	{
		if (min <= a[i])
		{
		if (max < a[i])
		{
		  j = 0;
		}
		else
		{
		if (max <= b[i])
		{
		max = b[i];
		}
		}
		}
	   if (min > a[i])
	   {
	   if (b[i] < min)
	   {
	   j = 0;
	   }
	   else
	   {
	   min = a[i];
	   if (max <= b[i])
	   {
	   max = b[i];
	   }
	   }
	   }
	}
	if (j == 0)
	{
	System.out.print("no");
	}
	else
	{
	System.out.printf("%d %d",min,max);
	}
	return 0;
	}


}

