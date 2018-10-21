package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int f = new int(int s[5][5],int x,int y);
		int[][] a = new int[5][5];
		int m;
		int n;
		int i;
		int j;
		int t;
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
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				m = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				n = Integer.parseInt(tempVar3);
			}
			t = f(a, m, n);
			if (t == 0)
			{
				System.out.print("error\n");
			}
			if (t == 1)
			{
				for (i = 0;i < 5;i++)
				{
					for (j = 0;j < 4;j++)
					{
						System.out.printf("%d ",a[i][j]);
					}
					System.out.printf("%d",a[i][4]);
					System.out.print("\n");
				}
			}
	}
	 public static int f(int[][] s, int x, int y)
	 {
		 int term;
		 int i;
		 if (x > 4 || y > 4)
		 {
			 return 0;
		 }
		 else
		 {
			 for (i = 0;i < 5;i++)
			 {
				 term = s[x][i];
				 s[x][i] = s[y][i];
				 s[y][i] = term;
			 }
		 }
		 return 1;
	 }


}

