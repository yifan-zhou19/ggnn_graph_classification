package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int n;
		int[] h = new int[100];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 1;i <= n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				(h[i]) = Integer.parseInt(tempVar2);
			}
		}
		for (i = n;i > 0;i--)
		{
			if (i == 1)
			{
				System.out.printf("%d",h[1]);
			}
			else
			{
			System.out.printf("%d ",h[i]);
			}
		}
		return 0;
	}

}

