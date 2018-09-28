package <missing>;

public class GlobalMembers
{
	public static int[] shuzu = new int[1000000];
	public static int Main()
	{
		int n;
		int k;
		int x;
		int num = 0;
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
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			k = Integer.parseInt(tempVar3);
		}
		for (int j = 0;j < n;j++)
		{
			   if (shuzu[j] == k)
			   {
					for (int i = j;i <= n - 1;i++)
					{
						  x = shuzu[i];
						  shuzu[i] = shuzu[i + 1];
						  shuzu[i + 1] = x;
					}
					n--;
				   if (shuzu[j] == k)
				   {
						j = j - 1;
				   }
			   }
		}
		for (int m = 0;m < n;m++)
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
	return 0;
	}
}

