package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	  int i;
	  int n;
	  int x;
	  int y;
	  int t = 0;
	  int[] a = new int[10000];
	  int[] b = new int[10000];
	  String tempVar = ConsoleInput.scanfRead();
	  if (tempVar != null)
	  {
		  n = Integer.parseInt(tempVar);
	  }
	  while (scanf("%d %d", x, y) == 2)
	  {
		if (x == 0 && y == 0)
		{
		  break;
		}
		else
		{
		  a[x]++;
		}
		  b[y]++;
	  }
	  for (i = 0;i < n;i++)
	  {
		if (a[i] == 0 && b[i] == n - 1)
		{
		  System.out.printf("%d",i);
		}
		  t++;
	  }
	  if (t == 0)
	  {
		System.out.print("NOT FOUND");
	  }
	  System.in.read();
	  System.in.read();
	  System.in.read();
	  return 0;
	}
}

