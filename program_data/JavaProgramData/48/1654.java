package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m;
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			n = Integer.parseInt(tempVar2);
		}
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//		struct student
	//	{
	//		   int nima[9][9];
	//	};
		student[] stu = tangible.Arrays.initializeWithDefaultstudentInstances(4);
		for (int i = 1;i <= n;i++)
		{
				for (int x = 0;x < 9;x++)
				{
						for (int y = 0;y < 9;y++)
						{
							 stu[i - 1].nima[x][y] = 0;
						}
				}
					   if (i == 1)
					   {
						stu[i - 1].nima[4][4] = 2;
						stu[i - 1].nima[4][3] = 1;
						stu[i - 1].nima[3][4] = 1;
						stu[i - 1].nima[3][3] = 1;
						stu[i - 1].nima[5][3] = 1;
						stu[i - 1].nima[3][5] = 1;
						stu[i - 1].nima[4][5] = 1;
						stu[i - 1].nima[5][5] = 1;
						stu[i - 1].nima[5][4] = 1;
					   }
				else
				{
				for (int x = 4 - i;x < 5 + i;x++)
				{
						for (int y = 4 - i;y < 5 + i;y++)
						{
							 stu[i - 1].nima[x][y] = 2 * stu[i - 2].nima[x][y] + stu[i - 2].nima[x - 1][y - 1] + stu[i - 2].nima[x - 1][y] + stu[i - 2].nima[x - 1][y + 1] + stu[i - 2].nima[x][y - 1] + stu[i - 2].nima[x][y + 1] + stu[i - 2].nima[x + 1][y - 1] + stu[i - 2].nima[x + 1][y] + stu[i - 2].nima[x + 1][y + 1];
						}
				}
				}
		}
		for (int x = 0;x < 5;x++)
		{
						for (int y = 0;y < 9;y++)
						{
						   if (y == 8)
						   {
							   System.out.printf("%d\n",m * stu[n - 1].nima[x][y]);
						   }
						   else
						   {
							   System.out.printf("%d ",m * stu[n - 1].nima[x][y]);
						   }
						}
		}
		for (int x = 3;x >= 0;x--)
		{
						for (int y = 0;y < 9;y++)
						{
						   if (y == 8)
						   {
							   System.out.printf("%d\n",m * stu[n - 1].nima[x][y]);
						   }
						   else
						   {
							   System.out.printf("%d ",m * stu[n - 1].nima[x][y]);
						   }
						}
		}

	}

}

