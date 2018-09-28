package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int[] cs = new int[999];
		int[] num = new int[99];
		int result = 60;
		int i;
		int j;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0; i < n; i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				cs[i] = Integer.parseInt(tempVar2);
			}
			for (j = 0; j < cs[i]; j++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					num[j] = Integer.parseInt(tempVar3);
				}
				if (num[j] < (result - 3))
				{
					result -= 3;
				}
	else if (num[j] >= (result - 3) && num[j] < result)
	{
					result = num[j];
	}
			}
			cs[i] = result;
			result = 60;
		}
		for (i = 0; i < n; i++)
		{
			System.out.printf("%d\n", cs[i]);
		}
		return 0;
	}


}

