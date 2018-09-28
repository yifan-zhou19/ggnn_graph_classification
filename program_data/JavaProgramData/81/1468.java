package <missing>;

public class GlobalMembers
{
	public static int exchange(int[][] matrix, int nf, int mf)
	{

		int temp;
		int i;
		if (mf >= 0 && mf < 5 && nf >= 0 && nf < 5)
		{
				 for (i = 0;i < 5;i++)
				 {
								  temp = matrix[nf][i];
								  matrix[nf][i] = matrix[mf][i];
								  matrix[mf][i] = temp;
				 }
				return 1;


		}
		else
		{
				return 0;
		}
	}
	public static int Main()
	{
		int[][] det = new int[5][5];
		int m;
		int n;
		int i;
		int j;

		for (i = 0;i < 5;i++)
		{
		   for (j = 0;j < 5;j++)
		   {
							String tempVar = ConsoleInput.scanfRead();
							if (tempVar != null)
							{
								det[i][j] = Integer.parseInt(tempVar);
							}
		   }
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			n = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			m = Integer.parseInt(tempVar3);
		}
		if (exchange(det, n, m) == 1)
		{


									for (i = 0;i < 5;i++)
									{
									   for (j = 0;j < 5;j++)
									   {
										  System.out.printf("%d",det[i][j]);
										  if (j < 4)
										  {
												 System.out.print(" ");
										  }
									   }
									   System.out.print("\n");
									}
		}
		else
		{
			 System.out.print("error\n");
		}



		return 0;
	}


}

