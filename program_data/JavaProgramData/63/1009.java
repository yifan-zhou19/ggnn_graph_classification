package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i1;
		int i2;
		int j1;
		int j2;
		int i;
		int j;
		int k;
		int[][] a = new int[100][100];
		int[][] b = new int[100][100];
		int[][] c = new int[100][100];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			i1 = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			j1 = Integer.parseInt(tempVar2);
		}
		 for (i = 0;i < i1;i++)
		 {
		 for (j = 0;j < j1;j++)
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
			i2 = Integer.parseInt(tempVar4);
		}
		String tempVar5 = ConsoleInput.scanfRead();
		if (tempVar5 != null)
		{
			j2 = Integer.parseInt(tempVar5);
		}
		  for (i = 0;i < i2;i++)
		  {
		   for (j = 0;j < j2;j++)
		   {
			 String tempVar6 = ConsoleInput.scanfRead();
			 if (tempVar6 != null)
			 {
				 b[i][j] = Integer.parseInt(tempVar6);
			 }
		   }
		  }
		if (j1 == i2)
		{

		 for (i = 0;i < i1;i++)
		 {
		   for (j = 0;j < j2;j++)
		   {
			 for (k = 0;k < j1;k++)
			 {
			   c[i][j] += a[i][k] * b[k][j];

			 }
			if (j < 1)
			{
				System.out.printf("%d",c[i][j]);
			}
						else
						{
							System.out.printf(" %d",c[i][j]);
						}
		   }
		   System.out.print("\n");
		 }
		}
		else
		{
			System.out.print("?????\n");
		}
		System.in.read();
		System.in.read();
		System.in.read();

	}
}

