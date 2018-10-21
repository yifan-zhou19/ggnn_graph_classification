package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int k = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int[] zs;
		zs = new int[n];
		for (i = 3;i <= n;i++)
		{
			int c = 0;
			for (j = 2;j < i;j++)
			{
				if (i % j == 0)
				{
					c++;
				}
			}
			if (c == 0)
			{
				zs[k] = i;
				k++;
			}
		}
		int count = 0;
		for (i = 0;i < k;i++)
		{
			for (j = i;j < k;j++)
			{
				if (zs[j] - zs[i] == 2)
				{
					count++;
					System.out.printf("%d %d\n",zs[i],zs[j]);
				}
			}
		}
		if (count == 0)
		{
			System.out.print("empty");
		}
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'free' has no equivalent in Java:
		free(zs);
		return 0;
	}
}

