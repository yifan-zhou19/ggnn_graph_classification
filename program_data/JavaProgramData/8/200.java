package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
	  void f(int x,int y);
	  int m;
	  int n;
	  String tempVar = ConsoleInput.scanfRead();
	  if (tempVar != null)
	  {
		  m = Integer.parseInt(tempVar);
	  }
	  String tempVar2 = ConsoleInput.scanfRead(" ");
	  if (tempVar2 != null)
	  {
		  n = Integer.parseInt(tempVar2);
	  }
	  f(m, n);
	}

	public static void f(int x,int y)
	{
	  void h(int array[],int n);
	  int i;
	  int c;
	  int[] a = new int[20];
	  int[] b = new int[20];
	  for (i = 0;i < x;i++)
	  {
	  String tempVar = ConsoleInput.scanfRead();
	  if (tempVar != null)
	  {
		  a[i] = Integer.parseInt(tempVar);
	  }
	  }
	  for (i = 0;i < y;i++)
	  {
	  String tempVar2 = ConsoleInput.scanfRead();
	  if (tempVar2 != null)
	  {
		  b[i] = Integer.parseInt(tempVar2);
	  }
	  }
	  h(a, x);
	  System.out.print(" ");
	  h(b, y);
	  System.out.print("\n");
	}

	public static void h(int[] array, int n)
	{
	  int i;
	  int j;
	  int t;
	  for (i = 0;i < n - 1;i++)
	  {
	  for (j = 0;j < n - i - 1;j++)
	  {
	  if (array[j] > array[j + 1])
	  {
	   t = array[j];
	   array[j] = array[j + 1];
	   array[j + 1] = t;
	  }
	  }
	  }
	System.out.printf("%d",array[0]);
	for (i = 1;i < n;i++)
	{
	System.out.printf(" %d",array[i]);
	}
	}
}

