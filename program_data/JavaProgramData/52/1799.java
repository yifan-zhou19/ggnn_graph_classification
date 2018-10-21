package <missing>;

public class GlobalMembers
{
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on the parameter 'p', so pointers on this parameter are left unchanged:
	public static void move(int[] a, int * p, int n, int m)
	{
		for (p = a;p < a + n - m;p++)
		{
			*(p + n) = *p;
		}
		for (p = a + n - m;p < a + n;p++)
		{
			*(p - n + m) = *p;
		}
		for (p = a + n;p < a + 2 * n - m;p++)
		{
			*(p - n + m) = *p;
		}
	}
	public static int Main()
	{
		int m;
		int n;
		int i;
		int[] a = new int[100];
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *p;
		int p;
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
		move(a, p, n, m);
		for (p = a;p < a + n;p++)
		{
			System.out.printf("%d", p);
			if (p != a + n - 1)
			{
				System.out.print(" ");
			}
		}
	}

}

