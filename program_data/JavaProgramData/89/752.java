package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int r1;
		int r2;
		int refer = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int[] sz = new int[n];
		int[] sz2 = new int[n];
		for (i = 0;i < n;i++)
		{
			sz[i] = 1;
			sz2[i] = 0;
		}
		while (true)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				r1 = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				r2 = Integer.parseInt(tempVar3);
			}
			if (r1 == 0 && r2 == 0)
			{
				break;
			}
			if (r1 != r2)
			{
				sz[r2]++;
				sz2[r1] = 1;
			}
		}
		for (i = 0;i < n;i++)
		{
			if (sz[i] == n && sz2[i] == 0)
			{
				System.out.printf("%d",i);
				refer = 1;
			}
		}
		if (refer == 0)
		{
			System.out.print("NOT FOUND");
		}
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'free' has no equivalent in Java:
		free(sz);
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'free' has no equivalent in Java:
		free(sz2);
		return 0;
	}

}

