package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n = 0;
		int i = 0;
		int minnum = 60;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			int m;
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				m = Integer.parseInt(tempVar2);
			}
			int p = 0;
			for (p = 0;p < m;p++)
			{
				int number;
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					number = Integer.parseInt(tempVar3);
				}
				if ((number + 3 * p) <= 60)
				{
					if ((60 - number - (3 * p) - 3) >= 0)
					{
						minnum = 60 - (3 * p) - 3;
					}
					else if ((60 - number - (3 * p) - 3) < 0)
					{
						minnum = number;
					}
				}
			}
			System.out.printf("\n%d\n",minnum);
		}
		return 0;
	}
}

