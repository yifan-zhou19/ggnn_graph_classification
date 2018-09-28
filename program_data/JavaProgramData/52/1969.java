package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int m;
		int[] a = new int[100];
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		int * p;
		int i;
		int t;
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

		for (i = 0;i < n - m;i++)
		{
			t = a[0];
			for (p = a;p < a + n - 1;p++)
			{
			*p = (p + 1);
			}
			a[n - 1] = t;
		}
		for (p = a;p < a + n - 1;p++)
		{
		System.out.printf("%d ",*p);
		}
		System.out.printf("%d",a[n - 1]);
	}
}

