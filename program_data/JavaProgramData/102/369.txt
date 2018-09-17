package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		  int i;
		  int n;
		  int j = 0;
		  int k = 0;
		  int p;
		  int m;
		  int c;
		  float h;
		  float[] a = new float[40];
		  float[] b = new float[40];
		  float t;
		  String s = new String(new char[10]);
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
					 s = tempVar2.charAt(0);
				 }
				 String tempVar3 = ConsoleInput.scanfRead(" ");
				 if (tempVar3 != null)
				 {
					 h = Float.parseFloat(tempVar3);
				 }
				 if (s.charAt(0) == 'm')
				 {
					 a[j] = h;
					 j++;
				 }
				 if (s.charAt(0) == 'f')
				 {
					 b[k] = h;
					 k++;
				 }
		  }
		  for (p = 0;p < j;p++)
		  {
				for (m = 0;m < j - p - 1;m++)
				{
					   if (a[m] > a[m + 1])
					   {
							  t = a[m + 1];
							  a[m + 1] = a[m];
							  a[m] = t;
					   }
				}
		  }
		  for (c = 0;c < j;c++)
		  {
		  System.out.printf("%.2f ",a[c]);
		  }
		  for (p = 0;p < k;p++)
		  {
				for (m = 0;m < k - p - 1;m++)
				{
					   if (b[m] < b[m + 1])
					   {
							  t = b[m + 1];
							  b[m + 1] = b[m];
							  b[m] = t;
					   }
				}
		  }
		  for (c = 0;c < k - 1;c++)
		  {
		  System.out.printf("%.2f ",b[c]);
		  }
		  System.out.printf("%.2f\n",b[k - 1]);
		  System.in.read();
		  System.in.read();
		  System.in.read();
		  System.in.read();
		  System.in.read();
		  System.in.read();
		  System.in.read();
		  System.in.read();
	}

}

