package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m;
		int n;
		int[][] num = new int[100][100];
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		System.out.print("\n");
		for (int u = 0;u < m;u++)
		{ //??????
		   for (int v = 0;v < n;v++)
		   {
			  num[u][v] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		   }
		   System.out.print("\n");
		}
		for (int i = 0;i < n + m - 1;i++)
		{ //???????????????????????????????
		   for (int j = 0;j < m;j++)
		   {
			  for (int k = 0;k < n;k++)
			  {
				 if (j + k == i)
				 {
					 System.out.print(num[j][k]);
					 System.out.print("\n");
				 }
			  }
		   }
		}
		return 0;
	}


}

