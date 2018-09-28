package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int[][] a = new int[10][6];
		int[] b = new int[10];
		for (i = 0;i < 10;i++)
		{
			for (j = 0;j < 6;j++)
			{
			  String tempVar = ConsoleInput.scanfRead();
			  if (tempVar != null)
			  {
				  a[i][j] = Integer.parseInt(tempVar);
			  }
			}
		}
		for (i = 0;i < 10;i++)
		{
			if (a[i][0] != 0)
			{
			b[i] = (12 * 3600 - a[i][0] * 3600 - a[i][1] * 60 - a[i][2] + a[i][3] * 3600 + a[i][4] * 60 + a[i][5]);
			System.out.printf("%d\n",b[i]);
			}
			else
			{
				break;
			}
		}
		return 0;
	}

}

