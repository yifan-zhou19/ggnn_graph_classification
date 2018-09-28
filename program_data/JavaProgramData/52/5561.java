package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	  int i;
	  int j;
	  int[] x = new int[100];
	  int n;
	  int m;
	  void px(int n,int array[100]);
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
			x[i] = Integer.parseInt(tempVar3);
		}
	  }
	  for (i = 1;i <= m;i++)
	  {
		px(n - 1, x);
	  }
	  System.out.printf("%d",x[0]);
	  for (i = 1;i < n;i++)
	  {
	   System.out.printf(" %d",x[i]);
	  }

	  return 0;
	}

	public static void px(int n, int[] array)
	{
	 int t;
	 int i;
	 t = array[n];
	 for (i = n - 1;i >= 0;i--)
	 {
	   array[i + 1] = array[i];
	 }
	 array[0] = t;
	}
}

