package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] x = new int[20];
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *p;
		int p;
		int n;
		int m;
		int i;
		int j;
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
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		p = (int) malloc((Integer.SIZE / Byte.SIZE) * n);
		for (i = 0; i < n; i++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				x[i] = Integer.parseInt(tempVar3);
			}
		}
		j = 0;
		for (i = n - m ; i < n; i++)
		{
			*(p + j) = x[i];
			j++;
		}
		j = m;
		for (i = 0; i < n - m ; i++)
		{
			*(p + j) = x[i];
			j++;
		}
		for (i = 0; i < n; i++)
		{
			if (i != n - 1)
			{
				System.out.printf("%d ", *(p + i));
			}
			else
			{
				System.out.printf("%d\n", *(p + i));
			}
		}
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'free' has no equivalent in Java:
		free(p);
		return 0;
	}
}

