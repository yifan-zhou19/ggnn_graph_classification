package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int[] q = new int[100];
		for (i = 0;i < n;i = i + 1)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				(q[i]) = Integer.parseInt(tempVar2);
			}
		}
		for (i = n - 1;i >= 1;i = i - 1)
		{
		System.out.printf("%d ",q[i]);
		}
		System.out.printf("%d",q[0]);
		return 0;
	}

}

