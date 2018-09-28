package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int[] a = new int[300];
		int[] b = new int[300];
		int n;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		int * p;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		int * q;
		int t = 0;
		int i;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		int * j;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (p = a,i = 0;i < n;p++,i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				p = Integer.parseInt(tempVar2);
			}
		}
		j = b;
		p = a;
		*j = p;
		p++;
		while (*p != 0)
		{
			for (q = b;q <= j - t;q++)
			{
				if (*p == *q)
				{
					t++;
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
					goto A;
				}
			}
			*(j + 1 - t) = *p;
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
	A:
	j++;
			p++;
		}
		for (q = b;q < j - t;q++)
		{
			System.out.printf("%d,",*q);
		}
		System.out.printf("%d\n",*(j - t));
	}
}

