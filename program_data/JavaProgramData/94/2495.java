package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int N;
		int[] sz = new int[500];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			N = Integer.parseInt(tempVar);
		}
		for (int i = 0;i < N;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				(sz[i]) = Integer.parseInt(tempVar2);
			}
		}
		int[] odd = new int[500];
		int a = 0;
		for (int x = 0;x < N;x++)
		{
			if (sz[x] % 2 == 1)
			{
				odd[a] = sz[x];
				a++;
			}
		}
		int num = 0;
		int e;
		for (int k = 1;k <= a;k++)
		{
			num = 0;
			for (int y = 0;y <= a - k;y++)
			{
				if (odd[y] >= odd[num])
				{
					num = y;
				}
			}
			if (num != a - k)
			{
				 e = odd[num];
				 odd[num] = odd[a - k];
				 odd[a - k] = e;
			}
		}
		for (int z = 0;z < a - 1;z++)
		{
			System.out.printf("%d,",odd[z]);
		}
		System.out.printf("%d",odd[a - 1]);
		return 0;
	}


}

