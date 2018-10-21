package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	 int n;
	 int m;
	 int i;
	 int j;
	 int f;
	 int e;
	 int k;
	 int[] q = new int[10000];
	 int[] p = new int[10000];
	 double[] r = new double[10000];
	 double[] o = new double[10000];
	 double d;
	 String s = new String(new char[10000]);
	 String w = new String(new char[100000]);
	 String tempVar = ConsoleInput.scanfRead();
	 if (tempVar != null)
	 {
		 n = Integer.parseInt(tempVar);
	 }
	 j = 0;
	 k = 0;
	 for (i = 0;i < n;i++)
	 {
		 String tempVar2 = ConsoleInput.scanfRead();
		 if (tempVar2 != null)
		 {
			 s = tempVar2.charAt(0);
		 }
		 if (s.charAt(0) == 'm')
		 {
			 String tempVar3 = ConsoleInput.scanfRead();
			 if (tempVar3 != null)
			 {
				 r[j] = Double.parseDouble(tempVar3);
			 }
			 j++;
		 }
		 if (s.charAt(0) == 'f')
		 {
			 String tempVar4 = ConsoleInput.scanfRead();
			 if (tempVar4 != null)
			 {
				 o[k] = Double.parseDouble(tempVar4);
			 }
			 k++;
		 }
	 }
	 for (i = 0;i < j;i++)
	 {
		 for (e = 0;e < j - 1;e++)
		 {
			 if (r[e] > r[e+1])
			 {
				 d = r[e];
				 r[e] = r[e+1];
				 r[e+1] = d;
			 }
		 }
	 }
	  for (i = 0;i < k;i++)
	  {
		 for (e = 0;e < k - 1;e++)
		 {
			 if (o[e] < o[e+1])
			 {
				 d = o[e];
				 o[e] = o[e+1];
				 o[e+1] = d;
			 }
		 }
	  }
	  System.out.printf("%.2lf",r[0]);
	for (i = 1;i < j;i++)
	{
		System.out.printf(" %.2lf",r[i]);
	}
	for (i = 0;i < k;i++)
	{
		System.out.printf(" %.2lf",o[i]);
	}


	 return 0;
	}



}

