package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	  int n;
	  String tempVar = ConsoleInput.scanfRead();
	  if (tempVar != null)
	  {
		  n = Integer.parseInt(tempVar);
	  }
	  int[] a = new int[300];
	  int i;
	  for (i = 0;i < 300;i++)
	  {
		a[i] = 0;
	  }
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
	  int * p;
	  for (p = a;p < a + n;p++)
	  {
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			p = Integer.parseInt(tempVar2);
		}
	  }
	  p = a;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
	  int * q;
	  for (;p < a + n - 1;p++)
	  {
		for (q = p + 1;q < a + n;q++)
		{
		  if (*q == *p)
		  {
			  *q = 0;
		  }
		}
	  }
	  p = a;
	 System.out.printf("%d",*p);
	  for (p = p + 1;p < a + 300;p++)
	  {
		if (*p != 0)
		{
		System.out.printf(",%d",*p);
		}
	  }
	return 0;
	}

}

