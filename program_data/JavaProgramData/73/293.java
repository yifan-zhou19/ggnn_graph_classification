package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int i;
	int j;
	int i0;
	int j0;
	int k;
	int l = 0;
	int max;
	int flag;
	int[][] a = new int[6][6];
	for (i = 1;i <= 5;i++)
	{
	  for (j = 1;j <= 5;j++)
	  {
		a[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	  }
	}


	for (i = 1;i <= 5;i++)
	{
		   max = 0;
	   for (j = 1;j <= 5;j++)
	   {
		   flag = 0;
		   if (a[i][j] > max)
		   {
				 max = a[i][j];
			 i0 = i;
			 j0 = j;
		   } //????????????????
		   if (j == 5)
		   {
				 for (k = 1;k <= 5;k++) //????????????????
				 {
				 if (a[k][j0] < max)
				 {
						flag = 1;
					break; //??????????????
				 }
				 }

			 if (flag == 0)
			 {
				   System.out.print(i0);
				   System.out.print(" ");
				   System.out.print(j0);
				   System.out.print(" ");
				   System.out.print(a[i0][j0]);
				   System.out.print("\n");
			   l = 8;
			   break; //?????????????????????
			 }
		   }
	   }
		 if (flag == 0)
		 {
			break;
		 }
	}

	if (l == 0)
	{
	   System.out.print("not found");
	   System.out.print("\n");
	}
	return 0;
	}
}

