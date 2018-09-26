package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int e;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int[] shuzu = new int[n];
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				shuzu[i] = Integer.parseInt(tempVar2);
			}
		}
		for (i = 0;i < n / 2;i++)
		{
			e = shuzu[i];
			shuzu[i] = shuzu[n - 1 - i];
			shuzu[n - 1 - i] = e;
		}
		for (i = 0;i < n - 1;i++)
		{
			System.out.printf("%d ",shuzu[i]);
		}
		System.out.printf("%d",shuzu[n - 1]);
		return 0;
	}
}

