package <missing>;

public class GlobalMembers
{
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *p,*q,m,n;
	 public static int p;
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *q;
	 public static int q;
	 public static int m;
	 public static int n;
	public static void shuru()
	{
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			n = Integer.parseInt(tempVar2);
		}
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		p = (int)malloc(m * (Integer.SIZE / Byte.SIZE));
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		q = (int)malloc(n * (Integer.SIZE / Byte.SIZE));
		for (int i = 0;i < m;i++)
		{
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			p + i = Integer.parseInt(tempVar3);
		}
		}
		for (int i = 0;i < n;i++)
		{
		String tempVar4 = ConsoleInput.scanfRead();
		if (tempVar4 != null)
		{
			q + i = Integer.parseInt(tempVar4);
		}
		}
	}
	public static int cmp(Object a, Object b)
	{
		return *(int)a - (int)b;
	}
	public static void shuchu()
	{
		for (int i = 0;i < m;i++)
		{
		System.out.printf("%d ",*(p + i));
		}
		for (int i = 0;i < n - 1;i++)
		{
		System.out.printf("%d ",*(q + i));
		}
		System.out.printf("%d",*(q + n - 1));
	}
	public static int Main()
	{
		shuru();
		qsort(p,m,(Integer.SIZE / Byte.SIZE),cmp);
		qsort(q,n,(Integer.SIZE / Byte.SIZE),cmp);
		shuchu();
	}

}

