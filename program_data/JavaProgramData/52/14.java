package <missing>;

public class GlobalMembers
{
	public static void swap(int[] a, int h, int t)
	{
	  int i;
	  int j;
	  int te;
	  for (i = h, j = t; i < j; i++, j--)
	  {
		te = a[i];
		a[i] = a[j];
		a[j] = te;
	  }
	}

	public static void dump(int[] a, int n)
	{
	  int i;
	  for (i = 0; i < n; i++)
	  {
		System.out.printf("%d", a[i]);
		if (i != n - 1)
		{
			System.out.print(" ");
		}
	  }

	}

	public static int Main()
	{
	  int n;
	  int m;
	  int[] a = new int[100];
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
	  m = n - m;
	  int i;
	  for (i = 0; i < n; i++)
	  {
		 String tempVar3 = ConsoleInput.scanfRead();
		 if (tempVar3 != null)
		 {
			 a[i] = Integer.parseInt(tempVar3);
		 }
	  }
	  swap(a, 0, m - 1);
	  swap(a, m, n - 1);
	  swap(a, 0, n - 1);
	  dump(a, n);
	  return 0;
	}
}

