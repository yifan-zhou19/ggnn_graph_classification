package <missing>;

public class GlobalMembers
{
	public static int[] shuzu = new int[20000];
	public static int Main()
	{
		int n;
		int x;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (int t = 0;t < n;t++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				shuzu[t] = Integer.parseInt(tempVar2);
			}
		}
		for (int j = 0;j < n;j++)
		{
			for (int i = j + 1;i < n;i++)
			{
			   if (shuzu[i] == shuzu[j])
			   {
						 shuzu[i] = 0;
			   }
			}
		}
		for (int m = 0;m < n;m++)
		{
			if (shuzu[m] != 0)
			{
				if (m == 0)
				{
				System.out.printf("%d",shuzu[m]);
				}
				else
				{
					   System.out.printf(" %d",shuzu[m]);
				}
			}
		}
	return 0;
	}
}

