package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int k;
		int m;
		int n;
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *q;
		int q;
		(int)(*p)[100];
		int h = 0;
		int i;
		int j;
		int l;
		int t;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		p = (int [100])malloc(100 * 100 * (Integer.SIZE / Byte.SIZE));
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		q = (int)malloc(100 * (Integer.SIZE / Byte.SIZE));
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			k = Integer.parseInt(tempVar);
		}
		for (i = 0;i < k;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				m = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				n = Integer.parseInt(tempVar3);
			}
			for (j = 0;j < m;j++)
			{
				for (l = 0;l < n;l++)
				{
					String tempVar4 = ConsoleInput.scanfRead();
					if (tempVar4 != null)
					{
						*(p + j) + l = tempVar4;
					}
				}
			}
			for (t = 0;t < n;t++)
			{
				*(q + i) = *(q + i) + *(*p + t) + *(*(p + m - 1) + t);
			}
			for (t = 0;t < m;t++)
			{
				*(q + i) = *(q + i) + **(p + t) + *(*(p + t) + n - 1);
			}
			*(q + i) = *(q + i) - **p - *(*p + n - 1) - *(*(p + m - 1)) - *(*(p + m - 1) + n - 1);
		}
		for (i = 0;i < k;i++)
		{
			System.out.printf("%d\n",*(q + i));
		}
	}
}

