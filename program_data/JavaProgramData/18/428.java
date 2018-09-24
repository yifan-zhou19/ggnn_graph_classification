package <missing>;

public class GlobalMembers
{
	public static int operation(int[][] a, int m)
	{
		int i;
		int j;
		int temp;
		int k;
		int t;
		for (i = 0;i < m;i++) //??0
		{
			int min = a[i][0];
			for (j = 0;j < m;j++) //lie
			{
				if (a[i][j] < min)
				{
					min = a[i][j];
				}
			}
			for (j = 0;j < m;j++)
			{
				a[i][j] = a[i][j] - min;
			}
		}
		for (j = 0;j < m;j++) //??0
		{
			int min = a[0][j];
			for (i = 0;i < m;i++) //hang
			{
				if (a[i][j] < min)
				{
					min = a[i][j];
				}
			}
			for (i = 0;i < m;i++)
			{
				a[i][j] = a[i][j] - min;
			}
		}
		temp = a[1][1];
		int[][] b = new int[100][100];
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(b,-1,(Integer.SIZE / Byte.SIZE));
		for (i = 0,t = 0;i < m;i++,t++)
		{
			if (i == 1)
			{
				t--;
				continue;
			}
			for (j = 0,k = 0;j < m;j++,k++)
			{
				if (j == 1)
				{
					k--;
					continue;
				}
				else
				{
					b[t][k] = a[i][j];
				}
			}
		}
		for (i = 0;i < 100;i++)
		{
			for (j = 0;j < 100;j++)
			{
				a[i][j] = b[i][j];
			}
		}
		return temp;
	}
	public static int Main()
	{
		int n;
		int i;
		int j;
		int k;
		int sum;
		int[][] a = new int[100][100];
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1;i <= n;i++)
		{
			sum = 0;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
			memset(a,-1,(Integer.SIZE / Byte.SIZE));
			for (j = 0;j < n;j++)
			{
				for (k = 0;k < n;k++)
				{
					a[j][k] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
				}
			}
			for (j = 1;j <= n - 1;j++)
			{
				sum = sum + operation(a, n - j + 1);
			}
			System.out.print(sum);
			System.out.print("\n");
		}
		return 0;
	}

}

