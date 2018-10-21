package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int row;
		int col;
		int[][] a = new int[100][100];
		int k;
		int i;
		int j;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			row = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			col = Integer.parseInt(tempVar2);
		}

		for (i = 0;i < row;i++)
		{
			for (j = 0;j < col;j++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					a[i][j] = Integer.parseInt(tempVar3);
				}
			}
		}

	   i = 0;
	   j = 0;
	   k = 1;
	   System.out.printf("%d\n",a[0][0]);
	   a[0][0] = 0;
	   while (true)
	   {
	   while (true)
	   {
		   if (a[i][j + 1] != 0)
		   {
			   j++;
		   System.out.printf("%d\n",a[i][j]);
		   k++;
		   a[i][j] = 0;
		   }
		   else
		   {
			   break;
		   }
	   }
	   if (k == row * col)
	   {
		   break;
	   }
	   while (true)
	   {
			if (a[i + 1][j] != 0)
			{
				i++;
			System.out.printf("%d\n",a[i][j]);
		   k++;
		   a[i][j] = 0;
			}
		   else
		   {
			   break;
		   }
	   }
		 if (k == row * col)
		 {
			 break;
		 }
		 while (true)
		 {
		   if (j == 0)
		   {
			   break;
		   }
		   else if (a[i][j - 1] != 0)
		   {
			   j--;
		   System.out.printf("%d\n",a[i][j]);
		   k++;
		   a[i][j] = 0;
		   }
		   else
		   {
			   break;
		   }
		 }
		 if (k == row * col)
		 {
			 break;
		 }
		 while (true)
		 {
		   if (a[i - 1][j] != 0)
		   {
			   i--;
		   System.out.printf("%d\n",a[i][j]);
		   k++;
		   a[i][j] = 0;
		   }
		   else
		   {
			   break;
		   }
		 }
		 if (k == row * col)
		 {
			 break;
		 }
	   }

		return 0;
	}

}

