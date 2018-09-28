package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int m;
		int i;
		int j;
		int temp;
		int[] array;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			m = Integer.parseInt(tempVar2);
		}
		array = new int[n];
		for (i = 0; i < n; i++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				array[i] = Integer.parseInt(tempVar3);
			}
		}
		m = m % n;
		for (i = 0; i < m; i++)
		{
			temp = (array + (n - 1));
			for (j = n - 1; j > 0; j--)
			{
				array[j] = (array + (j - 1));
			}
			array[0] = temp;
		}
		for (i = 0; i < n - 1; i++)
		{
			System.out.printf("%d ", array[i]);
		}
		System.out.printf("%d\n", array[i]);
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'free' has no equivalent in Java:
		free(array);
		return 0;
	}

}

