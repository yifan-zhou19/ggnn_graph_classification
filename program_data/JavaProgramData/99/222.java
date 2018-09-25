package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	  int n;
	  int[] c = new int[4];
	  int i;
	  double[] a = new double[4];
	  String tempVar = ConsoleInput.scanfRead();
	  if (tempVar != null)
	  {
		  n = Integer.parseInt(tempVar);
	  }
	  for (i = 0;i < n;i++)
	  {
			 int bi;
			 String tempVar2 = ConsoleInput.scanfRead();
			 if (tempVar2 != null)
			 {
				 bi = Integer.parseInt(tempVar2);
			 }
			 if (bi <= 18)
			 {
				 c[0]++;
			 }
			 else if (bi > 18 && bi <= 35)
			 {
				 c[1]++;
			 }
			 else if (bi > 35 && bi <= 60)
			 {
				 c[2]++;
			 }
			 else if (bi > 60)
			 {
				 c[3]++;
			 }
	  }
		 for (i = 0;i < 4;i++)
		 {
			  a[i] = (double)c[i] / n * 100;
		 }
		 System.out.printf("1-18: %.2lf",a[0]);
		System.out.print("%%\n");
		 System.out.printf("19-35: %.2lf",a[1]);
		System.out.print("%%\n");
		 System.out.printf("36-60: %.2lf",a[2]);
		System.out.print("%%\n");
		 System.out.printf("60??: %.2lf",a[3]);
		System.out.print("%%");
	  return 0;
	}
}

