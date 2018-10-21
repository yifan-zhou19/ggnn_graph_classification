package <missing>;

public class GlobalMembers
{
	public static int jiaohuan(int m,int n)
	{
		if ((m > -1) && (m < 5) && (n>-1) && (n < 5))
		{

		 return 1;

		}
		else
		{
			return 0;
		}

	}
	public static void Main(String[] args)
	{
		int i;
		int j;
		int m;
		int n;
		int p;
		int[][] x = new int[5][5];
		for (i = 0;i < 5;i++)
		{
		   for (j = 0;j < 5;j++)
		   {
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				x[i][j] = Integer.parseInt(tempVar);
			}


		   }

		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			m = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			n = Integer.parseInt(tempVar3);
		}
		if (jiaohuan(m, n) == 1)
		{
		for (j = 0;j < 5;j++)
		{
		  p = x[m][j];
		  x[m][j] = x[n][j];
		  x[n][j] = p;


		}
		   for (i = 0;i < 5;i++)
		   {
			 for (j = 0;j < 5;j++)
			 {
				 if (j == 4)
				 {
					 System.out.printf("%d\n",x[i][j]);
				 }

				 else
				 {
				  System.out.printf("%d ",x[i][j]);
				 }
			 }
		   }
		}
		else
		{
			System.out.print("error");
		}
	}

}

