package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int[] a = new int[100];
		int n;
		int m = 0;
		int s = 0;
		int l = 0;
		int o = 0;
		int i;
		int e;
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
	   }
	for (i = 0,m = 0,s = 0,l = 0,o = 0;i < n;i++)
	{
		 if (a[i] <= 18)
		 {

			m += 1;
		 }
		 else if (a[i] <= 35)
		 {
			s += 1;



		 }
		 else if (a[i] <= 60)
		 {
			l += 1;


		 }
		 else if (a[i] > 60)
		 {
			o += 1;


		 }
	}

		System.out.printf("1-18: %.2lf%%\n",((double)m) / n * 100);
		System.out.printf("19-35: %.2lf%%\n",((double)s) / n * 100);
		System.out.printf("36-60: %.2lf%%\n",((double)l) / n * 100);
		System.out.printf("60??: %.2lf%%\n",((double)o) / n * 100);
	}


}

