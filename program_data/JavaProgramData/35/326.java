package <missing>;

public class GlobalMembers
{
	public static int[][] a = new int[8][8];
	public static void Main()
	{
		int i;
		int j;
		int hang;
		int lie;
		int b;
		int d;
		int max;
	 int panduan = new int(int i,int j,int hang);
	 String tempVar = ConsoleInput.scanfRead();
	 if (tempVar != null)
	 {
		 hang = Integer.parseInt(tempVar);
	 }
	 String tempVar2 = ConsoleInput.scanfRead(",");
	 if (tempVar2 != null)
	 {
		 lie = Integer.parseInt(tempVar2);
	 }
	 for (i = 0;i <= hang - 1;i++)
	 {
			for (j = 0;j <= lie-1;j++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					a[i][j] = Integer.parseInt(tempVar3);
				}
			}
	 }
	 for (i = 0;i <= hang - 1;i++)
	 {
			max = a[i][0],b = 0;
		 for (j = 1;j <= lie-1;j++)
		 {
				if (a[i][j] > max)
				{
					max = a[i][j];
				 b = j;
				}
		 }
		 d = panduan(i, b, hang);
		 if (d != 0)
		 {
			   System.out.printf("%d+%d",i,b);
			   break;
		 }
		 if (i == hang - 1 && d == 0)
		 {
		   System.out.print("No");
		 }
	 }
	}


	public static int panduan(int i,int j,int hang)
	{
		int k;
		int min;
		int d = 0;
	 min = a[0][j];
	 for (k = 1;k <= hang - 1;k++)
	 {
			if (a[k][j] < min)
			{
			min = a[k][j];
			}
	 }
	 if (a[i][j] == min)
	 {
	   d = 1;
	 }
	 return (d);
	}

}

