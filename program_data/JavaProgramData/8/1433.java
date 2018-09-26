package <missing>;

public class GlobalMembers
{
	public static int m;
	public static int n;
	public static int[] a = new int[100];
	public static void insert()
	{
		int i = 0;
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

		for (i = 0;i < m;i++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				a[i] = Integer.parseInt(tempVar3);
			}
		}
		System.out.print("\n");
		for (i = m;i < m + n;i++)
		{
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				a[i] = Integer.parseInt(tempVar4);
			}
		}
	}
	public static void px(tangible.RefObject<Integer> p)
	{
		int i;
		int j;
		int b = 0;
		for (i = 0;i < m;i++)
		{
			for (j = m - 1;j > i;j--)
			{
				if (*(p.argValue + j) < *(p.argValue + j - 1))
				{
					b = (p.argValue + j);
					*(p.argValue + j) = *(p.argValue + j - 1);
					*(p.argValue + j - 1) = b;
				}
			}
		}
		for (i = m;i < m + n;i++)
		{
			for (j = m + n - 1;j > i;j--)
			{
			if (*(p.argValue + j) < *(p.argValue + j - 1))
			{
					b = (p.argValue + j);
					*(p.argValue + j) = *(p.argValue + j - 1);
					*(p.argValue + j - 1) = b;
			}
			}
		}
		System.out.printf("%d",*(p.argValue+0));
		for (i = 1;i < m + n;i++)
		{
		  System.out.printf(" %d",*(p.argValue + i));
		}
	}
	public static void Main()
	{
		insert();
	tangible.RefObject<Integer> tempRef_a = new tangible.RefObject<Integer>(a);
		px(tempRef_a);
		a = tempRef_a.argValue;
	}

}

