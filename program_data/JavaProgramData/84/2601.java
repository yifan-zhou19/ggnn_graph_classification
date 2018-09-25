package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int n;
		int[] a = new int[n];
		int x;
		int y;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		int * p;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (p = a;p < n + a;p++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				*p = Integer.parseInt(tempVar2);
			}
		}
		p = a;
		x = a[0];
		for (i = 0;i < n;i++)
		{
			if (x < *(p + i))
			{
				x = (p + i);
			}
		}
		if (x == a[0])
		{
			y = a[0] - 1;
			for (i = 0;i < n;i++)
			{
				if (y < *p && *p < a[0])
				{
					y = p++;
				}
			}
		}
		if (x != a[0])
		{
			y = a[0];
			for (i = 0;i < n;i++)
			{
				if (y < a[i] && a[i] < x)
				{
					y = a[i];
				}
			}
		}
		System.out.printf("%d\n%d\n",x,y);
		return 0;
	}
}

