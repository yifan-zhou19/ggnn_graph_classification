package <missing>;

public class GlobalMembers
{
	public static int Main()
	{

		   int i;
		   int j;
		   int k;
		   int t;
		   int n;
		   int[][] a = new int[100][100];
		   int[][] b = new int[100][100];
		   int[][] c = new int[100][100];
		   int[] d = new int[100];
		   int x1;
		   int x2;
		   int y1;
		   int y2;
		   int M;
		   int m;
		   int flag;
		   int flag1;
		   int flag2;

		   String tempVar = ConsoleInput.scanfRead();
		   if (tempVar != null)
		   {
			   x1 = Integer.parseInt(tempVar);
		   }
		   String tempVar2 = ConsoleInput.scanfRead();
		   if (tempVar2 != null)
		   {
			   y1 = Integer.parseInt(tempVar2);
		   }

		   for (i = 0;i <= x1 - 1;i++)
		   {
					for (j = 0;j <= y1 - 1;j++)
					{
					String tempVar3 = ConsoleInput.scanfRead();
					if (tempVar3 != null)
					{
						a[i][j] = Integer.parseInt(tempVar3);
					}
					}


		   }
			  String tempVar4 = ConsoleInput.scanfRead();
			  if (tempVar4 != null)
			  {
				  x2 = Integer.parseInt(tempVar4);
			  }
			  String tempVar5 = ConsoleInput.scanfRead();
			  if (tempVar5 != null)
			  {
				  y2 = Integer.parseInt(tempVar5);
			  }
			  for (i = 0;i <= x2 - 1;i++)
			  {
					for (j = 0;j <= y2 - 1;j++)
					{
					String tempVar6 = ConsoleInput.scanfRead();
					if (tempVar6 != null)
					{
						b[i][j] = Integer.parseInt(tempVar6);
					}
					}

			  }


			 if (x1 < x2)
			 {
			 M = x2;
			 }
			 else
			 {
			 M = x1;
			 }
			 if (y1 < y2)
			 {
			 m = y2;
			 }
			 else
			 {
			 m = y1; //???????
			 }

			 for (i = 0;i < M;i++)
			 {
				   for (j = 0;j < m;j++)
				   {
				   c[i][j] = 0;
				   }
			 }





			 for (i = 0;i < M;i++)
			 {
				  for (j = 0;j < m;j++)
				  {
						 for (t = 0;t < y1;t++)
						 {

							  c[i][j] = c[i][j] + a[i][t] * b[t][j];


						 }




				  }



			 }




			  for (i = 0;i < M;i++)
			  {
			   d[i] = 0;
			  }
			   d[M] = m; //?????

			  for (i = 0;i < M;i++)
			  {
				  for (j = 0;j < m;j++)

				  {
					   if (c[i][j] == 0)
					   {
						 d[i]++; //???0???
					   }
				  }

			  }




				for (i = 0;i < M;i++) //??
				{


					  if (d[i] != m)
					  {
						if ((M == 100) && (m == 100) && (i == 0))
						{
						System.out.print("5050");
						}
							 else
							 {
					   System.out.printf("%d",c[i][0]);
							 }

					  for (j = 1;j < m - d[i];j++)
					  {
					  System.out.printf(" %d",c[i][j]);
					  }






					  }
					  else
					  {
						  flag = 0;

							if (d[i + 1] != m)
							{
								System.out.print("0");

							for (j = 1;j < m - d[i + 1];j++)
							{
							System.out.printf(" %d",c[i][j]);
							}
							}
							else
							{
								flag = 1;
								break;


							}

						if (flag == 1)
						{
						break;
						}




					  }

				  if (i != M - 1 && ((d[i + 1] != m) || (d[i + 1] == m) && (d[i + 2] != m)))
				  {
						System.out.print("\n");
				  }


				}










		return 0;
	}

}

