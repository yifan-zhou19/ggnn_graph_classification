package <missing>;

public class GlobalMembers
{
	//****************************
	//* ????1.cpp            *
	//* ?? 1000012747          *
	//* ???????????? *
	//****************************
	public static int m;
	public static int[][] a = new int[100][100];
	public static int s;
	public static void guiling() //????
	{
		int i; //??????i,j,??????????min
		int j;
		int min;
		for (i = 0;i < m;i++)
		{
			min = Math.pow(2,31.0) - 1;
			for (j = 0;j < m;j++)
			{
				if (a[i][j] < min)
				{
					min = a[i][j]; //?????????
				}
			}
			for (j = 0;j < m;j++)
			{
				a[i][j] = a[i][j] - min;
			}
		}
		for (i = 0;i < m;i++)
		{
			min = Math.pow(2,31.0) - 1;
			for (j = 0;j < m;j++)
			{
				if (a[j][i] < min)
				{
					min = a[j][i]; //?????????
				}
			}
			for (j = 0;j < m;j++)
			{
				a[j][i] = a[j][i] - min;
			}
		}
		if (m >= 2)
		{
			s = s + a[1][1]; //?????2*2?????????s??a[1][1]??
		}
	}
	public static void xiaojian() //????
	{
		int i;
		int j;
		for (i = 0;i < m;i++)
		{
			for (j = 1;j < m - 1;j++)
			{
				a[i][j] = a[i][j + 1]; //?????
			}
		}
		for (j = 0;j < m - 1;j++)
		{
			for (i = 1;i < m - 1;i++)
			{
				a[i][j] = a[i + 1][j]; //?????
			}
		}
		m--;
		guiling(); //??????????
		if (m > 2)
		{
			xiaojian(); //???????2*2?????????
		}
		else
		{
			System.out.print(s);
			System.out.print("\n");
		}
	}
	public static int Main()
	{
		int n; //n,m,t???????????????
		int t;
		int i;
		int j;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		t = n;
		while (n > 0)
		{
			m = t;
			s = 0;
			for (i = 0;i < t;i++)
			{
				for (j = 0;j < t;j++)
				{
					a[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
				}
			}
			guiling(); //????
			xiaojian(); //????
			n--;
		}
		return 0;
	}
}

