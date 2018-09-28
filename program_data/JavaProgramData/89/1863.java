package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int[] exclusion;
		int[] refCount;
		int a;
		int b;
		int i;
		int found;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		exclusion = new int[n];
		refCount = new int[n];
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(exclusion,0,(Integer.SIZE / Byte.SIZE) * n);
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(refCount,0,(Integer.SIZE / Byte.SIZE) * n);

		while (true)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				b = Integer.parseInt(tempVar3);
			}
			if (a == 0 && b == 0)
			{
				break;
			}
			exclusion[a] = 1;
			refCount[b]++;
		}

		found = 0;
		for (i = 0;i < n;i++)
		{
			if (exclusion[i] == 0 && refCount[i] >= n - 1)
			{
			System.out.printf("%d\n",i);
			found = 1;
			}
		}

		if (found == 0)
		{
			System.out.print("NOT FOUND\n");
		}

//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'free' has no equivalent in Java:
		free(exclusion);
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'free' has no equivalent in Java:
		free(refCount);

		return 0;
	}

}

