package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int r1;
		int r2;
		int i;
		int n;
		int num;
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
				num = Integer.parseInt(tempVar2);
			}
			if (i == 1)
			{
				r1 = num;
				r2 = r1;
			}
			else
			{
				if (r1 < num)
				{
					r2 = r1;
					r1 = num;
				}
				else if (num < r1)
				{
					if (r1 == r2)
					{
						r2 = num;
					}
					else if (r2 < num && num < r1)
					{
						r2 = num;
					}
				}
			}
		}
		System.out.printf("%d\n%d\n",r1,r2);
		return 0;
	}

}

