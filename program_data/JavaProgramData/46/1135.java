package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] num = new int[100][100];
		int row;
		int col;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			row = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			col = Integer.parseInt(tempVar2);
		}
		int i;
		int j;
		int a = 0;
		int b = row - 1;
		int c = 0;
		int d = col - 1;
		for (i = 0;i < row;i++)
		{
			for (j = 0;j < col;j++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					num[i][j] = Integer.parseInt(tempVar3);
				}
			}
		}
		do
		{

			i = a;
			for (j = c;j <= d != 0 && a <= b;j++)
			{
				System.out.printf("%d\n",num[i][j]);
			}
			a = a + 1;
			j = d;
			for (i = a;i <= b != 0 && c <= d;i++)
			{
				System.out.printf("%d\n",num[i][j]);
			}
			d = d - 1;
			i = b;
			for (j = d;j >= c != 0 && a <= b;j--)
			{
				System.out.printf("%d\n",num[i][j]);
			}
			b = b - 1;
			j = c;
			for (i = b;i >= a != 0 && c <= d;i--)
			{
				System.out.printf("%d\n",num[i][j]);
			}
			c = c + 1;
			/*
			a=a+1;
			b=b-1;
			c=c+1;
			d=d-1;
			*/
		} while (a <= b != 0 || c <= d);
		return 0;
	}



}

