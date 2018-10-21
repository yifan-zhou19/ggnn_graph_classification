package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	  int sum1;
	  int sum2;
	  int sum3;
	  int sum4;
	  int i;
	  int n;
	  int sum;
	  double q;
	  double w;
	  double e;
	  double r;
	  sum1 = 0;
	  sum2 = 0;
	  sum3 = 0;
	  sum4 = 0;
	  sum = 0;
	  q = 0;
	  w = 0;
	  e = 0;
	  r = 0;
	  String tempVar = ConsoleInput.scanfRead();
	  if (tempVar != null)
	  {
		  n = Integer.parseInt(tempVar);
	  }
	  int[] a = new int[n];
	  for (i = 0;i < n;i++)
	  {
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			a[i] = Integer.parseInt(tempVar2);
		}
		if (1 <= a[i] != 0 && a[i] <= 18)
		{
		 sum1++;
		}
		if (19 <= a[i] != 0 && a[i] <= 35)
		{
		  sum2++;
		}
		 if (36 <= a[i] != 0 && a[i] <= 60)
		 {
		 sum3++;
		 }
		 if (a[i] > 60)
		 {
		 sum4++;
		 }
	  }
		sum = sum1 + sum2 + sum3 + sum4;
		q = (double)sum1 / (double)sum;
		w = (double)sum2 / (double)sum;
		e = (double)sum3 / (double)sum;
		r = (double)sum4 / (double)sum;
		System.out.printf("1-18: %.2lf%%\n19-35: %.2lf%%\n36-60: %.2lf%%\n60??: %.2lf%%",q * 100,w * 100,e * 100,r * 100);
		return 0;
	}





}

