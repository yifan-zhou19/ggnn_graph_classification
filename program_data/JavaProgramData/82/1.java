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
	int[] b = new int[n];
	int i;
	for (i = 0; i < n; i++)
	{
	   String tempVar2 = ConsoleInput.scanfRead();
	   if (tempVar2 != null)
	   {
		   a[i] = Integer.parseInt(tempVar2);
	   }
	   String tempVar3 = ConsoleInput.scanfRead(" ");
	   if (tempVar3 != null)
	   {
		   b[i] = Integer.parseInt(tempVar3);
	   }
	}
	int[] c = new int[n];
	int p = 0;
	for (i = 0; i < n - 1; i++)
	{
			if ((a[i] >= 90 && a[i] <= 140) && (b[i] >= 60 && b[i] <= 90))
			{
			 p = p + 1;
			 c[i] = 0;
			}
			else
			{
			 c[i] = p;
			 p = 0;
			}
	}
	if ((a[n - 1] >= 90 && a[n - 1] <= 140) && (b[n - 1] >= 60 && b[n - 1] <= 90))
	{
		c[n - 1] = p + 1;
	}
	else
	{
		c[n - 1] = p;
	}
	int Max = 0;
	for (i = 0; i < n; i++)
	{
	   if (Max < c[i])
	   {
	   Max = c[i];
	   }
	}
	System.out.printf("%d", Max);
	}
}

