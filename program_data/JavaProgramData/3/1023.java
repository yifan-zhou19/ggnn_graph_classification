package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int m;
		int[] sz = new int[1000];
		int f = 1;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			m = Integer.parseInt(tempVar2);
		}
		for (int i = 0; i < n; i++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				sz[i] = Integer.parseInt(tempVar3);
			}
		}
		for (int j = 0; j < n - 1 && f != 0; j++)
		{
			for (int k = j + 1; k < n && f != 0; k++)
			{
				if (sz[j] + sz[k] == m)
				{
					System.out.print("yes");
					f--;
				}
			}
		}
		if (f == 1)
		{
			System.out.print("no");
		}
		return 0;
	}




}

