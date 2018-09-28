package <missing>;

public class GlobalMembers
{
	public static int a(int n)
	{
		if ((n >= 0) && (n < 5))
		{
		return 1;
		}
		else
		{
		return 0;
		}
	}
	public static int Main()
	{
		int[][] b = new int[5][5];
		int i;
		int j;
		int k;
		int n1;
		int n2;
		for (i = 0;i < 5;i++)
		{
		 for (j = 0;j < 5;j++)
		 {
		 String tempVar = ConsoleInput.scanfRead();
		 if (tempVar != null)
		 {
			 b[i][j] = Integer.parseInt(tempVar);
		 }
		 }
		}
		 String tempVar2 = ConsoleInput.scanfRead();
		 if (tempVar2 != null)
		 {
			 n1 = Integer.parseInt(tempVar2);
		 }
		 String tempVar3 = ConsoleInput.scanfRead();
		 if (tempVar3 != null)
		 {
			 n2 = Integer.parseInt(tempVar3);
		 }
		 if ((a(n1) == 0) || (a(n2) == 0))
		 {
		 System.out.print("error");
		 }
		 else
		 {
			 for (i = 0;i < 5;i++)
			 {
				 if (i == n1)
				 {
						 for (j = 0;j < 4;j++)
						 {
						 System.out.printf("%d ",b[n2][j]);
						 }
						 System.out.printf("%d\n",b[n2][j]);
				 }
					 else if (i == n2)
					 {
						 for (j = 0;j < 4;j++)
						 {
						 System.out.printf("%d ",b[n1][j]);
						 }
						 System.out.printf("%d\n",b[n1][j]);
					 }
					 else
					 {
						 for (j = 0;j < 4;j++)
						 {
						 System.out.printf("%d ",b[i][j]);
						 }
						 System.out.printf("%d\n",b[i][j]);
					 }

			 }
		 }


	}

}

