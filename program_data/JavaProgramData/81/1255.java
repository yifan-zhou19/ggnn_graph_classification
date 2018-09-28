package <missing>;

public class GlobalMembers
{
	public static int[][] a = new int[5][5];
			public static int i = 0;
			public static int j = 0;
			public static int m = 0;
			public static int n = 0;
			public static int t = 0;
	public static int Main()
	{

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
			if ((n < 5) && (m < 5))
			{
				for (i = 0;i < 5;i++)
				{
				   t = a[n][i];
				   a[n][i] = a[m][i];
				   a[m][i] = t;
				}
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
			else
			{
				System.out.print("error");
			}
		return 0;
	}

}

