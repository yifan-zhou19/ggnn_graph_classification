package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] a = new int[100][100];
		int[][] b = new int[100][100];
		int q;
		int w;
		int e;
		int r;
		int i;
		int j;
		int sum = 0;
		int k;
		int flag = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			q = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			w = Integer.parseInt(tempVar2);
		}
		for (i = 0;i < q;i++)
		{
			for (j = 0;j < w;j++)
			{
				 String tempVar3 = ConsoleInput.scanfRead();
				 if (tempVar3 != null)
				 {
					 a[i][j] = Integer.parseInt(tempVar3);
				 }
			}
		}
		String tempVar4 = ConsoleInput.scanfRead();
		if (tempVar4 != null)
		{
			e = Integer.parseInt(tempVar4);
		}
		String tempVar5 = ConsoleInput.scanfRead(" ");
		if (tempVar5 != null)
		{
			r = Integer.parseInt(tempVar5);
		}
		for (i = 0;i < e;i++)
		{
			for (j = 0;j < r;j++)
			{
				 String tempVar6 = ConsoleInput.scanfRead();
				 if (tempVar6 != null)
				 {
					 b[i][j] = Integer.parseInt(tempVar6);
				 }
			}
		}
		for (i = 0;i < q;i++)
		{
			for (j = 0;j < r;j++)
			{

				for (k = 0;k < w;k++)
				{
					sum = sum + a[i][k] * b[k][j];

				}
				if (flag == 0)
				{
					System.out.printf("%d",sum);
					flag = 1;
				}
				else
				{
					System.out.printf(" %d",sum);
				}
				sum = 0;

			}
			System.out.print("\n");
			flag = 0;


		}
		return 0;

	}

}

