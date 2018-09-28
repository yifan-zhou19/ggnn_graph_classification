package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int m;
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
			m = Integer.parseInt(tempVar2);
		}
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *p;
		int p;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		p = (int)malloc((Integer.SIZE / Byte.SIZE) * (n + 1));
		for (i = 0; i < n; i++)
		{
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			p + i = Integer.parseInt(tempVar3);
		}
		}
		m %= n;
		for (j = 0; j < m; j++)
		{
			for (i = n; i > 0; i--)
			{
			  *(p + i) = *(p + i - 1);
			}
			  p = *(p + n);
		}
		for (i = 0; i < n - 1; i++)
		{
		   System.out.printf("%d ",*(p + i));
		}
		System.out.printf("%d", *(p + n - 1));
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'free' has no equivalent in Java:
		free(p);
		return 0;
	}
}

