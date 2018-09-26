package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int k;
		int[] ssy = new int[100];
		int[] szy = new int[100];
		int[] t = new int[100];
		int[] cs = new int[100];
		int i;
		int a;
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
				ssy[i] = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				szy[i] = Integer.parseInt(tempVar3);
			}
			if (ssy[i] >= 90 && ssy[i] <= 140 && szy[i] >= 60 && szy[i] <= 90)
			{
				t[i] = 1;
			}
			else
			{
				t[i] = 0;
			}
		}
		for (i = 0;i < n;i++)
		{
			cs[i] = 0;
			if (t[i] == 1)
			{
				for (k = i;k < n;k++)
				{
					if (t[k] == 1)
					{
						cs[i]++;
					}
					else
					{
						break;
					}
				}
			}
		}
		for (i = 1;i <= n;i++)
		{
			for (k = 0;k < n - i;k++)
			{
				if (cs[k] < cs[k + 1])
				{
					a = cs[k];
					cs[k] = cs[k + 1];
					cs[k + 1] = a;
				}
			}
		}
		System.out.printf("%d",cs[0]);
		return 0;
	}
}

