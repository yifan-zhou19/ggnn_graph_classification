package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int change = new int(int an[5][5],int a,int b);

		int x;
		int y;
		int[][] a = new int[5][5];
		int i;
		int j;
		int c;
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
			x = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			y = Integer.parseInt(tempVar3);
		}
		c = change(a[5][5], x, y);
		if (c == 0)
		{
			System.out.print("error");
		}
		if (c == 1)
		{
		for (j = 0;j < 5;j++)
		{
			t = a[x][j];
		  a[x][j] = a[y][j];
		  a[y][j] = t;
		}
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

	public static int change(int[][] an, int a, int b)
	{
		int c;

		if (a < 0 || a>4 || b < 0 || b>4)
		{
			return c = 0;
		}
		else
		{
			return c = 1;
		}
	}


}

