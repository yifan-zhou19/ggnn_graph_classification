package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int[] num = new int[100];
		int a;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i <= n - 1;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				num[i] = Integer.parseInt(tempVar2);
			}
		}
		for (i = 1;i <= n - 1;i++)
		{
			if (num[0] < num[i])
			{
				a = num[i];
				num[i] = num[0];
				num[0] = a;
			}
		}
		for (i = 2;i <= n - 1;i++)
		{
			if (num[1] < num[i])
			{
				a = num[i];
				num[i] = num[1];
				num[1] = a;
			}
		}
		System.out.printf("%d\n%d\n",num[0],num[1]);
		return 0;
	}
}

