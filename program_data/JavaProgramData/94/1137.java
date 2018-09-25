package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	  int n;
	  int k;
	  int i;
	  int t = 0;
	  int s;
	  int x;
	  int j;
	  int[] a = new int[600];
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
		x = Integer.parseInt(tempVar2);
	}
	if (x % 2 == 1)
	{
	 t++;
	a[t] = x;
	}
	  }
	  for (i = 1;i <= t - 1;i++)
	  {
	  for (j = i + 1;j <= t;j++)
	  {
	  if (a[i] > a[j])
	  {

		s = a[i];
		a[i] = a[j];
		a[j] = s;
	  }
	  }
	  }
	System.out.printf("%d",a[1]);
	  for (i = 2;i <= t;i++)
	  {
		  System.out.printf(",%d",a[i]);
	  }
	}
}

