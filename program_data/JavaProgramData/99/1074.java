package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	  int n;
	  int i;
	  int[] a = new int[200];
	  int e = 0;
	  int b = 0;
	  int c = 0;
	  int d = 0;
	  double A;
	  double B;
	  double C;
	  double D;
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
		  if (a[i] >= 1 && a[i] <= 18)
		  {
			  e = e+1;
		  }
		  if (a[i] >= 19 && a[i] <= 35)
		  {
			  b = b + 1;
		  }
		  if (a[i] >= 36 && a[i] <= 60)
		  {
			  c = c + 1;
		  }
		  if (a[i] > 60)
		  {
			  d = d + 1;
		  }
	  }

	  A = (double)(100.0 * e / n);
	  B = (double)(100.0 * b / n);
	  C = (double)(100.0 * c / n);
	  D = (double)(100.0 * d / n);


	  System.out.printf("1-18: %.2lf%%\n",A);
	  System.out.printf("19-35: %.2lf%%\n",B);
	  System.out.printf("36-60: %.2lf%%\n",C);
	  System.out.printf("60??: %.2lf%%\n",D);




	  return 0;
	}
}

