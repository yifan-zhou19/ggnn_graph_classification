package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		  int[][] squre1;
		  int[][] squre2;
		  squre1 = new int[len];
		  squre2 = new int[len];
		  for (int i = 0;i < 9;i++)
		  {
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'calloc' has no equivalent in Java:
				  squre1[i] = (int)calloc(len,(Integer.SIZE / Byte.SIZE));
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'calloc' has no equivalent in Java:
				  squre2[i] = (int)calloc(len,(Integer.SIZE / Byte.SIZE));
		  }
		  int day;
		  String tempVar = ConsoleInput.scanfRead();
		  if (tempVar != null)
		  {
			  squre1[4][4] = Integer.parseInt(tempVar);
		  }
		  String tempVar2 = ConsoleInput.scanfRead();
		  if (tempVar2 != null)
		  {
			  day = Integer.parseInt(tempVar2);
		  }
		  for (int n = 0;n < day;n++)
		  {
				  for (int i = 4 - n;i <= 4 + n;i++)
				  {
				  for (int j = 4 - n;j <= 4 + n;j++)
				  {
				  for (int x = i - 1;x <= i + 1;x++)
				  {
				  for (int y = j - 1;y <= j + 1;y++)
				  {
				  if (n % 2 == 0)
				  {
				  squre2[x][y] = 0;
				  }
				  else
				  {
				  squre1[x][y] = 0;
				  }
				  }
				  }
				  }
				  }

				  for (int i = 4 - n;i <= 4 + n;i++)
				  {
				  for (int j = 4 - n;j <= 4 + n;j++)
				  {
				  for (int x = i - 1;x <= i + 1;x++)
				  {
				  for (int y = j - 1;y <= j + 1;y++)
				  {
						  if (x == i && y == j)
						  {
							  if (n % 2 == 0)
							  {
						  squre2[x][y] += 2 * squre1[i][j];
							  }
						   else
						   {
							squre1[x][y] += 2 * squre2[i][j];
						   }
						  }
							else
							{
							if (n % 2 == 0)
							{
							squre2[x][y] += squre1[i][j];
							}
							else
							{
							squre1[x][y] += squre2[i][j];
							}
							}
				  }
				  }
				  }
				  }

		  }

		  if (day % 2 == 0)
		  {
		  for (int i = 0;i < len;i++)
		  {
				  int count = 0;
				  for (int j = 0;j < len;j++)
				  {
						  if (count == 0)
						  {
							  System.out.printf("%d",squre1[i][j]);
						  count = 1;
						  }
						  else
						  {
						  System.out.printf(" %d",squre1[i][j]);
						  }
				  }
				  System.out.print("\n");
		  }
		  }
		  else
		  {
		  for (int i = 0;i < len;i++)
		  {
				  int count = 0;
				  for (int j = 0;j < len;j++)
				  {
						  if (count == 0)
						  {
							  System.out.printf("%d",squre2[i][j]);
						  count = 1;
						  }
						  else
						  {
						  System.out.printf(" %d",squre2[i][j]);
						  }
				  }
				  System.out.print("\n");
		  }
		  }



	}
}

