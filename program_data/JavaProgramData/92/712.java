package <missing>;

public class GlobalMembers
{
	public static int Max(int x,int y)
	{
		return x > y != 0?x:y;
	}
	public static int cmp(Object a, Object b)
	{
		return *(int)b - (int)a;
	}
	public static int Main()
	{
		  int i;
		  int j;
		  int n;
		  for (;;)
		  {
			  String tempVar = ConsoleInput.scanfRead();
			  if (tempVar != null)
			  {
				  n = Integer.parseInt(tempVar);
			  }
			  if (n == 0)
			  {
				  break;
			  }
			  int[] t = new int[n];
			  int[] q = new int[n];
			  int[][] d = new int[n + 1][n + 1];
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
			  memset(d,0,(Integer.SIZE / Byte.SIZE));
			  for (i = 0;i < n;i++)
			  {
				  String tempVar2 = ConsoleInput.scanfRead();
				  if (tempVar2 != null)
				  {
					  t[i] = Integer.parseInt(tempVar2);
				  }
			  }
			  for (i = 0;i < n;i++)
			  {
				  String tempVar3 = ConsoleInput.scanfRead();
				  if (tempVar3 != null)
				  {
					  q[i] = Integer.parseInt(tempVar3);
				  }
			  }
			  qsort(t,n,(Integer.SIZE / Byte.SIZE),cmp);
			  qsort(q,n,(Integer.SIZE / Byte.SIZE),cmp);
			  for (i = 1;i <= n;i++)
			  {
				  for (j = i;j <= n;j++)
				  {
					  if (t[i - 1] == q[j - 1])
					  {
						  d[i][j] = d[i - 1][j - 1];
					  }
					  else if (t[i - 1] > q[j - 1])
					  {
						  d[i][j] = d[i - 1][j - 1] + 1;
					  }
					  else
					  {
						  d[i][j] = d[i - 1][j - 1] - 1;
					  }
					  d[i][j] = Max(d[i][j], d[i - 1][j] - 1);
				  }
			  }
			  System.out.printf("%d\n",d[n][n] * 200);
		  }
	}

}

