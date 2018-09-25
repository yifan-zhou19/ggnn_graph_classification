package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int i;
	int n;
	int t = 0;
	int m = 0;
	int k;
	double[] c = new double[40];
	double[] d = new double[40];
	double l;

//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//struct
	//{
	//	 char z[10];
	//	 double b;
	//}
	//a[40];

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
			  a[i].z = tempVar2;
		  }
		  String tempVar3 = ConsoleInput.scanfRead(" ");
		  if (tempVar3 != null)
		  {
			  a[i].b = tempVar3;
		  }
	  }

	  for (i = 0;i < n;i++)
	  {
		  if (a[i].z[0] == 'm')
		  {
			  c[t] = a[i].b;
			  t++;
		  }
		  else if (a[i].z[0] == 'f')
		  {
			  d[m] = a[i].b;
			  m++;
		  }
	  }

	  for (i = 0;i < t;i++)
	  {
		  for (k = 0;k < t - 1;k++)
		  {
			  if (c[k] > c[k + 1])
			  {
				  l = c[k + 1];
				  c[k + 1] = c[k];
				  c[k] = l;
			  }
		  }
	  }
	System.out.printf("%.2lf",c[0]);
	for (i = 1;i < t;i++)
	{
		System.out.printf(" %.2lf",c[i]);
	}

	for (i = 0;i < m;i++)
	{
		for (k = 0;k < m - 1;k++)
		{
			if (d[k] < d[k + 1])
			{
				l = d[k];
				d[k] = d[k + 1];
				d[k + 1] = l;
			}
		}
	}
	for (k = 0;k < m;k++)
	{
		System.out.printf(" %.2lf",d[k]);
	}
	return 0;
	}
}

