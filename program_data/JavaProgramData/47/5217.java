package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
	   int n;
	   int[] a = new int[100];
	   int t;
	   int[] p = a;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
	   int * q;
	   String tempVar = ConsoleInput.scanfRead();
	   if (tempVar != null)
	   {
		   n = Integer.parseInt(tempVar);
	   }
	   for (;p < a + n;p++)
	   {
	   String tempVar2 = ConsoleInput.scanfRead();
	   if (tempVar2 != null)
	   {
		   p = Integer.parseInt(tempVar2);
	   }
	   }
	p = a;
	q = a + n - 1;
	for (;p < q;p++,q--)
	{
		t = p;
	  p[0] = q;
	*q = t;
	}
	for (p = a;p < a + n - 1;p++)
	{
	System.out.printf("%d ",p[0]);
	}
	System.out.printf("%d",p[0]);
	}



}

