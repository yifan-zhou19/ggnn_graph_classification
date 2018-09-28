package <missing>;

public class GlobalMembers
{
	public static int[][] a = new int[5][5];
	public static void Main()
	{
		int jiaohuan = new int(int x,int y);
		int i;
		int j;
		int n;
		int m;
		int c;
		for (i = 0;i <= 4;i++)
		{
			for (j = 0;j <= 4;j++)
			{
				String tempVar = ConsoleInput.scanfRead();
				if (tempVar != null)
				{
					a[i][j] = Integer.parseInt(tempVar);
				}
			}
		}
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				n = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				m = Integer.parseInt(tempVar3);
			}
			c = jiaohuan(n, m);
			if (c == 0)
			{
				System.out.print("error\n");
			}
			if (c == 1)
			{
		 for (i = 0;i <= 4;i++)
		 {
			 System.out.printf("%d",a[i][0]);
			for (j = 1;j <= 4;j++)
			{
				System.out.printf(" %d",a[i][j]);
			}
			System.out.print("\n");
		 }
			}
	}
		 public static int jiaohuan(int x,int y)
		 {
			 int z;
			 int k;
			 int t;
			 if ((x < 0 || x>4) || (y < 0 || y>4) || ((x < 0 || x>4) && (y < 0 || y>4)))
			 {
				 z = 0;
				 return (z);
			 }
			 else if ((0 <= x != 0 && x <= 4) && (0 <= y != 0 && y <= 4))
			 {
				 for (k = 0;k <= 4;k++)
				 {
					 t = a[x][k];
					 a[x][k] = a[y][k];
					 a[y][k] = t;
				 }
				 z = 1;
				 return (z);
			 }
		 }


}

