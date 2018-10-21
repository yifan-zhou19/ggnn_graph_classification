package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		  int n;
		  double max = 0;
		  double d;
		  String tempVar = ConsoleInput.scanfRead();
		  if (tempVar != null)
		  {
			  n = Integer.parseInt(tempVar);
		  }
		  double[] a = new double[n];
		  double[] b = new double[n];
		  for (int i = 0;i < n;i++)
		  {
		  String tempVar2 = ConsoleInput.scanfRead();
		  if (tempVar2 != null)
		  {
			  a[i] = Double.parseDouble(tempVar2);
		  }
		  String tempVar3 = ConsoleInput.scanfRead(" ");
		  if (tempVar3 != null)
		  {
			  b[i] = Double.parseDouble(tempVar3);
		  }
		  }
		  for (int i = 0;i < n - 1;i++)
		  {
		  for (int j = i + 1;j < n;j++)
		  {
				  d = Math.sqrt((a[i] - a[j]) * (a[i] - a[j]) + (b[i] - b[j]) * (b[i] - b[j]));
				  if (d > max)
				  {
				  max = d;
				  }
		  }
		  }
		  System.out.printf("%.4lf\n",max);
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'free' has no equivalent in Java:
		  free(a);
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'free' has no equivalent in Java:
		  free(b);
	}

}

