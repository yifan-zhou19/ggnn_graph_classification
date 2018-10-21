package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int o;
		int n;
		int m;
		int[][] array = new int[5][5];
		int i;
		int j;
		int[] temp = new int[5];
		for (i = 0;i < 5;i++)
		{
						  for (j = 0;j < 5;j++)
						  {
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			array[i][j] = Integer.parseInt(tempVar);
		}
						  }
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			n = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead(" ");
		if (tempVar3 != null)
		{
			m = Integer.parseInt(tempVar3);
		}
		if ((n >= 0 && n <= 4) && (m >= 0 && m <= 4))
		{
								   for (i = 0;i < 5;i++)
								   {
													temp[i] = array[n][i];
													array[n][i] = array[m][i];
													array[m][i] = temp[i];
								   }
		for (i = 0;i < 5;i++)
		{
						 for (j = 0;j < 5;j++)
						 {
										  if (j == 0)
										  {
												   System.out.printf("%d",array[i][j]);
										  }
										  else if (j != 0 && j != 4)
										  {
											   System.out.printf(" %d",array[i][j]);
										  }
										  else
										  {
											   System.out.printf(" %d\n",array[i][j]);
										  }
						 }
		}
		}
		else
		{
			 System.out.print("error");
		}
		String tempVar4 = ConsoleInput.scanfRead();
		if (tempVar4 != null)
		{
			o = Integer.parseInt(tempVar4);
		}
		return 0;
	}


}

