package <missing>;

public class GlobalMembers
{
	public static int[] dx = {-1, -1, -1, 0, 0, 1, 1, 1};
	public static int[] dy = {-1, 0, 1, -1, 1, -1, 0, 1};

	public static int Main()
	{
	  int[][] a = new int[11][11];
	  int[][] b = new int[11][11];
	  int m;
	  int n;
	  int i;
	  int j;
	  int k;
	  String tempVar = ConsoleInput.scanfRead();
	  if (tempVar != null)
	  {
		  m = Integer.parseInt(tempVar);
	  }
	  String tempVar2 = ConsoleInput.scanfRead();
	  if (tempVar2 != null)
	  {
		  n = Integer.parseInt(tempVar2);
	  }
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
	  memset(a, 0, (Integer.SIZE / Byte.SIZE));
	  a[5][5] = m;
	  while (n-- != 0)
	  {
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(b, 0, (Integer.SIZE / Byte.SIZE));
		for (i = 1; i <= 9; ++i)
		{
		  for (j = 1; j <= 9; ++j)
		  {
			b[i][j] += a[i][j] * 2;
			for (k = 0; k < 8; ++k)
			{
			  b[i + dx[k]][j + dy[k]] += a[i][j];
			}
		  }
		}
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memcpy' has no equivalent in Java:
		memcpy(a, b, (Integer.SIZE / Byte.SIZE));
	  }
	  for (i = 1; i <= 9; ++i)
	  {
		for (j = 1; j < 9; ++j)
		{
			System.out.printf("%d ", a[i][j]);
		}
		System.out.printf("%d\n", a[i][9]);
	  }
	  return 0;
	}

}

