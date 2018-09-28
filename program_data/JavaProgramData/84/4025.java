package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int len;
		int e;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			len = Integer.parseInt(tempVar);
		}
		int[] num = new int[100];
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			num[0] = Integer.parseInt(tempVar2);
		}
		for (int k = 1;k <= 2;k++)
		{
			for (int i = 0;i < len - k;i++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					num[i + 1] = Integer.parseInt(tempVar3);
				}
				if (num[i] > num[i + 1])
				{
					e = num[i + 1];
					num[i + 1] = num[i];
					num[i] = e;
				}
			}
		}
		System.out.printf("%d\n%d\n",num[len - 1],num[len - 2]);
		return 0;
	}
}

