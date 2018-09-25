package <missing>;

public class GlobalMembers
{
	public static int sum; //??????
	public static int func(int[][] a, int n)
	{
		int i; //????????????????
		int j;
		int min;
		int[][] b = new int[100][100];
		if (n <= 1)
		{
			return sum; //????1?????????
		}
		else //??
		{
			for (i = 0;i < n;i++)
			{
				min = a[i][0]; //???????
				for (j = 0;j < n;j++)
				{
					if (a[i][j] < min)
					{
						min = a[i][j];
					}
				}
				for (j = 0;j < n;j++)
				{
					a[i][j] = a[i][j] - min; //????????
				}
			}
			for (i = 0;i < n;i++)
			{
				min = a[0][i];
				for (j = 0;j < n;j++)
				{
					if (a[j][i] < min)
					{
						min = a[j][i]; //??????
					}
				}
				for (j = 0;j < n;j++)
				{
					a[j][i] = a[j][i] - min; //?????????
				}
			}
			sum += a[1][1]; //??????a[1][1]??
			for (i = 2;i < n;i++)
			{
				for (j = 0;j < n - 1;j++)
				{
					b[i - 1][j] = a[i][j + 1]; //???-1
				}
				for (j = 0;j < n - 1;j++)
				{
					b[j][i - 1] = a[j + 1][i]; //???-1
				}
			}
			for (j = 1;j < n - 1;j++)
			{
				b[0][j] = a[0][j + 1];
			}
			for (j = 1;j < n - 1;j++)
			{
				b[j][0] = a[j + 1][0];
			}
			b[0][0] = a[0][0]; //??a[0][0]
			func(b, n - 1); //?????
		}
	}
	public static int Main()
	{
		int n; //????????????
		int j;
		int k;
		int i;
		int[][] a = new int[100][100];
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < n;i++)
		{
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
			memset(a,0,(Integer.SIZE / Byte.SIZE)); //?a???????0
			for (j = 0;j < n;j++)
			{
				for (k = 0;k < n;k++)
				{
					a[j][k] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
				}
			}
			sum = 0; //???sum?0
			System.out.print(func(a, n));
			System.out.print("\n");
		}
		return 0;
	}
}

