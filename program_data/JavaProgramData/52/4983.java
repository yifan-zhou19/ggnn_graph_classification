package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m = 0;
		int n = 0;
		int[] a = new int[100];
		int i = 0;
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *p;
	  int p;
	  void prt(int * p,int m,int n);
	  p = a;
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
			  p + i = Integer.parseInt(tempVar3);
		  }
	  }
  tangible.RefObject<Integer> tempRef_p = new tangible.RefObject<Integer>(p);
	  prt(tempRef_p, m, n);
	  p = tempRef_p.argValue;
	  for (i = 0;i < n;i++)
	  {
		  System.out.printf("%d",a[i]);
		if (i < n - 1)
		{
			System.out.print(" ");
		}

	  }
	  System.in.read();
	  System.in.read();
	  return (0);
	}
	public static void prt(tangible.RefObject<Integer> p, int m, int n)
	{
		int i = 0;
		int t = 0;
		int[] b = new int[100];
		int j = 0;
	  for (i = n - m,j = 0;i < n;i++,j++)
	  {
		  b[j] = (p.argValue + i);
	  }
	  for (i = n - m - 1,j = n - 1;i >= 0;i--,j--)
	  {
		  *(p.argValue + j) = *(p.argValue + i);

	  }
	  for (i = 0;i < m;i++)
	  {
		  *(p.argValue + i) = b[i];

	  }

	}
}

