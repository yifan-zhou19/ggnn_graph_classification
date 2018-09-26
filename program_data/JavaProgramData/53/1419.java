package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int[] sz = new int[300];
		int i;
		int k;
		int f;
		int flag = 0;
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			sz[0] = Integer.parseInt(tempVar2);
		}
		for (i = 1;i < n;i++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				f = Integer.parseInt(tempVar3);
			}
			for (k = 0;k < i;k++)
			{
				if (f == sz[k])
				{
					flag = 1;
					break;
				}
			}
			if (flag != 0)
			{
				i--;
				n--;
			}
			else
			{
				sz[i] = f;
			}
			flag = 0;
		}
		for (i = 0;i < n;i++)
		{
			if (i != n - 1)
			{
				System.out.printf("%d,",sz[i]);
			}
			if (i == n - 1)
			{
				System.out.printf("%d",sz[i]);
			}
		}
		return 0;
	}




}

