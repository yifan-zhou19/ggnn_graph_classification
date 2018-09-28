package <missing>;

public class GlobalMembers
{
	public static int num(int a)
	{
		int m;
		if (a == 1 || a == 2)
		{
			m = 1;
		}
		else
		{
			m = num(a - 1) + num(a - 2);
		}
		return (m);
	}
	public static int Main()
	{
		int i;
		int n;
		int m;
		int[] a = new int[100];
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
		}
		for (i = 0;i < n;i++)
		{
			m = num(a[i]);
			System.out.printf("%d\n",m);
		}
		return 0;
	}
}

