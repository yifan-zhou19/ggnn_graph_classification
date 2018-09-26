package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
			  int x;
			  int y;
			  int z;
			  int a;
			  int b;
			  int i;
			  int j;
			  int[] n = new int[100];
			  int[] m = new int[100];
			  int[] o = new int[1000];
			  i = 0;
			  do
			  {
				  String tempVar = ConsoleInput.scanfRead();
				  if (tempVar != null)
				  {
					  a = Integer.parseInt(tempVar);
				  }
				  String tempVar2 = ConsoleInput.scanfRead(" ");
				  if (tempVar2 != null)
				  {
					  b = Integer.parseInt(tempVar2);
				  }
				  if (a == 0 && b == 0)
				  {
					  break;
				  }
				  n[i] = a;
				  m[i] = b;
				  i++;
			  }while (a != 0 && b != 0);
			  for (j = 0;j < i;j++)
			  {
							  for (x = 0;x < n[j];x++)
							  {
												 o[x] = 1;
							  }
							  x = -1;
							  y = 0;
							  z = 0;
							  do
							  {
														   if (x == (n[j] - 1))
														   {
															   x = 0;
														   }
														   else
														   {
															   x++;
														   }
														   if (o[x] > 0)
														   {
															   y++;
														   }
														   if (y == m[j])
														   {
																	  o[x] = o[x] - 100;
																	  y = 0;
																	  z++;
														   }
							  }while (z != (n[j] - 1));
							  for (x = 0;x < n[j];x++)
							  {
												 if (o[x] > 0)
												 {
													 System.out.printf("%d\n",x + 1);
												 }
							  }
			  }
	}

}

