package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	   int n;
	   int i;
	   int[] a = new int[300];
	   int[] b = new int[300];
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
	   int * p;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
	   int * p1;
	   p = a;
	   p1 = b;
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
			   p = Integer.parseInt(tempVar2);
		   }
		  *p1 = p;
		  p1++;
		  p++;
	   }
	   p = a;
	   p1 = b;
	   i = 0;
	   for (i = 0;i < n;i++,p++)
	   {
		   *p = (p1 + n - 1 - i);
	   }
	  p = a;
	   System.out.printf("%d",*p);
	   for (i = 1;i < n;i++)
	   {
		   System.out.printf(" %d",*(++p));
	   }

		return 0;
	}
}

