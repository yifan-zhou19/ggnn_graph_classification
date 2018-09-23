public class paixu
{
	   public String sex = new String(new char[6]);
	   public float height;
}

package <missing>;

public class GlobalMembers
{
	public static void bubble1(paixu[] b, int m)
	{
		 int pass;
		 int i;
		 paixu hold = new paixu();
		 for (pass = 1;pass <= m - 1;pass++)
		 {
		 for (i = 0;i <= m - 2;i++)
		 {
		 if (b[i].height > b[i + 1].height)
		 {
//C++ TO JAVA CONVERTER TODO TASK: The following line was determined to be a copy assignment (rather than a reference assignment) - this should be verified and a 'copyFrom' method should be created:
//ORIGINAL LINE: hold=b[i];
					 hold.copyFrom(b[i]);
					 b[i] = b[i + 1];
					 b[i + 1] = hold;
		 }
		 }
		 }
	}
	public static void bubble2(paixu[] b, int m, int n)
	{
		 int pass;
		 int i;
		 paixu hold = new paixu();
		 for (pass = 1;pass <= n - m;pass++)
		 {
		 for (i = m;i <= n - 2;i++)
		 {
		 if (b[i].height < b[i + 1].height)
		 {
//C++ TO JAVA CONVERTER TODO TASK: The following line was determined to be a copy assignment (rather than a reference assignment) - this should be verified and a 'copyFrom' method should be created:
//ORIGINAL LINE: hold=b[i];
					 hold.copyFrom(b[i]);
					 b[i] = b[i + 1];
					 b[i + 1] = hold;
		 }
		 }
		 }
	}
	public static int Main()
	{
	   paixu[] a = tangible.Arrays.initializeWithDefaultpaixuInstances(40);
	   paixu[] b = tangible.Arrays.initializeWithDefaultpaixuInstances(40);
	   int n;
	   int i;
	   int k = 0;
	   int m;
	   String tempVar = ConsoleInput.scanfRead();
	   if (tempVar != null)
	   {
		   n = Integer.parseInt(tempVar);
	   }
	   for (i = 0;i <= n - 1;i++)
	   {
	   String tempVar2 = ConsoleInput.scanfRead();
	   if (tempVar2 != null)
	   {
		   a[i].sex = tempVar2.charAt(0);
	   }
	   String tempVar3 = ConsoleInput.scanfRead(" ");
	   if (tempVar3 != null)
	   {
		   a[i].height = Float.parseFloat(tempVar3);
	   }
	   }
	   for (i = 0;i <= n - 1;i++)
	   {
	   if (a[i].sex.charAt(0) == 'm')
	   {
						   b[k] = a[i];
						   k++;
	   }
	   }
	   m = k;
	   for (i = 0;i <= n - 1;i++)
	   {
	   if (a[i].sex.charAt(0) == 'f')
	   {
						   b[k] = a[i];
						   k++;
	   }
	   }
	   bubble1(b, m);
	   bubble2(b, m, n);
	   for (i = 0;i <= n - 1;i++)
	   {
						  System.out.printf("%.2f",b[i].height);
						  if (i != n - 1)
						  {
						  System.out.print(" ");
						  }
	   }
	}



}

