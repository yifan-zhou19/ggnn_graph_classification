package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int[] zheng = new int[100];
		int i;
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
				zheng[n - i - 1] = Integer.parseInt(tempVar2);
			}
		}
		for (i = 0;i < n;i++)
		{
			if (i < n - 1)
			{
				System.out.printf("%d ",zheng[i]);
			}
			else if (i == n - 1)
			{
				System.out.printf("%d",zheng[i]);
			}
		}
		return 0;
	}
}

