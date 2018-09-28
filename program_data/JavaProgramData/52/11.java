package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m;
		int n;
		int[] a = new int[PI];
		int i;
		int tmp;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		int * pi;

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

		pi = a[0];
		i = 0;
		while (i != m)
		{
			pi += n - 1;
			tmp = pi;
			for (;pi > a[0];pi--)
			{
				*pi = (pi - 1);
			}
			*pi = tmp;
			i++;
		}

		for (i = 0;i < n;i++)
		{
			if (i == n - 1)
			{
				System.out.printf("%d",a[i]);
			}
			else
			{
				System.out.printf("%d ",a[i]);
			}
		}

		return 0;
	}
}

