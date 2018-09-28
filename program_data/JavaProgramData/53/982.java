package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int[] a = new int[300];
		int[] b = new int[300];
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *p;
		int p;
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *q;
		int q;
		int i;
		int j;
		int k = 1;
		p = a;
		q = b;
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				p + i = Integer.parseInt(tempVar2);
			}
		}
		q = p;
		for (i = 1;i < n;i++)
		{
			for (j = 0;j < k;j++)
			{
				if (*(p + i) == *(q + j))
				{
					break;
				}
			}
			if (j == k)
			{
				*(q + j) = *(p + i);
				k = k + 1;
			}
		}
		for (i = 0;i < k - 1;i++)
		{
			System.out.printf("%d,",*(q + i));
		}
		System.out.printf("%d",*(q + k - 1));
	return 0;
	}

}

