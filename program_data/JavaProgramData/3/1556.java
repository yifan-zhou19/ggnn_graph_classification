package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int k;
		int[] shuzu = new int[1000];
		int j;
		int x = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			k = Integer.parseInt(tempVar2);
		}
		for (i = 0;i < n;i++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				shuzu[i] = Integer.parseInt(tempVar3);
			}
		}
		for (i = 0;i < n;i++)
		{
			for (j = i + 1;j < n;j++)
			{
				if (shuzu[i] + shuzu[j] == k)
				{
					System.out.print("yes");
					j = n + 1;
					i = n + 1;
				}
				else
				{
					x++;
				}
			}
		}
		if (x == ((n - 1) * n / 2))
		{
			System.out.print("no");
		}
		return 0;
	}
}

