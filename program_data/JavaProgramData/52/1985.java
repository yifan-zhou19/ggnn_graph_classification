package <missing>;

public class GlobalMembers
{
	public static void diaohuan(tangible.RefObject<Integer> a, int m, int n)
	{
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		int * i;
		for (i = a.argValue;i < a.argValue + n - m;i++)
		{
			*(i + n) = *i;
		}
		for (i = a.argValue;i < a.argValue + n;i++)
		{
			*i = (i + n - m);
		}
	}
	public static int Main()
	{
		int m;
		int n;
		int i;
		int[] a = new int[10000];
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
	tangible.RefObject<Integer> tempRef_a = new tangible.RefObject<Integer>(a);
		diaohuan(tempRef_a, m, n);
		a = tempRef_a.argValue;
		System.out.printf("%d",a[0]);
			 for (i = 1;i < n;i++)
			 {
				 System.out.printf(" %d",a[i]);
			 }
	}

}

