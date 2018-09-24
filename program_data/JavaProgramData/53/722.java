package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int[] a = new int[300];
		int[] b = new int[300];
		int n;
		int i;
		int j = 1;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		int * p;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		int * q;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			a[i] = Integer.parseInt(tempVar2);
		}
		}
		b[0] = a[0];
		for (p = a + 1;p < a + n;p++)
		{
			for (q = p - 1;q >= a;q--)
			{
				if (*q == *p)
				{
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
					goto loop;
				}
			}
			b[j] = p;
			j++;
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
	loop:
	continue;
		}
	for (i = 0;i < j - 1;i++)
	{
	System.out.printf("%d,",b[i]);
	}
	System.out.printf("%d",b[j - 1]);
	}
}

