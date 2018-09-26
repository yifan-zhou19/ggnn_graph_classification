package <missing>;

public class GlobalMembers
{
	public static int tf(int i,int j)
	{
		if (i > 4 || i < 0 || j>4 || j < 0)
		{
			return 0;
		}
		else
		{
			return 1;
		}
	}

	public static int Main()
	{
		int i;
		int j;
		int m;
		int n;
		int[][] a = new int[5][5];
		int temp;
		int[] p = a[0];
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
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			n = Integer.parseInt(tempVar3);
		}
		   if (tf(m, n) != 0)
		   {
			for (i = 0;i < 5;i++)
			{
				temp = (p + m * 5 + i);
				p[m * 5 + i] = (p + n * 5 + i);
				p[n * 5 + i] = temp;
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
		else
		{
			System.out.print("error");
		}
		return 0;
	}


}

