package <missing>;

public class GlobalMembers
{
	public static void sort(tangible.RefObject<Integer> data, int n)
	{
		 int i;
		 int j;
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *min;
		 int min;
		 int t;
		 for (i = 0;i < n;i++)
		 {
			 min = data.argValue + i;
			 for (j = i;j < n;j++)
			 {
				 if (*(data.argValue + j) < min)
				 {
				 min = data.argValue + j;
				 }
			 }
			 t = (data.argValue + i);
			 *(data.argValue + i) = min;
			 min = t;
		 }
	}
	public static int Main()
	{
		int n;
		int m;
		int s = 0;
		int c = 0;
		int j;
		int i;
		int k = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			n = Integer.parseInt(tempVar2);
		}
		int[][] a = new int[m + 2][n + 2];
		int[] b = new int[500];

		for (i = 0;i < m + 2;i++)
		{
			for (j = 0;j < n + 2;j++)
			{
				a[i][j] = 0;
			}
		}
		for (i = 0;i <= 500;i++)
		{
			b[k] = 0;
		}
		for (i = 1;i < m + 1;i++)
		{
			for (j = 1;j < n + 1;j++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					a[i][j] = Integer.parseInt(tempVar3);
				}

			}
		}
		for (i = 1;i < m + 1;i++)
		{
			for (j = 1;j < n + 1;j++)
			{
				if (a[i + 1][j] <= a[i][j] != 0 && a[i - 1][j] <= a[i][j] != 0 && a[i][j + 1] <= a[i][j] != 0 && a[i][j - 1] <= a[i][j])
				{
				   b[k] = 100 * i + j;
				   k++;
				}
			}
		}

	tangible.RefObject<Integer> tempRef_b = new tangible.RefObject<Integer>(b);
		sort(tempRef_b, k);
		b = tempRef_b.argValue;
		for (i = 0;i < k;i++)
		{
			System.out.printf("%d %d\n",b[i] / 100 - 1,b[i] % 100 - 1);
		}


		return 0;

	}

}

