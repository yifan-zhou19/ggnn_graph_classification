package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int k = 0;
		int n;
		int nt;
		int total;
		int flag;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			k = Integer.parseInt(tempVar);
		}
		for (i = 0;i < k;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				n = Integer.parseInt(tempVar2);
			}
			flag = 0;
			for (j = 0;j <= n;j++)
			{
				if (j < n)
				{
					String tempVar3 = ConsoleInput.scanfRead();
					if (tempVar3 != null)
					{
						nt = Integer.parseInt(tempVar3);
					}
					if ((nt + 3 * j) >= 57 && (nt + 3 * j) <= 60)
					{
						total = nt;
						flag = 1;
					}
					if ((nt + 3 * (j + 1)) > 60)
					{
						if (flag == 0)
						{
							total = 60 - j * 3;
							flag = 1;
						}
					}
				}
				else
				{
					if (flag == 0)
					{
						total = 60 - j * 3;
					}
				}
			}
			System.out.printf("%d\n",total);
		}
	}
}

