package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i = 0;
		int[][] a = new int[1000][1000];
		int row;
		int col;
		int m;
		int p;
		int q;
		int[] b = new int[1000];
		int[] c = new int[1000];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (row = 0;row < n;row++)
		{
		  for (col = 0;col < n;col++)
		  {
		   String tempVar2 = ConsoleInput.scanfRead();
		   if (tempVar2 != null)
		   {
			   a[row][col] = Integer.parseInt(tempVar2);
		   }
		   if (a[row][col] == 0)
		   {
			b[i] = row;
			c[i] = col;
			i++;
		   }
		  }
		}
		q = i - 1;
		m = b[q] - b[0] - 1;
		p = c[q] - c[0] - 1;
		System.out.printf("%d",m * p);
		return 0;
	}



}

