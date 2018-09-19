package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int k;
		int flag = 0;
		int i;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int[] shuzu = new int[n];
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				shuzu[i] = Integer.parseInt(tempVar2);
			}
		}
		System.out.printf("%d",shuzu[0]);
		for (i = 1;i < n;i++)
		{
			for (k = 0;k < i;k++)
			{
				if (shuzu[i] == shuzu[k])
				{
					flag = 1;
					break;
				}
			}
			if (flag == 0)
			{
				System.out.printf(" %d",shuzu[i]);
			}
			flag = 0;
		}
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'free' has no equivalent in Java:
		free(shuzu);
		return 0;

	}

}

