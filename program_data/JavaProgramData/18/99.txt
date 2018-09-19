package <missing>;

public class GlobalMembers
{
	/**
	* ??
	* 2010?12?4
	* ?????????
	*/
	public static int[][] a = new int[100][100];
	public static void guiling()
	{
		int i = 0;
		int j = 0;
		int k = 0;
		int flag = 0;
		int min = 1000;
		int p = 0;
		for (p = 0; p <= g_n - 1; p++)
		{
			flag = 0;
			min = 1000;
			if (a[p][0] >= 0) //????????????
			{
				for (i = 0; i <= g_n - 1; i++) //????
				{
					flag = 0;
					min = 1000;
					for (j = 0; j <= g_n - 1; j++)
					{
						if (a[i][j] < 0) //??????????????
						{
							continue;
						}
						if (a[i][j] == 0) //???????????
						{
							flag = 1;
							break;
						}
						if (a[i][j] < min)
						{
							min = a[i][j];
						}
					}
					if (flag == 0) //??
					{
						for (k = 0; k <= g_n - 1; k++)
						{
							a[i][k] = a[i][k] - min;
						}
					}
				}
				for (j = 0; j <= g_n - 1; j++) //???????
				{
					flag = 0;
					min = 1000;
					for (i = 0; i <= g_n - 1; i++)
					{
						if (a[i][j] < 0) //??????????????
						{
							continue;
						}
						if (a[i][j] == 0) //???????????
						{
							flag = 1;
							break;
						}
						if (a[i][j] < min)
						{
							min = a[i][j];
						}
					}
					if (flag == 0) //??
					{
						for (k = 0; k <= g_n - 1; k++)
						{
							a[k][j] = a[k][j] - min;
						}
					}
				}
			}
		}
	}
	public static void xiaojian(int cishu)
	{
		int i;
		int j;
		for (i = 0; i <= g_n - 1; i++) //???cishu??????????
		{
			a[i][cishu] = -1;
		}
		for (j = 0; j <= g_n - 1; j++)
		{
			a[cishu][j] = -1;
		}
	}
	public static int g_n; //???????
	public static int Main()
	{
		g_n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int i;
		int j;
		int k;
		for (i = 1; i <= g_n ;i++)
		{
			for (j = 0; j <= g_n - 1; j++)
			{
				for (k = 0; k <= g_n - 1; k++)
				{
					a[j][k] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
				}
			} //????
		int cishu = 1; //??????????????cishu????
		int sum = 0;
		for (;a[g_n - 1][0] >= 0; cishu++) //????????
		{
			guiling(); //????
			sum = sum + a[cishu][cishu];
			xiaojian(cishu);
		}
		System.out.print(sum);
		System.out.print("\n");
		}
		return 0;
	}

}

