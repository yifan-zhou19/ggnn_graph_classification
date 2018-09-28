package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	  int[] p;
	  int[] a = new int[100];
	  int n;
	  int m;
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
	  for (i = 1;i <= n;i++)
	  {
		  String tempVar3 = ConsoleInput.scanfRead();
		  if (tempVar3 != null)
		  {
			  a[i] = Integer.parseInt(tempVar3);
		  }
	  }
	  p = a[1 + n - m];
	  System.out.printf("%d",p[0]);
	  p = a[2 + n - m];
	  for (i = 0;i <= m - 2;i++)
	  {
	  System.out.printf(" %d",p[i]);
	  }
	  p = a[1];
	  for (i = 0;i <= n - m - 1;i++)
	  {
	  System.out.printf(" %d",p[i]);
	  }
	  return 0;
	}
}

