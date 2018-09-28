package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int m;
		int n;
		int i;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		int * p;
		int t;
		int[] a = new int[100];
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
		for (i = 1;i <= m;i++)
		{
			t = a[n - 1];
			p = a + n - 1;
			while (p != a)
			{
				*p = (p - 1);
				p--;
			}
			a[0] = t;
		}
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

}

