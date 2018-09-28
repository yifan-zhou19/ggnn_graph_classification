package <missing>;

public class GlobalMembers
{
	public static int Main()
	{

		int x;
		int y;
		int[][] s = new int[5][5];
		int e;
		int j;
		int k;
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *p[5],*q[5];
		int[] p = new int[5];
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *q[5];
		int[] q = new int[5];
		for (j = 0;j < 5;j++)
		{
				 for (k = 0;k < 5;k++)
				 {
						String tempVar = ConsoleInput.scanfRead();
						if (tempVar != null)
						{
							(s[j][k]) = Integer.parseInt(tempVar);
						}
				 }
		}

		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			x = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			y = Integer.parseInt(tempVar3);
		}

		if (x >= 0 && x <= 4 && y >= 0 && y <= 4)
		{
				  for (j = 0;j < 5;j++)
				  {
					   p[j] = (s[x][j]);
				  }
				  for (j = 0;j < 5;j++)
				  {
					   q[j] = (s[y][j]);
				  }
				  for (j = 0;j < 5;j++)
				  {
					   int e;
					   e = p[j];
					   p[j] = q[j];
					   q[j] = e;
				  }

				  for (j = 0;j < 5;j++)
				  {
								  for (k = 0;k < 4;k++)
								  {
												  System.out.printf("%d ",s[j][k]);
								  }
								  System.out.printf("%d\n",s[j][k]);
				  }




		}
		else
		{
				  System.out.print("error\n");
		}
		return 0;
	}
}

