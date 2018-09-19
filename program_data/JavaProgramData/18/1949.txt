package <missing>;

public class GlobalMembers
{
	public static int[][] juzhen = new int[100][100];
	public static int m;
	public static int n;
	public static int sum;
	public static int j;
	public static int min001 = 0;
	public static int min002 = 0;
	public static int[] min01 = new int[101];
	public static int[] min02 = new int[101];
	public static int min1(int a) //??????????
	{
		for (int p = 0;p < m;p++)
		{
		min01[p] = juzhen[a][p];
		}
		sort(min01,min01 + m);
		return min01[0];
	}
	public static int min2(int a) //??????????
	{
		for (int p = 0;p < m;p++)
		{
		min02[p] = juzhen[p][a];
		}
		sort(min02,min02 + m);
		return min02[0];
	}
	public static void jia(int x,int y)
	{
		if (y == 1)
		{
		System.out.print(sum);
		System.out.print("\n");
		}
		else
		{
		  for (j = 0;j < y;j++)
		  {
			min001 = min1(j);
			for (int k = 0;k < y;k++)
			{
			juzhen[j][k] = juzhen[j][k] - min001; //????????
			}
		  }
		  for (j = 0;j < y;j++)
		  {
			min002 = min2(j);
			for (int k = 0;k < y;k++)
			{
			juzhen[k][j] = juzhen[k][j] - min002; //????????
			}
		  }
		  sum = sum + juzhen[1][1];
		  for (j = 1;j < y - 1;j++)
		  {
			for (int k = 0;k < y;k++)
			{
			juzhen[j][k] = juzhen[j + 1][k]; //?????
			}
		  }
		  for (j = 1;j < y;j++)
		  {
			for (int k = 0;k < y - 1;k++)
			{
			juzhen[k][j] = juzhen[k][j + 1]; //?????
			}
		  }
		  m = m - 1;
		  jia(x, y - 1);
		}
	}
	public static int Main()
	{
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int i = 1;i <= n;i++)
		{
		  sum = 0;
		  m = n;
		  for (j = 0;j < n;j++)
		  {
			for (int k = 0;k < n;k++)
			{
			juzhen[j][k] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		  }
		  jia(i, m); //????
		}
		return 0;
	}

}

