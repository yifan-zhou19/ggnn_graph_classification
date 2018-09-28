package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int i;
	int n;
	int g = 1;
	int[] a = new int[50000];
	int[] b = new int[50000];
	int min;
	int max;
	double x;
	double t;
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
		a[i] = Integer.parseInt(tempVar2);
	}
	String tempVar3 = ConsoleInput.scanfRead();
	if (tempVar3 != null)
	{
		b[i] = Integer.parseInt(tempVar3);
	}
	}
	min = a[0];
	max = b[0];
	for (i = 1;i < n;i++)
	{
	if (a[i] < min)
	{
				 min = a[i];
	}
	if (b[i] > max)
	{
				 max = b[i];
	}
	}
	t = 0.5 + (double)min;
	for (x = t;x < max;x = x + 1.0)
	{
	for (i = 0;i < n;i++)
	{
		  if (a[i] < x && x < b[i])
		  {
							 break;
		  }
		  else if (i == n - 1)
		  {
			   g = 0;
			   System.out.print("no");
			   break;
		  }
	}
	if (g == 0)
	{
			 break;
	}
	else if (x == (float)max - 0.5)
	{
		 System.out.printf("%d %d",min,max);
	}
	}
	return 0;
	}

}

