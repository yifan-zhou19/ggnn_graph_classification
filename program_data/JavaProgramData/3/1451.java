package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int k;
		int[] shuzu = new int[1000];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			k = Integer.parseInt(tempVar2);
		}

		for (int i = 0;i < n;i++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				shuzu[i] = Integer.parseInt(tempVar3);
			}

		}
		int count1 = 0;
		for (int j = 1;j <= n;j++)
		{
			for (int i = (j - 1);i < n;i++)
			{
				if (k == (shuzu[j] + shuzu[i]))
				{
					count1 += 1;
				}
				else
				{
					continue;
				}
			}
		}
		if (count1 != 0)
		{
			System.out.print("yes");
		}
		else
		{
			System.out.print("no");
		}

		return 0;
	}
}

