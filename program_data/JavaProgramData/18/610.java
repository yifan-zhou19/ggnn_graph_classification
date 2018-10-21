package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] a = new int[1000][1000];
		int sum = 0;
		int p = 1;
		int z;
		int k;
		int w;
		int l;
		int min;
		int i;
		int j;
		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (w = 0;w < n;w++)
		{
			for (i = 0;i < n;i++)
			{
				for (j = 0;j < n;j++)
				{
					a[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
				}
			}
			for (z = 0;z < n - 1;z++)
			{
			for (i = 0;i < n;i++)
			{
				min = 1000;
				for (j = 0;j < n;j++)
				{

					if (a[i][j] < min)
					{
						min = a[i][j];
					}
				}
				for (k = 0;k < n;k++)
				{
					a[i][k] -= min;
				}
			}
			for (i = 0;i < n;i++)
			{
				min = 1000;
				for (j = 0;j < n;j++)
				{

					if (a[j][i] < min)
					{
						min = a[j][i];
					}

				}
				for (k = 0;k < n;k++)
				{
					a[k][i] -= min;
				}
			}
			sum += a[p][p];
			for (l = 0;l < n;l++)
			{
				a[l][p] = 100000;
			}
			for (l = 0;l < n;l++)
			{
				a[p][l] = 100000;
			}
			p++;
			}
			System.out.print(sum);
			System.out.print("\n");
			p = 1;
			sum = 0;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
			memset(a,1000000,(Integer.SIZE / Byte.SIZE));
		}

		return 0;
	}


}

