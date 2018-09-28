package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *p;
		int p;
		int k;
		int m;
		int j;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		m = n;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		p = (int)malloc(n * (Integer.SIZE / Byte.SIZE));
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				(p + i) = Integer.parseInt(tempVar2);
			}
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			k = Integer.parseInt(tempVar3);
		}
		for (i = 0;i < m;i++)
		{
			if (*(p + i) == k)
			{
				for (j = i;j < m - 1;j++)
				{
					*(p + j) = *(p + j + 1);
				}
				i--;
				m--;
			}
		}
		for (i = 0;i < m - 1;i++)
		{
			System.out.printf("%d ",*(p + i));
		}
		System.out.printf("%d",*(p + m - 1));
		return 0;
	}

}

