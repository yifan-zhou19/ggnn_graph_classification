package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	  int[][] s = new int[10][10];
	  int N;
	  int n;
	  String tempVar = ConsoleInput.scanfRead();
	  if (tempVar != null)
	  {
		  n = Integer.parseInt(tempVar);
	  }
	  int i;
	  int j;
	  int c = 0;
	  int d;
	  int count0;
	  int q;
	  count0 = 0;
	  c = 0;
	  d = 0;
	  for (i = 0; i < n; i++)
	  {
		  q = 0;
		  for (j = 0; j < n; j++)
		  {
			  String tempVar2 = ConsoleInput.scanfRead();
			  if (tempVar2 != null)
			  {
				  s[i][j] = Integer.parseInt(tempVar2);
			  }

		  if (s[i][j] == 0)
		  {
			  q++;
			  count0++;
		  }
		  }
		  if (q > 1)
		  {
			  d++;
		  }
			  if (q > c)
			  {
				  c = q;
			  }
	  }
	  N = d * c - count0;
	  System.out.printf("%d", N);
	  return 0;
	}
}

