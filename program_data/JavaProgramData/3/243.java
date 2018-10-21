package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] array;
		int n;
		int k;
		int i;
		int j;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			k = Integer.parseInt(tempVar2);
		}
		array = new int[n];

		for (i = 0;i < n;i++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				array + i = tempVar3;
			}
		}
		for (i = 0;i < n - 1;i++)
		{
			for (j = i + i;j < n;j++)
			{
				if (array[i] + array[j] == k)
				{
					System.out.print("yes");
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'free' has no equivalent in Java:
					free(array);
					return 0;
				}
			}
		}
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'free' has no equivalent in Java:
		free(array);
		System.out.print("no");
		return 0;
	}

}

