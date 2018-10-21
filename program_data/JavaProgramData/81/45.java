package <missing>;

public class GlobalMembers
{
	public static int[][] p = new int[5][5];
	public static int n;
	public static int m;
	public static int Main()
	{
		int exchange = 0;
		for (int i = 0;i < 5;i++)
		{
			for (int j = 0;j < 5;j++)
			{
				String tempVar = ConsoleInput.scanfRead();
				if (tempVar != null)
				{
					p[i][j] = Integer.parseInt(tempVar);
				}
			}
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			n = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead(" ");
		if (tempVar3 != null)
		{
			m = Integer.parseInt(tempVar3);
		}
		if (exchange() != 0)
		{
		   for (int i = 0;i < 5;i++)
		   {
			   System.out.printf("%d",p[i][0]);
				for (int j = 1;j < 5;j++)
				{
					System.out.printf(" %d",p[i][j]);
				}
			   System.out.print("\n");
		   }
		}
		else
		{
			System.out.print("error");
		}

	}
	public static int exchange()
	{
		if (n < 5 && n >= 0 && m < 5 && m >= 0)
		{
		   for (int i = 0;i < 5;i++)
		   {
			   int temp = p[n][i];
			   p[n][i] = p[m][i];
			   p[m][i] = temp;
		   }
		   return 1;
		}
		else
		{
			return 0;
		}
	}

}

