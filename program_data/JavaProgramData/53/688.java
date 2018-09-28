package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
	   int n;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
	   int * p;
	   int x = 0;
	   int i;
	   int[] a = new int[500];
	   String tempVar = ConsoleInput.scanfRead();
	   if (tempVar != null)
	   {
		   n = Integer.parseInt(tempVar);
	   }
	   for (i = 1;i <= n;i++)
	   {
		   String tempVar2 = ConsoleInput.scanfRead();
		   if (tempVar2 != null)
		   {
			   a[i] = Integer.parseInt(tempVar2);
		   }
	   }
	   System.out.printf("%d",a[1]);
	   for (i = 2;i <= n;i++)
	   {
		   x = 0;
		   for (p = a;p <= a + i - 1;p++)
		   {
			   if (a[i] == *p || a[i] == a[1])
			   {
				   x = 1;
			   }
		   }
		   if (x != 1)
		   {
			   System.out.printf(",%d",a[i]);
		   }
	   }
	}

}

