package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		void change(int x[],int y,int z);
			  int[] a = new int[100];
			  int n;
			  int m;
			  int i;
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
				  String tempVar3 = ConsoleInput.scanfRead();
				  if (tempVar3 != null)
				  {
					  a[i] = Integer.parseInt(tempVar3);
				  }
			  }
				  change(a, n, m);
			  for (i = 0;i < n - 1;i++)
			  {
				  System.out.printf("%d ",a[i]);
			  }
			  System.out.printf("%d",a[n - 1]);
	}
	public static void change(int[] x, int y, int z)
	{
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		int * p;
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *h;
		int h;
		h = x;
		for (p = h + y - 1;p >= h;p--)
		{
			*(p + z) = *p;
		}
		for (p = h;p <= h + z - 1;p++)
		{
			*p = (p + y);
		}
	}
}

