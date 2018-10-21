package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
	   int n;
	   int m;
	   int i;
	   int[] a = new int[100];
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
	   int * p;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
	   int * q;
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *f;
	   int f;
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
	   p = a;
	   q = a + n - 1;
	   f = a + n / 2;
	   for (p = a;p < f;p++,q--)
	   {
		   m = p;
		   *p = q;
		   *q = m;
	   }
	   for (i = 0;i < n - 1;i++)
	   {
	   System.out.printf("%d ",a[i]);
	   }
	   System.out.printf("%d",a[n - 1]);
	}
}

