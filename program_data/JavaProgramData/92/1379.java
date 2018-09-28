package <missing>;

public class GlobalMembers
{
	public static int[][][][] array = new int[100][2][2][1000];

	public static int patition(int[] a, int low, int high)
	{
		int n;
		int temp;
		int i;
		int j;
		n = a[high];
		i = low - 1;
		for (j = low; j < high; j++)
		{
			if (a[j] <= n)
			{
				i++;
				temp = a[i];
				a[i] = a[j];
				a[j] = temp;
			}
		}
		temp = a[i + 1];
		a[i + 1] = a[high];
		a[high] = temp;
		return i + 1;
	}
	public static void QuickSort(int[] a, int low, int high)
	{
		int i;
		if (low < high)
		{
			i = patition(a, low, high);
			QuickSort(a, low, i - 1);
			QuickSort(a, i + 1, high);
		}
	}

	public static int Main()
	{
		int n;
		int i;
		int j;
		int k;
		int temp;
		int m;
		int l;
		int o;
		int[] c = new int[100];
		int finish;

		for (i = 0;n != 0;i++)
		{
			m = 0;
			l = 0;
			finish = 0;
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				n = Integer.parseInt(tempVar);
			}
			for (j = 0;j < n;j++)
			{
				String tempVar2 = ConsoleInput.scanfRead();
				if (tempVar2 != null)
				{
					temp = Integer.parseInt(tempVar2);
				}
				array[i][0][0][j] = temp;
				array[i][0][1][j] = 0;

			}
			QuickSort(array[i][0][0], 0, n - 1);
			for (j = 0;j < n;j++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					temp = Integer.parseInt(tempVar3);
				}
				array[i][1][0][j] = temp;
				array[i][1][1][j] = 0;

			}
			QuickSort(array[i][1][0], 0, n - 1);
			while (finish == 0)
			{
				for (j = 0;j < n;j++)
				{
					if (array[i][0][1][j] == 0)
					{
						break;
					}
				}
				for (k = 0;k < n;k++)
				{
					if (array[i][1][1][k] == 0)
					{
						break;
					}
				}
				for (l = n - 1;l >= 0;l--)
				{
					if (array[i][0][1][l] == 0)
					{
						break;
					}
				}
				for (o = n - 1;o >= 0;o--)
				{
					if (array[i][1][1][o] == 0)
					{
						break;
					}
				}
				if (array[i][0][0][l] > array[i][1][0][o])
				{
					m++;
					array[i][0][1][l] = 1;
					array[i][1][1][o] = 1;
				}
				else
				{
					if (array[i][0][0][j] > array[i][1][0][k])
					{
						m++;
						array[i][0][1][j] = 1;
						array[i][1][1][k] = 1;
					}
					else
					{
						if (array[i][1][0][o] > array[i][0][0][j])
						{
							m--;
						}
						array[i][0][1][j] = 1;
						array[i][1][1][o] = 1;

					}
				}
					finish = 1;
					for (j = 0;j < n;j++)
					{
						if (array[i][1][1][j] == 0)
						{
							finish = 0;
						}
					}
			}
			c[i] = m * 200;

		}
		for (j = 0;j < i - 1;j++)
		{
			System.out.printf("%d\n",c[j]);
		}
	}
}

