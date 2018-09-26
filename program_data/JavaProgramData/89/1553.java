package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
			 int n;
			 int i;
			 int j = 0;
			 int x;
			 int y;
			 int mingliu = -2;
			 int[][] p = new int[100000][2];
			 String tempVar = ConsoleInput.scanfRead();
			 if (tempVar != null)
			 {
				 n = Integer.parseInt(tempVar);
			 }
			 for (i = 0;;i++)
			 {
					  for (j = 0;j < 2;j++)
					  {
					  String tempVar2 = ConsoleInput.scanfRead();
					  if (tempVar2 != null)
					  {
						  p[i][j] = Integer.parseInt(tempVar2);
					  }
					  }
					  if (p[i][0] == 0 && p[i][1] == 0)
					  {
					  break;
					  }
			 }
				for (y = 0;y < i;y++)
				{
					  for (x = 0;x < i;x++)
					  {


										if (p[y][1] == p[x][0])
										{
										y = y + 1;
										x = 0;
										}
							   else if (p[y][1] != p[x][0] && p[x][1] == p[y][1])
							   {
								j = j + 1;
							   }
					  }


							   if (j == n - 1)
							   {
							   mingliu = p[y][1];
							   break;
							   }
							   else
							   {
								   j = 0;
							   }

				}
			 if (mingliu == -2)
			 {
			 System.out.print("NOT FOUND");
			 }
			 else
			 {
				 System.out.printf("%d",mingliu);
			 }
	}

}

