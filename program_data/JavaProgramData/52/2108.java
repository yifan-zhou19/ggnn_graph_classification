package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
	  int m;
	  int n;
	  int i;
	  int[] a = new int[100];
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
	  int * p;
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *p1;
	  int p1;
	  p = a;
	  String tempVar = ConsoleInput.scanfRead();
	  if (tempVar != null)
	  {
		  n = Integer.parseInt(tempVar);
	  }
	  String tempVar2 = ConsoleInput.scanfRead();
	  if (tempVar2 != null)
	  {
		  m = Integer.parseInt(tempVar2);
	  }
	  for (i = 0;i < n;i++)
	  {
	   String tempVar3 = ConsoleInput.scanfRead();
	   if (tempVar3 != null)
	   {
		   p++ = Integer.parseInt(tempVar3);
	   }
	  }
	   p1 = a[n - m];
	 for (i = n - m;i < n;i++,p1++)
	 {
	System.out.printf("%d ", p1);
	 }
	 p = a;
	for (i = 0;i < n - m - 1;i++,p++)
	{
	System.out.printf("%d ",*p);
	}
	System.out.printf("%d",*p);
	}
}

