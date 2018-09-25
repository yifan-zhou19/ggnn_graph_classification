package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
	int[] a = new int[20001];
	int[] b = new int[101];
	int[] c = new int[101];
	  int i;
	  int n;
	  int m;
	  String tempVar = ConsoleInput.scanfRead();
	  if (tempVar != null)
	  {
		  n = Integer.parseInt(tempVar);
	  }
	  for (i = 1;i <= n;i++)
	  {
		  String tempVar2 = ConsoleInput.scanfRead();
		  if (tempVar2 != null)
		  {
			  a[i] = Integer.parseInt(tempVar2);
		  }
	  }
	  for (i = 0;i <= 101;i++)
	  {
		  b[i] = 0;
	  }
	  m = 0;
	  for (i = 1;i <= n;i++)
	  {
		  if (b[a[i]] == 0)
		  {
		  m = m + 1;
		  b[a[i]] = 1;
		  c[m] = a[i];
		  }
	  }
	  for (i = 1;i <= m;i++)
	  {
		  if (i < m)
		  {
			  System.out.printf("%d ",c[i]);
		  }
		  else
		  {
			  System.out.printf("%d",c[i]);
		  }
	  }
	}
}

