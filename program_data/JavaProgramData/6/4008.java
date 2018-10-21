package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int time;
		int m;
		int n;
		int i;
		int j;
		int x;
		int y;
		int res;
		int r;
		int[] arr = new int[10000];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			time = Integer.parseInt(tempVar);
		}
		for (i = 0;i < time;i++)
		{
			res = 0;
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				m = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				n = Integer.parseInt(tempVar3);
			}
	//		printf("%d %d",m,n);
			for (j = 0;j < m * n;j++)
			{
				String tempVar4 = ConsoleInput.scanfRead();
				if (tempVar4 != null)
				{
					r = Integer.parseInt(tempVar4);
				}
				//printf("%d\n",r);
				arr[j] = r;
			}
			for (x = 0;x < m;x++)
			{
				for (y = 0;y < n;y++)
				{
					if ((x == 0) || (x == (m - 1)))
					{
						res += arr[x * n + y];
					}
					if ((y == 0) && (x != 0) && (x != (m - 1)))
					{
						res += arr[x * n + y];
					}
					if ((y == (n - 1)) && (x != 0) && (x != (m - 1)))
					{
						res += arr[x * n + y];
					}
				}
			}
			System.out.printf("%d\n",res);
		}
		return 0;
	}
}

