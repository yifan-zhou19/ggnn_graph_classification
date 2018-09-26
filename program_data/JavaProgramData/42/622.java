package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	   int n;
	   int k;
	   int i;
	   int j;
	   int m = 0;
	   int t;
	   int[] a = new int[100000];
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
	   int * p;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
	   int * q;
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
	   String tempVar3 = ConsoleInput.scanfRead();
	   if (tempVar3 != null)
	   {
		   k = Integer.parseInt(tempVar3);
	   }
	   p = a;
	   q = a;
	   for (p = a;p < a + n;p++)
	   {
		  if (*p == k)
		  {
			 m++;
			 for (q = a;q <= p;q++)
			 {
				t = a[0];
				a[0] = q;
				*q = t;
			 }
		  }
	   }
	   for (p = a + m;p < a + n - 1;p++)
	   {
		  System.out.printf("%ld ",*p);
	   }
	   System.out.printf("%ld",a[n - 1]);
	}

}

