package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int[] num = new int[1000];
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *p;
		int p;
		int i;
		int m;
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
		for (i = 0;i < n;i++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				num[i] = Integer.parseInt(tempVar3);
			}
		}
		p = num;
		for (i = 0;i < m;i++)
		{
			for (p = num + n;p >= num;p--)
			{

			*(p + 1) = p;
			}
		p = num;
		p = num[n];
		}
		for (i = 0;i < n - 1;i++)
		{
		System.out.printf("%d ",num[i]);
		}
		System.out.printf("%d",num[i]);

		return 0;
	}
}

