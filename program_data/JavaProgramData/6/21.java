package <missing>;

public class GlobalMembers
{
	public static void sub()
	{
		int m;
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			n = Integer.parseInt(tempVar2);
		}
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *p;
		int p;
		int i;
		int sum = 0;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		p = (int)malloc(10000 * (Integer.SIZE / Byte.SIZE));
		for (i = 0;i < m * n;i++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				p + i = Integer.parseInt(tempVar3);
			}
		}
		for (i = 1;i < n - 1;i++)
		{
			sum = sum + *(p + i);
		}
		for (i = m * n - n + 1;i < m * n - 1;i++)
		{
			sum = sum + *(p + i);
		}
		for (i = 0;i < m * n;i++)
		{
			if ((i % n) == 0 || ((i + 1) % n) == 0)
			{
				sum = sum + *(p + i);
			}
		}
		System.out.printf("%d\n",sum);
	}


	public static void Main()
	{
		int k;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			k = Integer.parseInt(tempVar);
		}
		int i;
		for (i = 0;i < k;i++)
		{
		sub();
		}
	}
}

