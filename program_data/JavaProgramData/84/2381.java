package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int num;
		int len;
		int max1 = 0;
		int max2 = 0;
		int tmp;
		int i;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			len = Integer.parseInt(tempVar);
		}
		for (i = 1;i <= len;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				num = Integer.parseInt(tempVar2);
			}
			if (num > max1)
			{
				tmp = num;
				num = max1;
				max1 = tmp;
				if (num > max2)
				{
					tmp = num;
					num = max2;
					max2 = tmp;
				}
			}
			if (max1 > num && num > max2)
			{
				tmp = num;
				num = max2;
				max2 = tmp;
			}

		}
		System.out.printf("%d\n%d\n",max1,max2);
		return 0;
	}
}

