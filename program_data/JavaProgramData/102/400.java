package <missing>;

public class GlobalMembers
{
	public static void h(double[] a, int n)
	{
	   double m;
	   int i;
	   int j;
	   for (i = 0;i < n - 1;i++)
	   {
		 for (j = i + 1;j < n;j++)
		 {
			if (a[i] > a[j])
			{
			  m = a[i];
			  a[i] = a[j];
			  a[j] = m;
			}
		 }
	   }

	}
	public static int Main()
	{
		   int n;
		   int j;
		   int i;
		   String tempVar = ConsoleInput.scanfRead();
		   if (tempVar != null)
		   {
			   n = Integer.parseInt(tempVar);
		   }
		   int[] p = new int[n];
		   double[] q = new double[n];
		   String c = new String(new char[10]);
		   int m = 0;
		   int f = 0;
		   for (int i = 0;i < n;i++)
		   {
			  String tempVar2 = ConsoleInput.scanfRead();
			  if (tempVar2 != null)
			  {
				  c = tempVar2.charAt(0);
			  }
			  String tempVar3 = ConsoleInput.scanfRead(" ");
			  if (tempVar3 != null)
			  {
				  q[i] = Double.parseDouble(tempVar3);
			  }
			  if (c.charAt(0) - 'm' == 0)
			  {
				  p[i] = 1;
				  m++;
			  }
			  if (c.charAt(0) - 'f' == 0)
			  {
				  p[i] = 0;
				  f++;
			  }
		   }
		   double[] a = new double[m];
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: double *b=(double*)malloc(f *sizeof(double));
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		   double b = (double)malloc(f * (Double.SIZE / Byte.SIZE));
		   for (i = 0,j = 0;i < n;i++)
		   {
			  if (p[i] == 1)
			  {
				  a[j] = q[i];
				  j++;
			  }
		   }
			for (i = 0,j = 0;i < n;i++)
			{
			  if (p[i] == 0)
			  {
				  b[j] = q[i];
				  j++;
			  }
			}
		   h(a, m);
		   h(b, f);
		   for (i = 0;i < m;i++)
		   {
			System.out.printf("%.2lf ",a[i]);
		   }
		   for (i = f - 1;i >= 0;i--)
		   {
			if (i == 0)
			{
			System.out.printf("%.2lf",b[i]);
			}
			else
			{
			System.out.printf("%.2lf ",b[i]);
			}
		   }
		   System.in.read();
		   System.in.read();
		   System.in.read();
	}
}

