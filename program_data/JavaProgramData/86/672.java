package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int n;
		int cishu;
		int[] num = new int[100];
		int sum;
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
				cishu = Integer.parseInt(tempVar2);
			}
			for (j = 1;j <= cishu;j++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					num[j - 1] = Integer.parseInt(tempVar3);
				}
			}
			if (cishu * 3 + num[cishu - 1] <= 60)
			{
				sum = 60 - 3 * cishu;
				System.out.printf("%d\n",sum);
			}
			else
			{
				for (j = 1;j <= cishu;j++)
				{
					if (j * 3 + num[j - 1] > 60 && j * 3 + num[j - 1] <= 63)
					{
						System.out.printf("%d\n",num[j - 1]);
						break;
					}
					else if (j * 3 + num[j - 1] > 63)
					{
						sum = 60 - 3 * (j - 1);
						System.out.printf("%d\n",sum);
						break;
					}
				}
			}
		}
		return 0;
	}


}

