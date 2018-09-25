package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int k;
		int[][] a = new int[100][100];
		int[] b = new int[10000];
		int min = 0;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		k = n;
		while (k > 0)
		{
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
			memset(a,0,(Integer.SIZE / Byte.SIZE));
			int i;
			int j;
			int k1;
			int sum = 0;
			for (i = 0;i < n;i++)
			{
				for (j = 0;j < n;j++)
				{
					a[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
				}
			}
			k1 = n;
			while (k1 > 1)
			{
				for (i = 0;i < k1;i++)
				{
					min = a[i][0];
					for (j = 0;j < k1;j++) //?????????
					{
						if (a[i][j] < min)
						{
							min = a[i][j];
						}
					}
					for (j = 0;j < k1;j++)
					{
						a[i][j] = a[i][j] - min;
					}
				}
				for (i = 0;i < k1;i++)
				{
					min = a[0][i];
					for (j = 0;j < k1;j++)
					{
						if (a[j][i] < min)
						{
							min = a[j][i];
						}
					}
					for (j = 0;j < k1;j++)
					{
						a[j][i] = a[j][i] - min;
					}
				}
				sum = sum + a[1][1];
				int count = 0;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
				memset(b,0,(Integer.SIZE / Byte.SIZE));
				for (i = 0;i < k1;i++)
				{
					if (i == 1)
					{
						continue;
					}
					for (j = 0;j < k1;j++)
					{
						if (j == 1)
						{
							continue;
						}
						b[count++] = a[i][j];
					}
				}
				k1--;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
				memset(a,0,(Integer.SIZE / Byte.SIZE));
				int x = 0;
				for (i = 0;i < k1;i++)
				{
					for (j = 0;j < k1;j++)
					{
						a[i][j] = b[x++];
					}
				}
			}
			System.out.print(sum);
			System.out.print("\n");
			sum = 0;
			k--;
		}
		return 0;
	}
}

