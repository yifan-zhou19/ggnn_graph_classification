package <missing>;

public class GlobalMembers
{
	public static int jis(int x, int y, int[][] a)
	{
		if (x >= 0 && x <= 4 && y >= 0 && y <= 4)
		{
			return 1;
		}
		else
		{
			return 0;
		}
	}
	public static void Main()
	{

		int[][] s = new int[5][5];
		int i;
		int j;
		int m;
		int n;
		int[] x = new int[5];

			for (i = 0;i < 5;i++)
			{
			for (j = 0;j < 5;j++)
			{
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		s[i][j] = Integer.parseInt(tempVar);
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

		if (jis(n, m, s[5][5]) == 0)
		{
		 System.out.print("error");
		}
		if (jis(n, m, s[5][5]) == 1)
		{

	   for (j = 0;j < 5;j++)
	   {
	   x[j] = s[m][j];
	   s[m][j] = s[n][j];
	   s[n][j] = x[j];

	   }
			for (i = 0;i < 5;i++)
			{


		 System.out.printf("%d %d %d %d %d\n",s[i][0],s[i][1],s[i][2],s[i][3],s[i][4]);
			}

		}
	}
}

