package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] num = new int[1000];
		int n;
		int m;
		int i;
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
		for (i = 1;i <= n;i++)
		{
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			num[i] = Integer.parseInt(tempVar3);
		}
		}
		for (i = n + 1;i <= 2 * n;i++)
		{
			num[i] = num[i - n];
		}
		for (i = n + 1 - m;i <= 2 * n - m;i++)
		{
			if (i == n + 1 - m)
			{
		System.out.printf("%d",num[i]);
			}
		else
		{
		System.out.printf(" %d",num[i]);
		}
		}
		System.in.read();
		System.in.read();
		return 0;
	}

}

