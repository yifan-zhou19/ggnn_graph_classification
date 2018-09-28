package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[100000];
		int n;
		int i;
		int k;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		int * p;
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *q;
		int q;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (p = a;p < a + n;p++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				p = Integer.parseInt(tempVar2);
			}
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			k = Integer.parseInt(tempVar3);
		}
		p = a;
		for (p = a;p < a + n;p++)
		{
			if (*p == k)
			{
				for (q = p;q < a + n;q++)
				{
					q = *(q + 1);
				}
				p--;
				n--;
			}
		}
		for (q = a;q < a + n - 1;q++)
		{
			System.out.printf("%d ", q);
		}
		System.out.printf("%d",a[n - 1]);
		return 0;
	}
}

