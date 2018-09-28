package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int i;
		int[] a = new int[128];
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		int * p;
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *q;
		int q;
		int t;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		p = a;
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				p++ = Integer.parseInt(tempVar2);
			}
		}
		p = a;
		q = a + n - 1;
		for (i = 0;i <= n / 2 - 1;i++)
		{
			t = (p + i);
			*(p + i) = *(q - i);
			*(q - i) = t;
		}
		p = a;
		System.out.printf("%d",*p);
		p = a + 1;
		for (i = 1;i < n;i++)
		{
			System.out.printf(" %d",*(p++));
		}
	}
}

