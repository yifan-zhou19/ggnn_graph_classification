package <missing>;

public class GlobalMembers
{
	public static int check(int[] arr, int n, int m)
	{
		int i;
		int t;
		if (n < 0 || n >= 5 || m < 0 || m >= 5)
		{
			return 0;
		}
		for (i = 0; i < 5; ++i)
		{
			t = arr[n][i];
			arr[n][i] = arr[m][i];
			arr[m][i] = t;
		}
		return 1;
	}

	public static int Main()
	{
		int[][] arr = new int[5][5];
			 int check = new int(int arr[5], int n, int m);
			 int i;
			 int j;
		int n;
		int m;
		for (i = 0; i < 5; ++i)
		{
			for (j = 0; j < 5; ++j)
			{
				String tempVar = ConsoleInput.scanfRead();
				if (tempVar != null)
				{
					arr[i][j] = Integer.parseInt(tempVar);
				}
			}
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			n = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead(" ");
		if (tempVar3 != null)
		{
			m = Integer.parseInt(tempVar3);
		}
		if (check(arr, n, m) == 0)
		{
			System.out.print("error\n");
			return;
		}
		for (i = 0; i < 5; ++i)
		{
			for (j = 0; j < 4; ++j)
			{
				System.out.printf("%d ", arr[i][j]);
			}
			System.out.printf("%d\n", arr[i][4]);
		}
		String tempVar4 = ConsoleInput.scanfRead();
		if (tempVar4 != null)
		{
			i = Integer.parseInt(tempVar4);
		}
	}
}

