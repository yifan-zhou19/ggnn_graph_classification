package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int k;
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
		int p = 0;
		int[] shuzu = new int[1000];
		for (int i = 0;i <= n - 1;i++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				shuzu[i] = Integer.parseInt(tempVar3);
			}
		}
		for (int a = 0;a <= n - 1;a++)
		{
			for (int b = 0;b <= n - 1;b++)
			{
				if (shuzu[a] + shuzu[b] == k)
				{
					p = 1;
				}
			}
		}
		if (p == 1)
		{
			System.out.print("yes");
		}
		if (p == 0)
		{
			System.out.print("no");
		}
		return 0;
	}


}

