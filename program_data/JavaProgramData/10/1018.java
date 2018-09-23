package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		  int b;
		  int c;
		  int e;
		  int f;
		  int g;
		  String tempVar = ConsoleInput.scanfRead();
		  if (tempVar != null)
		  {
			  b = Integer.parseInt(tempVar);
		  }
		  int[] a = new int[b];
		  int[] d = new int[b];
		  for (c = 0;c < b;c++)
		  {
		  String tempVar2 = ConsoleInput.scanfRead();
		  if (tempVar2 != null)
		  {
			  a[c] = Integer.parseInt(tempVar2);
		  }
		  }
		  d[b - 1] = 1;
		  for (c = b - 2;c >= 0;c--)
		  {
		  d[c] = 1;
		  f = 0;
		  for (e = b - 1;e > c;e--)
		  {
		  if (a[c] >= a[e])
		  {
		  if (d[e] > f)
		  {
		  f = d[e];
		  }
		  }
		  }
		  d[c] += f;
		  }
		  g = d[0];
		  for (c = 0;c < b;c++)
		  {
		  if (d[c] > g)
		  {
		  g = d[c];
		  }
		  }
		  System.out.printf("%d",g);
	}
}

