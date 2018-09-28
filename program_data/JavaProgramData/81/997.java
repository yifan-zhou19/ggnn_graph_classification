package <missing>;

public class GlobalMembers
{
	public static int judge(int[][] a, int n, int m)
	{
		int i;
		int temp;
		if (n <= 4 && n >= 0 && m >= 0 && m <= 4)
		{
			for (i = 0;i < 5;i++)
			{
				temp = a[n][i];
				a[n][i] = a[m][i];
				a[m][i] = temp;
			}
		return (1);
		}
		else
		{
			return (0);
		}
	}
	public static void Main()
	{
		int judge = new int(int a[][5],int n,int m);
		int i;
		int j;
		int[][] a = new int[5][5];
		int n;
		int m;
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
			 n = Integer.parseInt(tempVar2);
		 }
		 String tempVar3 = ConsoleInput.scanfRead();
		 if (tempVar3 != null)
		 {
			 m = Integer.parseInt(tempVar3);
		 }
		 if (judge(a, n, m) == 0)
		 {
			 System.out.print("error\n");
		 }
		 else
		 {
			 int judge = new int(a,n,m);
			 for (i = 0;i < 5;i++)
			 {
				for (j = 0;j < 4;j++)
				{
					System.out.printf("%d ",a[i][j]);
				}
				System.out.printf("%d\n",a[i][4]);
			 }
		 }
	}
}

