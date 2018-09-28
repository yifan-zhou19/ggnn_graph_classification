package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
	  int n;
	  int m;
	  int i;
	  int[] a = new int[101];
	  int[] b = new int[101];
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
		  if (i + m < n)
		  {
			  b[i + m] = a[i];
		  }
		  if (i + m >= n)
		  {
			  b[i + m - n] = a[i];
		  }
	  }
	  for (i = 0;i < n - 1;i++)
	  {
		   System.out.printf("%d ",b[i]);
	  }
	  if (i == n - 1)
	  {
		  System.out.printf("%d",b[i]);
	  }

	}
}

