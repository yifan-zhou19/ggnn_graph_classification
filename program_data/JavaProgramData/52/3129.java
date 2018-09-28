package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int m;
		int i;
		int[] sz = new int[100];
		int[] sy = new int[100];
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
			if (i >= m)
			{
			  sy[i] = sz[i - m];
			}
			else
			{
			  sy[i] = sz[i + n - m];
			}
		}
		for (i = 0;i < n - 1;i++)
		{
			System.out.printf("%d ",sy[i]);
		}
		System.out.printf("%d",sy[n - 1]);
		return 0;
	}

}

