package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		   int[] a = new int[1000];
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		   int * p;
		   int i;
		   int n;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		   int * p1;
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
		   System.out.printf("%d",a[0]);
		   p = a + 1;
		   for (;p < (a + n);p++)
		   {
			   for (p1 = a;p1 < p;p1++)
			   {
				  if (*p1 == *p)
				  {
					  break;
				  }
			   }
				  if (p1 == p)
				  {
					  System.out.printf(",%d",*p);
				  }
		   }

	}
}

