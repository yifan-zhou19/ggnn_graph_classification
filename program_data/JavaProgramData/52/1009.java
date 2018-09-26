package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
	  void move(int array[],int x,int y);
	  int[] num = new int[120];
	  int i;
	  int m;
	  int n;
	  String tempVar = ConsoleInput.scanfRead();
	  if (tempVar != null)
	  {
		  n = Integer.parseInt(tempVar);
	  }
	  String tempVar2 = ConsoleInput.scanfRead(" ");
	  if (tempVar2 != null)
	  {
		  m = Integer.parseInt(tempVar2);
	  }
	  for (i = 0;i < n;i++)
	  {
		if (i == n - 1)
		{
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			num[i] = Integer.parseInt(tempVar3);
		}
		}
		else
		{
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				num[i] = Integer.parseInt(tempVar4);
			}
		}
	  }
	   move(num, n, m);
	   for (i = 0;i < n;i++)
	   {
		 if (i == n - 1)
		 {
		 System.out.printf("%d",num[i]);
		 }
		 else
		 {
			 System.out.printf("%d ",num[i]);
		 }
	   }
		System.out.print("\n");
	}
	 public static void move(int[] array, int x, int y)
	 {
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
	  int * p;
	  int array_end;
	  array_end = array[x - 1];
	  for (p = array + x - 1;p > array;p--)
	  {
	  *p = (p - 1);
	  }
	  array[0] = array_end;
	  y--;
	  if (y > 0)
	  {
	  move(array, x, y);
	  }
	 }

}

