package <missing>;

public class GlobalMembers
{
	public static int[][] a = new int[104][104];
	public static int n = 0;
	public static int row;
	public static int col;
	public static int i;
	public static int j;
	public static int s;

	public static int out(int ai,int aj,int bi,int bj)
	{
		 int i;
		 int j;
		 for (i = aj;i <= bj;i++)
		 {
			 System.out.printf("%d\n",a[ai][i],n);
			 n++;
		 }
		 for (i = ai + 1;i <= bi;i++)
		 {
			 System.out.printf("%d\n",a[i][bj],n);
			 n++;
		 }
		 if (ai != bi)
		 {
			 for (i = bj - 1;i > aj;i--)
			 {
				 System.out.printf("%d\n",a[bi][i],n);
				 n++;
			 }
		 }
		 if (aj != bj)
		 {
			 for (i = bi;i > ai;i--)
			 {
				 System.out.printf("%d\n",a[i][aj],n);
				 n++;
			 }
		 }
		// printf("   %d******%d  %d \n",n,ai,aj);
		 if (n != s)
		 {
			 out(ai + 1, aj + 1, bi - 1, bj - 1);
		 }
		 return 0;
	}

	public static int Main()
	{
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
		s = row * col;
		for (i = 1;i <= row;i++)
		{
			for (j = 1;j <= col;j++)
			{
							   String tempVar3 = ConsoleInput.scanfRead();
							   if (tempVar3 != null)
							   {
								   a[i][j] = Integer.parseInt(tempVar3);
							   }
			}
		}
		out(1, 1, row, col);
		return 0;
	}

}

