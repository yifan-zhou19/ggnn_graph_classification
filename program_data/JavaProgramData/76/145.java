package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int[] a = new int[50000];
	int[] b = new int[50000];
	int n;
	int nummax;
	int nummin;
	int max;
	int min;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	for (int i = 0;i < n;i++)
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
	max = a[0];
	min = a[0];
	nummax = 50000;
	nummin = 50000;
	for (int k = 0;k < n;k++)
	{
	 for (int j = 0;j < n;j++)
	 {
	  if (a[j] <= a[k] != 0 && a[k] <= b[j] != 0 && b[j] <= b[k])
	  {
	  a[k] = a[j];
	  b[j] = b[k];
	  }
	  if (a[j] <= a[k] != 0 && a[k] <= b[k] != 0 && b[k] <= b[j])
	  {
	  a[k] = a[j];
	  b[k] = b[j];
	  }

	 }
	}
	for (int u = 0;u < n;u++)
	{
	   if (max <= b[u])
	   {
	max = b[u];
	 nummax = u;
	   }
	   if (min >= a[u])
	   {
	min = a[u];
	nummin = u;
	   }

	}
	if (b[nummin] == max && a[nummax] == min)
	{
	System.out.printf("%d %d",min,max);
	}
	else
	{
	System.out.print("no");
	}

	return 0;
	}

}

