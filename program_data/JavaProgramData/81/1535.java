package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		void exchange(int a, int b,int c[100][100]);
		int i;
		int j;
		int a;
		int b;
		int[][] c = new int[100][100];

		for (i = 0;i <= 4;i++)
		{
			for (j = 0;j < 5;j++)
			{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				c[i][j] = Integer.parseInt(tempVar);
			}
			}
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			a = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead(" ");
		if (tempVar3 != null)
		{
			b = Integer.parseInt(tempVar3);
		}

		if (a < 5 && a >= 0 && b >= 0 && b < 5)
		{
			exchange(a, b, c);
		 for (i = 0;i <= 4;i++)
		 {
			for (j = 0;j < 4;j++)
			{
				System.out.printf("%d ",c[i][j]);
			}
					  System.out.printf("%d",c[i][4]);
				 System.out.print("\n");
		 }
		}


		else
		{
			System.out.print("error");
		}
	}

	   public static void exchange(int a, int b, int[][] c)
	   {
		   int j;
		   int t;
		   for (j = 0;j < 5;j++)
		   {

			   t = c[a][j];
			   c[a][j] = c[b][j];
			   c[b][j] = t;
		   }
	   }

}

