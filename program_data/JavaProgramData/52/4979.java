package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int m;
		int i;
		int[] a = new int[MAX];
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *pa=0;
		int pa = null;
		int[] x = new int[MAX];
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
		for (i = 0;i < n - m;i++)
		{
			pa = a[i];
			x[i + m] = pa;
		}
		for (i = n - m;i < n;i++)
		{
			pa = a[i];
			x[i + m - n] = pa;
		}
		System.out.printf("%d",x[0]);
		for (i = 1;i < n;i++)
		{
			System.out.printf(" %d",x[i]);
		}
		System.out.print("\n");

		return 0;
	}

}

