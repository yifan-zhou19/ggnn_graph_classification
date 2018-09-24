package <missing>;

public class GlobalMembers
{
	//**********************************************************
	//*   ?  ?   ?: ?????????.cpp                  *
	//*   ?       ?: ? ?                                   *
	//*   ? ? ? ?: 2010?12?3?                           *
	//**********************************************************
	public static int array(int k)
	{
		if (k == 1) //?????????
		{
			return 0;
		}
		else if (k > 1)
		{
			int i; //max1,max2????????
			int j;
			int max1;
			int max2;
			for (i = 0;i < k;i++)
			{
				max1 = 10000;
				for (j = 0;j < k;j++)
				{
					if (max1 > a[i][j])
					{
						max1 = a[i][j]; //?????
					}
				}
				for (j = 0;j < k;j++)
				{
					a[i][j] = a[i][j] - max1; //??????
				}
			}
			for (j = 0;j < k;j++)
			{
				max2 = 10000;
				for (i = 0;i < k;i++)
				{
					if (max2 > a[i][j])
					{
						max2 = a[i][j]; //?????
					}
				}
				for (i = 0;i < k;i++)
				{
					a[i][j] = a[i][j] - max2; //??????
				}
			}
			int temp = a[1][1]; //??a[1][1]??
			for (i = 2;i < k;i++)
			{
				for (j = 0;j < k;j++)
				{
					a[i - 1][j] = a[i][j]; //???
				}
			}
			for (j = 2;j < k;j++)
			{
				for (i = 0;i < k;i++)
				{
					a[i][j - 1] = a[i][j]; //???
				}
			}
			return temp + array(k - 1);
		}
		return 0;
	}
	public static int[][] a = new int[100][100];
	public static int Main()
	{
		int n; //n?????k????????
		int k;
		int i = 0;
		int j = 0;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		k = n;
		while (n-- != 0)
		{
			for (i = 0;i < k;i++)
			{
				for (j = 0;j < k;j++)
				{
					a[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
				}
			}
			System.out.print(array(k));
			System.out.print("\n");
		}
		return 0;
	}
}

