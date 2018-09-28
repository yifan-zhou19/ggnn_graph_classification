package <missing>;

public class GlobalMembers
{
	public static int arr(int[] a, int x, int[] b, int y)
	{
	  int i;
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
	   return 0;
	}
	public static int arr1(int[] a, int x, int[] b, int y)
	{
	  int i;
	  int j;
	  int tmp;
	  for (i = 0;i < x - 1;i++)
	  {
	  for (j = i + 1;j < x;j++)
	  {
	  if (a[i] > a[j])
	  {
		tmp = a[i];
		a[i] = a[j];
		a[j] = tmp;
	  }
	  }
	  }
	  for (i = 0;i < y - 1;i++)
	  {
	  for (j = i + 1;j < y;j++)
	  {
	  if (b[i] > b[j])
	  {
		tmp = b[i];
		b[i] = b[j];
		b[j] = tmp;
	  }
	  }
	  }
	  return 0;
	}
	public static int arr2(int[] a, int x, int[] b, int y, int[] c)
	{
	   int i;
	   int j;
	   for (i = 0;i < x;i++)
	   {
	   c[i] = a[i];
	   }
	   for (;i < x + y;i++)
	   {
	   c[i] = b[i - x];
	   }
	   return 0;
	}
	public static int arr3(int[] c, int t)
	{
		int i;
		for (i = 0;i < t;i++)
		{
		  System.out.printf("%d",c[i]);
		  if (i < t - 1)
		  {
			  System.out.print(" ");
		  }
		}
		 return 0;
	}
	  public static int Main()
	  {
		  int x;
		  int y;
		  int[] a = new int[100];
		  int[] b = new int[100];
		  int[] c = new int[200];
		  String tempVar = ConsoleInput.scanfRead();
		  if (tempVar != null)
		  {
			  x = Integer.parseInt(tempVar);
		  }
		  String tempVar2 = ConsoleInput.scanfRead();
		  if (tempVar2 != null)
		  {
			  y = Integer.parseInt(tempVar2);
		  }
		  arr(a, x, b, y);
		  arr1(a, x, b, y);
		  arr2(a, x, b, y, c);
		  arr3(c, x + y);
		  return 0;
	  }




}

