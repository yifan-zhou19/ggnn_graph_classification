package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		  int x1;
		  int y1;
		  int x2;
		  int y2;
		  int i;
		  int j;
		  int k;
		  int[][] p1;
		  int[][] p2;
		  int[][] p3;
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
		  p1 = new int[x1];
		  for (i = 0;i < x1;i++)
		  {
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
						   p1[i] = (int)malloc(y1 * (Integer.SIZE / Byte.SIZE));
		  }
		  for (i = 0;i < x1;i++)
		  {
						   for (j = 0;j < y1;j++)
						   {
											if (j == y1 - 1)
											{
												String tempVar3 = ConsoleInput.scanfRead();
												if (tempVar3 != null)
												{
													p1[i][j] = Integer.parseInt(tempVar3);
												}
											}
											else
											{
												String tempVar4 = ConsoleInput.scanfRead();
												if (tempVar4 != null)
												{
													p1[i][j] = Integer.parseInt(tempVar4);
												}
											}
						   }
		  }
		  String tempVar5 = ConsoleInput.scanfRead();
		  if (tempVar5 != null)
		  {
			  x2 = Integer.parseInt(tempVar5);
		  }
		  String tempVar6 = ConsoleInput.scanfRead();
		  if (tempVar6 != null)
		  {
			  y2 = Integer.parseInt(tempVar6);
		  }
		  p2 = new int[x2];
		  for (i = 0;i < x2;i++)
		  {
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
						   p2[i] = (int)malloc(y2 * (Integer.SIZE / Byte.SIZE));
		  }
		  for (i = 0;i < x2;i++)
		  {
						   for (j = 0;j < y2;j++)
						   {
											if (j == y2 - 1)
											{
												String tempVar7 = ConsoleInput.scanfRead();
												if (tempVar7 != null)
												{
													p2[i][j] = Integer.parseInt(tempVar7);
												}
											}
											else
											{
												String tempVar8 = ConsoleInput.scanfRead();
												if (tempVar8 != null)
												{
													p2[i][j] = Integer.parseInt(tempVar8);
												}
											}
						   }
		  }
		  p3 = new int[x1];
		  for (i = 0;i < x1;i++)
		  {
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
						   p3[i] = (int)malloc(y2 * (Integer.SIZE / Byte.SIZE));
		  }
		  for (i = 0;i < x1;i++)
		  {
						   for (j = 0;j < y2;j++)
						   {
							   p3[i][j] = 0;
						   }
		  }
		  for (i = 0;i < x1;i++)
		  {
						   for (j = 0;j < y2;j++)
						   {
											for (k = 0;k < x2;k++)
											{
															 p3[i][j] = p3[i][j] + p1[i][k] * p2[k][j];
											}
											if (j == y2 - 1)
											{
												System.out.printf("%d\n",p3[i][j]);
											}
											else
											{
												System.out.printf("%d ",p3[i][j]);
											}
						   }
		  }
	}

}

