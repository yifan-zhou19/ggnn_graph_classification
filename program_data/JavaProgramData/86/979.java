package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int m;
		int[] num = new int[N];
		int i;
		int j;
		int k;
		int count;
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
				m = Integer.parseInt(tempVar2);
			}
			if (m != 0)
			{
				for (k = 0;k < m;k++)
				{
					String tempVar3 = ConsoleInput.scanfRead();
					if (tempVar3 != null)
					{
						num[k] = Integer.parseInt(tempVar3);
					}
				}
				if (num[m - 1] + m * 3 < 60)
				{
					count = 60 - m * 3;
				}
				else
				{
					for (j = 0;j < m;j++)
					{
						if (num[j] + j * 3 <= 60 && num[j] + (j + 1) * 3 >= 60)
						{
							count = num[j];
							break;
						}
						else if (num[j] + j * 3 > 60)
						{
							count = 60 - j * 3;
							break;
						}
					}
				}
			}
			else
			{
				count = 60;
			}
			System.out.printf("%d\n",count);
		}
		return 0;
	}
}

