package <missing>;

public class GlobalMembers
{
	public static int q(int a, int b)
	{
		int t;

		if (a <= 4 && b <= 4)
		{
			t = 1;
		}
		else
		{
			t = 0;
		}
		return (t);
	}
	public static void Main()
	{
		int[][] x = new int[5][5];
		int a;
		int b;
		int i;
		int j;
		int[] c = new int[5];
		for (i = 0;i < 5;i++)
		{
			for (j = 0;j < 5;j++)
			{
				String tempVar = ConsoleInput.scanfRead();
				if (tempVar != null)
				{
					x[i][j] = Integer.parseInt(tempVar);
				}
			}
		}
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				b = Integer.parseInt(tempVar3);
			}
			if (q(a, b) == 0)
			{
				System.out.print("error");
			}
			if (q(a, b) == 1)
			{

		   for (j = 0;j < 5;j++)
		   {
				c[j] = x[a][j];
				x[a][j] = x[b][j];
				x[b][j] = c[j];
		   }
		   for (i = 0;i < 5;i++)
		   {
			for (j = 0;j < 4;j++)
			{
				System.out.printf("%d ",x[i][j]);
			}
			if (j = 4)
			{
				System.out.printf("%d",x[i][j]);
			}
			System.out.print("\n");
		   }
			}
	}
}

