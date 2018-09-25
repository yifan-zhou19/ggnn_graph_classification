package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int k = 0;
		int max = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			k = Integer.parseInt(tempVar);
		}
		int[] h = new int[k];
		int[] p = new int[k];
		for (int i = 0;i < k;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				h[i] = Integer.parseInt(tempVar2);
			}
		}
		p[k - 1] = 1;
		for (int i = 0;i < k - 1;i++)
		{
			for (int j = 1;k - 2 - i + j <= k - 1;j++)
			{
				if (h[k - 2 - i] >= h[k - 2 - i + j])
				{
					if (max <= p[k - 2 - i + j])
					{
					max = p[k - 2 - i + j];
					}
				}
			}
			p[k - 2 - i] = max + 1;
			max = 0;
		}
			max = p[0];
			for (int i = 0;i < k;i++)
			{
				if (max < p[i])
				{
				   max = p[i];
				}
			}
			System.out.printf("%d",max);
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'free' has no equivalent in Java:
			free(h);
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'free' has no equivalent in Java:
			free(p);
	}
}

