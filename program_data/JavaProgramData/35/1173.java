package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	   int flag;
	   int i;
	   int j;
	   int k;
	   int row;
	   int col;
	   int m;
	   int n;
	   int[][] a = new int[8][8];
		 String tempVar = ConsoleInput.scanfRead();
		 if (tempVar != null)
		 {
			 m = Integer.parseInt(tempVar);
		 }
		 String tempVar2 = ConsoleInput.scanfRead(",");
		 if (tempVar2 != null)
		 {
			 n = Integer.parseInt(tempVar2);
		 }
		 for (i = 0; i < m; i++)
		 {
		   for (j = 0; j < n; j++)
		   {
			  String tempVar3 = ConsoleInput.scanfRead();
			  if (tempVar3 != null)
			  {
				  a[i][j] = Integer.parseInt(tempVar3);
			  }
		   }
		 }

		flag = 0;

	for (i = 0;i < m && flag == 0;i++)
	{
	   col = 0;
	   for (j = 0;j < n;j++)
	   {
		if (a[i][j] > a[i][col])
		{
		 col = j;
		}
	   }
	   for (k = 0;k < m;k++)
	   {
		if (a[k][col] < a[i][col])
		{
		 break;
		}
	   }
	   if (k == m)
	   {
		flag = 1;
		row = i;
		break;
	   }
	}
		 if (flag != 0)
		 {
		  System.out.printf("%d+%d\n", row, col);
		 }
		 else
		 {
		 System.out.print("No\n");
		 }
	}

}

