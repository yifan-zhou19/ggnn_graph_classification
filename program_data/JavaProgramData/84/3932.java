package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n = 0;
		int maxNum = 0;
		int secMax = 0;
		int temp = 0;

		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}

		for (int i = 0; i < n; i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				temp = Integer.parseInt(tempVar2);
			}
			if (temp > maxNum)
			{
				secMax = maxNum;
				maxNum = temp;
			}
			else
			{
				if (temp > secMax)
				{
					secMax = temp;
				}
			}
		}

		System.out.printf("%d\n%d\n", maxNum, secMax);
	}
}

