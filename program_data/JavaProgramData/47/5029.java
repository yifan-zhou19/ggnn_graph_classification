package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] sz = new int[100];
		int[] dx = new int[100];
		int i;
		int j;
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				sz[i] = Integer.parseInt(tempVar2);
			}
			j = n - 1 - i;
			dx[j] = sz[i];
		}
		for (j = 0;j < n - 1;j++)
		{

			System.out.printf("%d ",dx[j]);
		}
		if (j == n - 1)
		{
			System.out.printf("%d",dx[j]);
		}
		return 0;
	}

}

