package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int c;
		int j;
		int k;
		int[] num = new int[100];
		int n;
		int timess = 0;
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
				c = Integer.parseInt(tempVar2);
			}
			for (j = 0;j < c;j++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					num[j] = Integer.parseInt(tempVar3);
				}
			}
			if ((num[c - 1] + 3 * c) <= 60)
			{
				timess = 60 - c * 3;
				System.out.printf("%d\n",timess);
			}
			else
			{
				for (k = 1;k <= c;k++)
				{
					if ((num[k - 1] + 3 * k) <= 63 && (num[k - 1] + 3 * k)>60)
					{
						timess = num[k - 1];
						System.out.printf("%d\n",timess);
						break;
					}
					else if ((num[k - 1] + 3 * k) > 63)
					{
						timess = 60 - (k - 1) * 3;
						System.out.printf("%d\n",timess);
						break;
					}
				}
			}
			timess = 0;
		}
		return 0;
	}

}

