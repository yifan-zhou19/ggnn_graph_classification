package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int a;
		int b;
		int k;
		int m;
		int n;
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *p;
		int p;
		int sum1 = 0;
		int sum2 = 0;
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *sum;
		int sum;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		p = (int)malloc(10000 * (Integer.SIZE / Byte.SIZE));
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			k = Integer.parseInt(tempVar);
		}
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		sum = (int)malloc(1000 * (Integer.SIZE / Byte.SIZE));
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
			for (j = 0;j < m * n;j++)
			{
				String tempVar4 = ConsoleInput.scanfRead();
				if (tempVar4 != null)
				{
					p + j = Integer.parseInt(tempVar4);
				}
				sum1 = sum1 + *(p + j);
			}
			for (a = 1;a < m - 1;a++)
			{
				for (b = 1;b < n - 1;b++)
				{
					sum2 += *(p + a * n + b);
				}
			}
			*(sum + i) = sum1 - sum2;
			sum1 = 0;
			sum2 = 0;
		}
		for (i = 0;i < k;i++)
		{
			System.out.printf("%d\n",*(sum + i));
		}
	}



}

