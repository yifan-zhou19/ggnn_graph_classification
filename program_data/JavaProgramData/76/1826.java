package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	  int n;
	  int m;
	  int i;
	  int j;
	  int a;
	  int b;
	  int len;
	  int[][] sz = new int[6000][2];
	  String tempVar = ConsoleInput.scanfRead();
	  if (tempVar != null)
	  {
		  n = Integer.parseInt(tempVar);
	  }
	  for (i = 0;i < n;i++)
	  {
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			(sz[i][0]) = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			(sz[i][1]) = Integer.parseInt(tempVar3);
		}
	  }
	  a = sz[0][0];
	  b = sz[0][1];
	  for (i = 0;i < n;i++)
	  {
		if (a >= sz[i][0])
		{
			a = sz[i][0];
		}
		if (b <= sz[i][1])
		{
			b = sz[i][1];
		}
	  }
	  len = b - a;
	  for (j = 0;j < len;j++)
	  {
		if (m == 0)
		{
			break;
		}
		m = 0;
		for (i = 0;i < n;i++)
		{
		  if (sz[i][0] < sz[i][1])
		  {
			if (sz[i][0] <= a + j && a + j + 1 <= sz[i][1])
			{
				m++;
			}
		  }
		}
	  }
	  if (m == 0)
	  {
		  System.out.print("no");
	  }
	  else
	  {
		  System.out.printf("%d %d",a,b);
	  }
	  return 0;
	}
}

