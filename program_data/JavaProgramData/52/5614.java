package <missing>;

public class GlobalMembers
{
	public static int n;
	public static int m;
	public static int[] a = new int[101];
	public static void toscan()
	{
	  int i;
	  String tempVar = ConsoleInput.scanfRead();
	  if (tempVar != null)
	  {
		  n = Integer.parseInt(tempVar);
	  }
	  String tempVar2 = ConsoleInput.scanfRead();
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
	}

	public static void yidong(int n, int m, int[] a)
	{
	  int t;
	  int i;
	  int j;
	  for (i = 0;i < m;i++)
	  {
		   for (j = n;j > 0;j--)
		   {
			a[j] = a[j - 1];
		   }
		 a[0] = a[n];
	  }
	}

	public static void toprint()
	{
		int i;
	  System.out.printf("%d",a[0]);
	  for (i = 1;i < n;i++)
	  {
		System.out.printf(" %d",a[i]);
	  }
	}
	public static int Main()
	{
	  toscan();
	  yidong(n, m, a);
	  toprint();
	  return 0;
	}

}

