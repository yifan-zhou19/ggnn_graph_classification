package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int i;
		int m;
		int n;
		int[] a = new int[100];
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *p;
		int p;
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
		for (i = 0;i < m;i++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				a[i] = Integer.parseInt(tempVar3);
			}
		}
		p = a;
		for (i = 0;i < m - n;i++)
		{
			*(p + m) = p++;
		}
		p = a + m - n;
		System.out.printf("%d", p);
		for (i = 1;i < m;i++)
		{
			System.out.printf(" %d",*++p);
		}
	}
}

