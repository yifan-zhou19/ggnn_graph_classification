package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	  int[][] a = new int[5][5];
	  int i;
	  int j;
	  int k;
	  int x = 0;
	  int z;
	  int m = 0;
	  int y;
	  int b = 0;
	  for (i = 0;i < 5;i++)
	  {
			for (j = 0;j < 5;j++)
			{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				a[i][j] = Integer.parseInt(tempVar);
			}
			}
	  }
	  for (i = 0;i < 5;i++)
	  {

		  for (j = 0;j < 5;j++)
		  {
				x = 0;
				for (k = 0;k < 5;k++)
				{
				if (a[i][j] > a[i][k])
				{
				x++;
				}
				}
				 if (x == 4)
				 {
				m = 0;
				for (z = 0;z < 5;z++)
				{
					if (a[i][j] < a[z][j])
					{
					m++;
					}
				}
				if (m == 4)
				{
					y = a[i][j];
				System.out.printf("%d %d %d",i + 1,j + 1,y);
				b++;
				}
				 }
				 else
				 {
					 continue;
				 }
		  }
	  }
	   if (b == 0)
	   {
	   System.out.print("not found");
	   }
	}
}

