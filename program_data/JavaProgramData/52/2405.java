package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int m;
		int i;
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
		int[] a = new int[1000];
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *p;
		int p;
		p = a;
		for (i = 0;i < n;i++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				p + i = Integer.parseInt(tempVar3);
			}
		}
		for (i = 0;i < m;i++)
		{
			*(p + n + i) = *(p + n - m + i);
		}
		for (i = (n - 1);i >= m;i--)
		{
			*(p + i) = *(p + i - m);
		}
		for (i = 0;i < m;i++)
		{
			*(p + i) = *(p + n + i);
		}
		for (i = 0;i < n - 1;i++)
		{
			System.out.printf("%d ",*(p + i));
		}
		System.out.printf("%d",*(p + n - 1));
	return 0;
	}
}

