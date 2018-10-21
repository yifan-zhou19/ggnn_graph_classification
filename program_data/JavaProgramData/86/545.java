package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int k;
		int j;
		int result;
		int zcs;
		int m;
		int[] cs = new int[100];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			result = 0;
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				m = Integer.parseInt(tempVar2);
			}
			if (m == 0)
			{
				zcs = 60;
			}
			for (k = 0;k < m;k++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					cs[k] = Integer.parseInt(tempVar3);
				}
				for (j = m - 1;j >= 0;j--)
				{
				result = cs[j] + (j + 1) * 3;
					if (result <= 60)
					{
					zcs = 60 - 3 * (j + 1);
					break;
					}
				else if (result > 60 && (result - 3) < 60)
				{
						zcs = cs[j];
						break;
				}
				}
			}


			System.out.printf("%d\n",zcs);
		}
		return 0;
	}
}

