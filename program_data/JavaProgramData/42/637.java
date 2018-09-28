package <missing>;

public class GlobalMembers
{
	 public static int Main()
	 {
	  int n;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
	  int * p;
	  int i = 0;
	  int x;
	  String tempVar = ConsoleInput.scanfRead();
	  if (tempVar != null)
	  {
		  n = Integer.parseInt(tempVar);
	  }
	  int[] a = new int[n];
	  p = a;
	  for (i = 0;i < n;i++)
	  {
	  String tempVar2 = ConsoleInput.scanfRead();
	  if (tempVar2 != null)
	  {
		  p++ = Integer.parseInt(tempVar2);
	  }
	  }
	  String tempVar3 = ConsoleInput.scanfRead();
	  if (tempVar3 != null)
	  {
		  x = Integer.parseInt(tempVar3);
	  }
	   p = a;
	   for (p;p < a + n;p++)
	   {
		   if (*p != x)
		   {
		   System.out.printf("%d",*p);
		   break;
		   }
	   }
		p = p + 1;
	   for (p;p < a + n;p++)
	   {
		  if (*p != x)
		  {
	   System.out.printf(" %d",*p);
		  }
	   }
	 }
}

