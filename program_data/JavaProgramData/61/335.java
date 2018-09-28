package <missing>;

public class GlobalMembers
{
	public static int f(int x)
	{
		if (x == 1)
		{
			return 1;
		}
		else if (x == 2)
		{
			return 1;
		}
		else
		{
		return f(x - 2) + f(x - 1);
		}
	}
	public static int Main()
	{
		int n;
		int i;
		int[] a = new int[10];
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
		System.out.printf("%d\n",f(a[i]));
		}
	}

}

