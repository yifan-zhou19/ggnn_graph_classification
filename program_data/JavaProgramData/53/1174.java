package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int[] shuzu = new int[300];
		int i;
		int j;
		int n;
		int t = 0;
		int u = 0;
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
				shuzu[i] = Integer.parseInt(tempVar2);
			}
		}
		for (i = 0;i < n;i++)
		{
			for (j = i + 1;j < n;j++)
			{
				if (shuzu[j] == shuzu[i])
				{
					shuzu[j] = 0;
				}
			}
		}
		for (i = 0;i < n;i++)
		{
			if (shuzu[i] != 0)
			{
				t++;
			}
		}
		for (i = 0;i < n;i++)
		{
			if (shuzu[i] != 0)
			{
				u++;
				if (u != t)
				{
				System.out.printf("%d,",shuzu[i]);
				}
				else
				{
					System.out.printf("%d",shuzu[i]);
				}
			}
		}
	}
}

