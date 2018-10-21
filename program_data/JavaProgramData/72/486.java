package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	  int m;
	  int n;
	  int a;
	  int b;
	  int c;
	  int d;
	  int e;
	  int[][] sz = new int[20][20];
	  String tempVar = ConsoleInput.scanfRead();
	  if (tempVar != null)
	  {
		  m = Integer.parseInt(tempVar);
	  }
	  String tempVar2 = ConsoleInput.scanfRead(" ");
	  if (tempVar2 != null)
	  {
		  n = Integer.parseInt(tempVar2);
	  }
	  for (a = 0;a < m;a++)
	  {
	   for (b = 0;b < n;b++)
	   {
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			sz[a][b] = Integer.parseInt(tempVar3);
		}
	   }
	  }
	  for (c = 0;c < m;c++)
	  {
	   for (d = 0;d < n;d++)
	   {
	   if (c == 0)
	   {
		 if (d == 0)
		 {
		  if (sz[c][d] >= sz[c + 1][d] != 0 && sz[c][d] >= sz[c][d + 1])
		  {
		   System.out.printf("%d %d\n",c,d);
		  }
		 }
		  else if (d != 0 && d != n - 1)
		  {
		   if (sz[c][d] >= sz[c + 1][d] != 0 && sz[c][d] >= sz[c][d + 1] != 0 && sz[c][d] >= sz[c][d - 1])
		   {
			System.out.printf("%d %d\n",c,d);
		   }
		  }
		  else if (d == n - 1)
		  {
		   if (sz[c][d] >= sz[c + 1][d] != 0 && sz[c][d] >= sz[c][d - 1])
		   {
			System.out.printf("%d %d\n",c,d);
		   }
		  }
	   }
		else if (c != 0 && c != m - 1)
		{
		 if (d == 0)
		 {
		  if (sz[c][d] >= sz[c - 1][d] != 0 && sz[c][d] >= sz[c][d + 1] != 0 && sz[c][d] >= sz[c + 1][d])
		  {
		   System.out.printf("%d %d\n",c,d);
		  }
		 }
		 else if (d != 0 && d != n - 1)
		 {
		  if (sz[c][d] >= sz[c + 1][d] != 0 && sz[c][d] >= sz[c][d + 1] != 0 && sz[c][d] >= sz[c][d - 1] != 0 && sz[c][d] >= sz[c - 1][d])
		  {
		   System.out.printf("%d %d\n",c,d);
		  }
		 }
		 else if (d == n - 1)
		 {
		  if (sz[c][d] >= sz[c + 1][d] != 0 && sz[c][d] >= sz[c][d - 1] != 0 && sz[c][d] >= sz[c - 1][d])
		  {
		   System.out.printf("%d %d\n",c,d);
		  }
		 }
		}
	   else if (c == m - 1 && d == 0)
	   {
	   if (sz[c][d] >= sz[c - 1][d] != 0 && sz[c][d] >= sz[c][d + 1])
	   {
		System.out.printf("%d %d\n",c,d);

	   }
	   }
	   else if (c == m - 1 && d != n - 1)
	   {
		 if (sz[c][d] >= sz[c][d - 1] != 0 && sz[c][d] >= sz[c - 1][d] != 0 && sz[c][d] >= sz[c][d + 1])
		 {
		  System.out.printf("%d %d\n",c,d);
		 }
	   }
	 else if (c == m - 1 && d == n - 1)
	 {
		 if (sz[c][d] >= sz[c][d - 1] != 0 && sz[c][d] >= sz[c - 1][d])
		 {
		  System.out.printf("%d %d\n",c,d);
		 }
	 }
	   }
	  }
	  return 0;
	}
}

