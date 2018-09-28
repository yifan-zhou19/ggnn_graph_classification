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
		int[] zx = new int[n];
		int[] dx = new int[n];
		for (int i = 1;i <= n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				zx[i] = Integer.parseInt(tempVar2);
			}
		}
		for (int j = 1;j <= n;j++)
		{
			dx[j] = zx[n - j + 1];
		}
		for (int j = 1;j < n;j++)
		{
			System.out.printf("%d ",dx[j]);
		}
		System.out.printf("%d",dx[n]);
		return 0;
	}

}

