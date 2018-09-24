package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int m;
		int[] a = new int[100];
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *p;
		int p;
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
		for (i = 0;i < n;i++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				a[i] = Integer.parseInt(tempVar3);
			}
		}
		p = a;
		p = a[n - m];
		System.out.printf("%d", p);
		for (i = 1;i < m;i++)
		{
			System.out.printf(" %d",*(p + i));
		}
		p = a;
		for (i = 0;i < (n - m);i++)
		{
			System.out.printf(" %d",*(p + i));
		}
	}

}

