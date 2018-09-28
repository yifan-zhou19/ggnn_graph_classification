package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	  int[][] array = new int[100][100];
	  int[] s = new int[10000];
	  int row;
	  int col;
	  int i;
	  int j;
	  int k;
	  int l;
	  int h;
	  int a;
	  int b;
	  int c;
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
	  for (i = 0;i < row;i++)
	  {
		for (j = 0;j < col;j++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				array[i][j] = Integer.parseInt(tempVar3);
			}
		}
	  }
	  b = row;
	  c = col;
	  if (b > c)
	  {
	   a = b;
	   b = c;
	   c = a;
	  }
	  a = b;
	  if (a % 2 == 0)
	  {
		l = a / 2;
	  }
	  else
	  {
	   l = a / 2 + 1;
	  }
	  k = 0;
	  for (h = 0;h < l;h++)
	  {
		for (j = h;j < col - h;j++)
		{
		  s[k] = array[h][j];
		  k++;
		}
		for (i = h + 1;i < row - h;i++)
		{
		s[k] = array[i][col - 1 - h];
		k++;
		}
		for (j = col - 2 - h;j >= h;j--)
		{
		s[k] = array[row - 1 - h][j];
		k++;
		}
		for (i = row - 2 - h;i > h;i--)
		{
		s[k] = array[i][h];
		k++;
		}
	  }
	for (k = 0;k < row * col;k++)
	{
	  System.out.printf("%d\n",s[k]);
	}
	return 0;
	}
}

