package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int i;
		int a;
		int[] num = {1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		for (i = 2;i < 20;i++)
		{
			num[i] = num[i - 1] + num[i - 2];
		}
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
				a = Integer.parseInt(tempVar2);
			}
			System.out.printf("%d\n",num[a - 1]);
		}
	}
}

