package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		void inv(int * a,int n,int m);
		int[] a = new int[100];
		int m;
		int n;
		int i;
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
		for (i = 0;i < n;i++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				a[i] = Integer.parseInt(tempVar3);
			}
		}
	tangible.RefObject<Integer> tempRef_a = new tangible.RefObject<Integer>(a);
		inv(tempRef_a, n, m);
		a = tempRef_a.argValue;
		for (i = 0;i < n;i++)
		{
			if (i != 0)
			{
				System.out.print(" ");
			}
			System.out.printf("%d",a[i]);
		}
		System.out.print("\n");
	}
	public static void inv(tangible.RefObject<Integer> a, int n, int m)
	{
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		int * p;
		int a_end;
		a_end = (a.argValue + n - 1);
		for (p = a.argValue + n - 1;p > a.argValue;p--)
		{
			*p = (p - 1);
		}
		a.argValue = a_end;
		m--;
		if (m > 0)
		{
			inv(a, n, m);
		}
	}



}

