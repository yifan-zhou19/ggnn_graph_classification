package <missing>;

public class GlobalMembers
{
	public static int cmp(Object a1, Object a2)
	{
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *p1 = (int *)a1;
		int p1 = (int)a1;
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *p2 = (int *)a2;
		int p2 = (int)a2;
		return p2 - p1;
	}

	public static int Main()
	{

		int n;
		int[] m = new int[101];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int i;
		for (i = 0; i < n; ++i)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				m[i] = Integer.parseInt(tempVar2);
			}
		}
		qsort(m, n, (Integer.SIZE / Byte.SIZE), cmp);
		System.out.printf("%d\n%d\n", m[0], m[1]);
		return 0;
	}
}

