package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
	   int[] a = new int[100000];
	   int[] p = a;
	   int n;
	   int k;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
	   int * q;
	   String tempVar = ConsoleInput.scanfRead();
	   if (tempVar != null)
	   {
		   n = Integer.parseInt(tempVar);
	   }
	   for (p = a;p < a + n;p++)
	   {
		   String tempVar2 = ConsoleInput.scanfRead();
		   if (tempVar2 != null)
		   {
			   p = Integer.parseInt(tempVar2);
		   }
	   }
	   String tempVar3 = ConsoleInput.scanfRead();
	   if (tempVar3 != null)
	   {
		   k = Integer.parseInt(tempVar3);
	   }
	   for (p = a;p < a + n;p++)
	   {
		   if (p[0] == k)
		   {
			   {
				   for (q = p;q < a + n - 1;q++)
				   {
		   *q = (q + 1);
				   }
		   }
		   n--;
		   p--;
		   }
	   }
	   System.out.printf("%d",a[0]);
	   for (p = a + 1;p < a + n;p++)
	   {
		   System.out.printf(" %d",p[0]);
	   }




	}
}

