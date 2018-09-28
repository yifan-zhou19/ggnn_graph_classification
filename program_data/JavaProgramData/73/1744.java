package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] n = new int[5][5];
		int i;
		int j;
		int flag;
		int a;
		int b;
		for (i = 0;i < 5;i++)
		{
		for (j = 0;j < 5;j++)
		{
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n[i][j] = Integer.parseInt(tempVar);
		}
		}
		}
		for (i = 0,flag = 0,b = 0;i < 5;i++)
		{
		for (j = 0;j < 5;j++)
		{
						for (a = 0;a < 5;a++)
						{
						if (n[a][j] < n[i][j])
						{
						flag = 1;
						}
						}
						for (a = 0;a < 5;a++)
						{
						if (n[i][a] > n[i][j])
						{
						flag = 1;
						}
						}
						if (flag == 0)
						{
								   b++;
								   if (b == 1)
								   {
								   System.out.printf("%d %d %d\n",i + 1,j + 1,n[i][j]);
								   }
								   else
								   {
								   System.out.printf("%d %d %d\n",i + 1,j + 1,n[i][j]);
								   }
						}
						flag = 0;
		}
		}
		if (b == 0)
		{
		System.out.print("not found");
		}
		return 0;
	}

}

