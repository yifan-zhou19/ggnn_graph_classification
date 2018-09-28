package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	  int n;
	  int[] a = new int[300];
	  int[] d = new int[300];
	  int i = 0;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
	  int * p;
	  int judge = new int(int * w,int i,int * p);
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
	  for (p = a;p < a + n;p++)
	  {
  tangible.RefObject<Integer> tempRef_d = new tangible.RefObject<Integer>(d);
  tangible.RefObject<Integer> tempRef_p = new tangible.RefObject<Integer>(p);
	  if (judge(tempRef_d, i, tempRef_p) == 0)
	  {
		  p = tempRef_p.argValue;
		  d = tempRef_d.argValue;
		  d[i] = p;
		  i++;
	  }
	  else
	  {
		  p = tempRef_p.argValue;
		  d = tempRef_d.argValue;
	  }
	  }
	  for (p = d;p < d + i;p++)
	  {
		  if (p == d)
		  {
			  System.out.printf("%d",*p);
		  }
		  else
		  {
			  System.out.printf(",%d",*p);
		  }
	  }

		  return 0;
	}
	public static int judge(tangible.RefObject<Integer> w, int i, tangible.RefObject<Integer> p)
	{

//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		int * pi = w.argValue;
			for (;pi < w.argValue + i;pi++)
			{

				if (p.argValue == *pi)
				{
					return 1;
				}
			}
	return 0;
	}

}

