package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int m;
		int i;
		int j;
		int[][] arr = new int[8][8];
		int[] arr_ = new int[8];
		int[] arr__ = new int[8];
		int a;
		int b;
		int c = 0;
		int[] arr_1 = new int[8];
		int[] arr__1 = new int[8];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(",");
		if (tempVar2 != null)
		{
			m = Integer.parseInt(tempVar2);
		}
		for (i = 0;i < n;i++)
		{
			for (j = 0;j < m;j++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					arr[i][j] = Integer.parseInt(tempVar3);
				}
			}
		}
		for (i = 0;i < n;i++)
		{
			a = i;
			b = 0;
			for (j = 1;j < m;j++)
			{
				if (arr[i][j] > arr[a][b])
				{
					a = i;
					b = j;
				}
			}
			arr_[i] = a;
			arr__[i] = b;
		}
		for (j = 0;j < m;j++)
		{
			a = 0;
			b = j;
			for (i = 1;i < n;i++)
			{
				if (arr[i][j] < arr[a][b])
				{
					a = i;
					b = j;
				}
			}
			arr_1[j] = a;
			arr__1[j] = b;
		}
		for (i = 0;i < n;i++)
		{
			for (j = 0;j < m;j++)
			{
				if ((arr_[i] == arr_1[j]) && (arr__[i] == arr__1[j]))
				{
					System.out.printf("%d+%d",arr_[i],arr__[i]);
				}
				else
				{
					c++;
				}
			}
		}
		if (c == m * n)
		{
			System.out.print("No");
		}
		return 0;
	}
}

