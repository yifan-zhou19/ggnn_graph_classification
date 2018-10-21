package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] sz = new int[1000];
		int m;
		int n;
		int i;
		int k;
		int result;
		int mark = 0;
		int j = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			m = Integer.parseInt(tempVar2);
		}
		for (i = 0;i < n;i++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				sz[i] = Integer.parseInt(tempVar3);
			}
		}
		for (i = 0;i < n;i++)
		{
			for (k = 1;k < n - i;k++)
			{
				result = sz[i] + sz[i + k];
				if (result == m && j == 0)
				{
					System.out.print("yes");
					j++;
				mark = 1;
				}
			}
		}
		if (mark == 0)
		{
			System.out.print("no");
		}
		return 0;
	}

}

