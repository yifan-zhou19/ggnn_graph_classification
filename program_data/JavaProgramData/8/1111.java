package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		  int c;
		  int d;
		  int e;
		  int f;
		  int g;
		  String tempVar = ConsoleInput.scanfRead();
		  if (tempVar != null)
		  {
			  c = Integer.parseInt(tempVar);
		  }
		  String tempVar2 = ConsoleInput.scanfRead();
		  if (tempVar2 != null)
		  {
			  d = Integer.parseInt(tempVar2);
		  }
		  int[] a = new int[c];
		  int[] b = new int[d];
		  for (e = 0;e < c;e++)
		  {
		  String tempVar3 = ConsoleInput.scanfRead();
		  if (tempVar3 != null)
		  {
			  a[e] = Integer.parseInt(tempVar3);
		  }
		  }
		  for (e = 0;e < d;e++)
		  {
		  String tempVar4 = ConsoleInput.scanfRead();
		  if (tempVar4 != null)
		  {
			  b[e] = Integer.parseInt(tempVar4);
		  }
		  }
		  for (f = 0;f < c - 1;f++)
		  {
		  for (e = 0;e < c - 1;e++)
		  {
		  if (a[e] > a[e+1])
		  {
						 g = a[e];
						 a[e] = a[e+1];
						 a[e+1] = g;
		  }
		  }
		  }
		  System.out.printf("%d",a[0]);
		  for (e = 1;e < c;e++)
		  {
		  System.out.printf(" %d",a[e]);
		  }
		  for (f = 0;f < d - 1;f++)
		  {
		  for (e = 0;e < d - 1;e++)
		  {
		  if (b[e] > b[e+1])
		  {
						 g = b[e];
						 b[e] = b[e+1];
						 b[e+1] = g;
		  }
		  }
		  }
		  for (e = 0;e < d;e++)
		  {
		  System.out.printf(" %d",b[e]);
		  }
	}
}

