package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m;
		int n;
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
		int i;
		int j;
		int[] sz = new int[n];
		int a;
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *ptr;
			 int ptr;
		for (i = 0;i < n;i++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				sz[i] = Integer.parseInt(tempVar3);
			}
		}
		for (j = 0;j < m;j++)
		{
					  ptr = sz[n - 1];
					  a = ptr;
			for (i = n - 1;i > 0;i--)
			{
				sz[i] = sz[i - 1];
			}
					  sz[0] = a;
		}
		for (i = 0;i < n - 1;i++)
		{
			System.out.printf("%d ",sz[i]);
		}
			 System.out.printf("%d",sz[n - 1]);
		return 0;
	}
}

