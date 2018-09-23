package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int a;
		int b;
		int r;
		int m;
		int c;

	  String tempVar = ConsoleInput.scanfRead();
	  if (tempVar != null)
	  {
		  n = Integer.parseInt(tempVar);
	  }
	  r = 0;
	  m = 0;
	  for (i = 1;i <= n;i++)
	  {
		  for (j = 1,b = 255;j <= n;j++)
		  {
			  String tempVar2 = ConsoleInput.scanfRead();
			  if (tempVar2 != null)
			  {
				  a = Integer.parseInt(tempVar2);
			  }
			if (a == 0)
			{
				m = m + 1;
			}
			if (b > a)
			{
				r = r + 1;
			}
			b = a;
		  }
	  }
	  r = (r + 2) / 2;
	  c = ((m - 2 * r) + 4) / 2;
	  m = (r - 2) * (c - 2);
	  System.out.printf("%d\n",m);

	  return 0;

	}
}

