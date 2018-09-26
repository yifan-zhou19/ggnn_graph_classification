package <missing>;

public class GlobalMembers
{
	public static char f(int x, int y, int[][] a, int m, int n)
	{
	  char c;
	  int i;
	  int t1 = 0;
	  int t2 = 0;
	  int[] b = new int[4];
	  final String d = "";
	  if (x - 1 >= 0)
	  {
		  b[0] = 1;
		  t1++;
		  if (a[x - 1][y] <= a[x][y])
		  {
			  d = tangible.StringFunctions.changeCharacter(d, 0, 't');
		  }
	  }
	  if (x + 1 <= m - 1)
	  {
		  b[1] = 1;
		  t1++;
		  if (a[x + 1][y] <= a[x][y])
		  {
			  d = tangible.StringFunctions.changeCharacter(d, 1, 't');
		  }
	  }
	  if (y - 1 >= 0)
	  {
		  b[2] = 1;
		  t1++;
		  if (a[x][y - 1] <= a[x][y])
		  {
			  d = tangible.StringFunctions.changeCharacter(d, 2, 't');
		  }
	  }
	  if (y + 1 <= n - 1)
	  {
		  b[3] = 1;
		  t1++;
		  if (a[x][y + 1] <= a[x][y])
		  {
			  d = tangible.StringFunctions.changeCharacter(d, 3, 't');
		  }
	  }
	  for (i = 0;i < 4;i++)
	  {
		  if (b[i] == 1 && d.charAt(i) == 't')
		  {
			  t2++;
		  }
	  }
	  if (t1 == t2)
	  {
		  c = 't';
	  }
	  else
	  {
		  c = 'f';
	  }
	  return c;
	}
	public static int Main()
	{
	  int m;
	  int n;
	  int i;
	  int j;
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
	  int[][] a = new int[20][20];
	  int[][] b = new int[20][20];
	  for (i = 0;i < m;i++)
	  {
		for (j = 0;j < n;j++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				a[i][j] = Integer.parseInt(tempVar3);
			}
		}
	  }
	  for (i = 0;i < m;i++)
	  {
		for (j = 0;j < n;j++)
		{
		  if (f(i, j, a, m, n) == 't')
		  {
			  b[i][j] = 1;
		  }
		}
	  }
	  for (i = 0;i < m;i++)
	  {
		for (j = 0;j < n;j++)
		{
		  if (b[i][j] == 1)
		  {
			  System.out.printf("%d %d\n",i,j);
		  }
		}
	  }
	  System.in.read();
	  System.in.read();
	}

}

