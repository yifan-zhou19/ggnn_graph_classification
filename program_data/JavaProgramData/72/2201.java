package <missing>;

public class GlobalMembers
{
	public static int[][] area = new int[100][100];
	public static int Main()
	{
		int m;
		int n;
		int i;
		int j;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			n = Integer.parseInt(tempVar2);
		}
		for (i = 0;i < m;i++)
		{
			for (j = 0;j < n;j++)
			{
			  String tempVar3 = ConsoleInput.scanfRead();
			  if (tempVar3 != null)
			  {
				  area[i][j] = Integer.parseInt(tempVar3);
			  }
			}
		}
		 for (i = 0;i < m;i++)
		 {
			for (j = 0;j < n;j++)
			{
			   if ((area[i][j] >= area[i - 1][j]) && (area[i][j] >= area[i + 1][j]) && (area[i][j] >= area[i][j - 1]) && (area[i][j] >= area[i][j + 1]))
			   {
				   System.out.printf("%d %d\n",i,j);
			   }
			}
		 }
		return 0;
	}
}

