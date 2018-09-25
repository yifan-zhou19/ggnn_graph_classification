package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		char n;
		char i;
		int[] a = new int[N];
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		int * p;
		int max;
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *pmax;
		int pmax;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = tempVar.charAt(0);
		}
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[i] = Integer.parseInt(tempVar2);
			}
		}
		max = a[0];
		for (p = a;p < a + n;p++)
		{
			if (max < *p)
			{
				max = p;
			}
		}
		System.out.printf("%d\n",max);
		if (max != a[0])
		{
			pmax = a;
		}
		else
		{
			pmax = a + 1;
		}
		for (p = a;p < a + n;p++)
		{
			if (pmax < *p && *p < max)
			{
				pmax = p;
			}
		}
		System.out.printf("%d", pmax);
	}
}

