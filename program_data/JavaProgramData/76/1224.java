package <missing>;

public class GlobalMembers
{
	public static int[] a = new int[50000];
	public static int[] b = new int[50000];
	public static int Main()
	{
		int n;
		int i;
		int k = 1;
		int a0;
		int b0;
		int result = 1;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[i] = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				b[i] = Integer.parseInt(tempVar3);
			}
		}
		a0 = a[0];
		b0 = b[0];
		for (;k < n - 1;)
		{
			for (i = 1;i < n;i++)
			{
				k = i;
				if (a[i] <= a0 != 0 && b[i] >= b0)
				{
					if (!(a[i] == a0 && b[i] == b0))
					{
						a0 = a[i];
						b0 = b[i];
						break;
					}
				}
				if (a[i] < a0 && b[i] >= a0 != 0 && b[i] <= b0)
				{
					a0 = a[i];
					break;
				}
				if (a[i] >= a0 != 0 && a[i] <= b0 != 0 && b[i]> b0)
				{
					b0 = b[i];
					break;
				}
			}
		}
		for (i = 0;i < n;i++)
		{
			if (a[i] < a0 || b[i]> b0)
			{
				result = 0;
			}
		}
		if (result == 1)
		{
			System.out.printf("%d %d",a0,b0);
		}
		else
		{
			System.out.print("no");
		}
		return 0;
	}
}

