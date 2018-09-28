package <missing>;

public class GlobalMembers
{
	public static void Main()

	{
		void sort(int * p,int m);
		int i;
		int n;
		int[] a = new int[101];
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *p;
		int p;
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
	  p = a[0];
  tangible.RefObject<Integer> tempRef_p = new tangible.RefObject<Integer>(p);
	  sort(tempRef_p, n);
	  p = tempRef_p.argValue;
	for (i = 0;i < n - 1;i++)
	{
	  System.out.printf("%d ",a[i]);
	}
	System.out.printf("%d",a[n - 1]);
	}
	public static void sort(tangible.RefObject<Integer> p, int m)
	{
		int i;
		int t;
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *p1;
		int p1;
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *p2;
		int p2;
	for (i = 0;i < m / 2;i++)
	{
	p1 = p.argValue + i;
	p2 = p.argValue + (m - 1 - i);
	t = p1;
	p1 = p2;
	p2 = t;
	}
	}

}

