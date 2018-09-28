package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
	  int[] a = new int[300];
	  int[] out = new int[300];
	  int n;
	  int r = 0;
	  int i;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
	  int * p;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
	  int * q;
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
			  a[i - 1] = Integer.parseInt(tempVar2);
		  }
	  }
	  for (p = a;p < a + n;p++)
	  {
		for (q = p + 1;q < a + n;q++)
		{
			if (*q == *p)
			{
				*q = 0;
			}
		}
		if (*p != 0)
		{
			out[r] = p;
			r++;
		}
	  }
	  for (p = out;p < out + r - 1;p++)
	  {
		  System.out.printf("%d,",*p);
	  }
	  System.out.printf("%d",out[r - 1]);
	}


}

