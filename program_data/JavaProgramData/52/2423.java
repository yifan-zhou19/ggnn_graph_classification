package <missing>;

public class GlobalMembers
{
	public static void change(tangible.RefObject<Integer> a, int n)
	{
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		int * p;
		int t;
		p = a.argValue + n - 1;
		t = p;
		for (;p != a.argValue;p--)
		{
			*p = (p - 1);
		}
		*p = t;
	}

	public static void Main()
	{
		int n;
		int m;
		int i;
		int j;
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
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *a;
		int a;
		a = LEN;
		for (i = 0;i < n;i++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				a + i = Integer.parseInt(tempVar3);
			}
		}
		for (j = 0;j < m;j++)
		{
		tangible.RefObject<Integer> tempRef_a = new tangible.RefObject<Integer>(a);
			change(tempRef_a, n);
			a = tempRef_a.argValue;
		}
		for (i = 0;i < n - 1;i++)
		{
			System.out.printf("%d ",*(a + i));
		}
		System.out.printf("%d\n",*(a + i));
	}
}

