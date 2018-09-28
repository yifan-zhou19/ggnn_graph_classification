package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	  int row;
	  int col;
	  int b;
	  int c;
	  int d;
	  int e;
	  int k;
	  int i;
	  int[][] a = new int[100][100];
	  String tempVar = ConsoleInput.scanfRead();
	  if (tempVar != null)
	  {
		  row = Integer.parseInt(tempVar);
	  }
	  String tempVar2 = ConsoleInput.scanfRead();
	  if (tempVar2 != null)
	  {
		  col = Integer.parseInt(tempVar2);
	  }
	  for (k = 0;k < row;k++)
	  {
		for (i = 0;i < col;i++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				a[k][i] = Integer.parseInt(tempVar3);
			}
		}
	  }
	  b = 0;
	  d = 0;
	  c = col - 1;
	  e = row - 1;
	  for (;b <= c != 0 && d <= e;b++, d++, c--, e--)
	  {
		if (b != c && d != e)
		{
		  for (i = b;i < c;i++)
		  {
			System.out.printf("%d\n",a[d][i]);
		  }
		  for (i = d;i < e;i++)
		  {
			System.out.printf("%d\n",a[i][c]);
		  }
		  for (i = c;i > b;i--)
		  {
			System.out.printf("%d\n",a[e][i]);
		  }
		  for (i = e;i > d;i--)
		  {
			System.out.printf("%d\n",a[i][b]);
		  }
		}
		 else if (b == c)
		 {
			for (i = d;i <= e;i++)
			{
				System.out.printf("%d\n",a[i][b]);
			}
		 }
		  else if (d == e)
		  {
			for (i = b;i <= c;i++)
			{
				System.out.printf("%d\n",a[d][i]);
			}
		  }

	  }
	return 0;
	}

}

