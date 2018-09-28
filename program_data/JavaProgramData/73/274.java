package <missing>;

public class GlobalMembers
{
	/* Note:Your choice is C IDE */
	public static void Main()
	{
		int[][] a = new int[5][5];
		int i;
		int r;
		int j;
		int temp;
		int tempi;
		int tempj;
		int flag = 1;
		int flag1 = 0;
		for (i = 0;i < 5;i++)
		{
		for (j = 0;j < 5;j++)
		{
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a[i][j] = Integer.parseInt(tempVar);
		}
		}
		}

		for (i = 0;i < 5;i++) //???????
		{
		   for (j = 0,temp = a[i][0],tempi = i,tempj = 0;j < 5;j++) //?????????
		   {
		   if (a[i][j] > temp)
		   {
			   temp = a[i][j];
			   tempi = i;
			   tempj = j;
		   }
		   } //???????????
	   flag = 1;
	   for (r = 0;r < 5;r++)
	   {
	   if (a[tempi][tempj] > a[r][tempj])
	   {
		   flag = 0; //??????????
	   }
	   }
	   if (flag == 1)
	   {
		   System.out.printf("%d %d %d",tempi + 1,tempj + 1,a[tempi][tempj]);
		   flag1 = 1;
	   } //????????,?????1
		}
	   if (flag1 == 0)
	   {
		   System.out.print("not found");
	   }
	} //????????????



}

