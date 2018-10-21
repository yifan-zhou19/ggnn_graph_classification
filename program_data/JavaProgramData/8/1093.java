package <missing>;

public class GlobalMembers
{
	public static int n;
	public static int m;
	public static int key;
	public static int j;
	public static int k;
	public static int i;
	public static int t;
	public static int Main()
	{
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
//ORIGINAL LINE: int *p1=(int*)malloc((n+1)*sizeof(int));
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		int p1 = (int)malloc((n + 1) * (Integer.SIZE / Byte.SIZE));
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *p2=(int*)malloc((m+1)*sizeof(int));
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		int p2 = (int)malloc((m + 1) * (Integer.SIZE / Byte.SIZE));
		for (i = 1;i <= n;i++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				(p1 + i) = Integer.parseInt(tempVar3);
			}
		}
		for (i = 1;i <= m;i++)
		{
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				(p2 + i) = Integer.parseInt(tempVar4);
			}
		}
		for (i = 1;i <= n - 1;i++)
		{
			for (j = i + 1;j <= n;j++)
			{
				if (*(p1 + i) > *(p1 + j))
				{
					t = (p1 + i),*(p1 + i) = *(p1 + j),*(p1 + j) = t;
				}
			}
		}
		for (i = 1;i <= m - 1;i++)
		{
			for (j = i + 1;j <= m;j++)
			{
				if (*(p2 + i) > *(p2 + j))
				{
					t = (p2 + i),*(p2 + i) = *(p2 + j),*(p2 + j) = t;
				}
			}
		}
		for (i = 1;i <= n;i++)
		{
			System.out.printf("%d ",*(p1 + i));
		}
		for (i = 1;i <= m;i++)
		{
			if (i == m)
			{
				System.out.printf("%d",*(p2 + i));
			}
			else
			{
				System.out.printf("%d ",*(p2 + i));
			}
		}
	}
}

