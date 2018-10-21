package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int m;
		int[] a = new int[200];
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		int * p;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			m = Integer.parseInt(tempVar2);
		}
		for (p = a;p < a + n;p++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				p = Integer.parseInt(tempVar3);
			}
		}
		p = a;
		for (p = a;p < a[n - m];p++)
		{
			*(p + n) = *p;
		}
		for (p = a;p < a[n];p++)
		{
			*p = (n - m + p);
		}
		for (p = a;p < a[n];p++)
		{
			if (p == a)
			{
				System.out.printf("%d",*p);
			}
			else
			{
				System.out.printf(" %d",*p);
			}
		}
	}
}

