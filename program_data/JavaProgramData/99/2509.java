package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int[] a = new int[101];
		int s1 = 0;
		int s2 = 0;
		int s3 = 0;
		int s4 = 0;
		double m1;
		double m2;
		double m3;
		double m4;
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
			 if (1 <= a[i] != 0 && a[i] <= 18)
			 {
					s1++;
			 }
			 else if (19 <= a[i] != 0 && a[i] <= 35)
			 {
					s2++;
			 }
			 else if (36 <= a[i] != 0 && a[i] <= 60)
			 {
					s3++;
			 }
			 else if (a[i] > 60)
			 {
					s4++;
			 }
		}
		 m1 = (double)s1 / n * 100;
		 m2 = (double)s2 / n * 100;
		 m3 = (double)s3 / n * 100;
		 m4 = (double)s4 / n * 100;
		 System.out.printf("1-18: %.2lf",m1);
		 System.out.print("%%\n");
		 System.out.printf("19-35: %.2lf",m2);
		 System.out.print("%%\n");
		 System.out.printf("36-60: %.2lf",m3);
		 System.out.print("%%\n");
		 System.out.printf("60??: %.2lf",m4);
		 System.out.print("%%\n");
		 return 0;
	}




}

