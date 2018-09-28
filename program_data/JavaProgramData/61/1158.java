package <missing>;

public class GlobalMembers
{
	public static int fun(int x)
	{
		int[] b = new int[100];
		int i;
		if (x == 1 || x == 2)
		{
			return 1;
		}
		else
		{
			b[0] = b[1] = 1;
			for (i = 2;i < x;i++)
			{
			b[i] = b[i - 1] + b[i - 2];
			}
			return b[i - 1];
		}
	}
	public static int Main()
	{
		int i;
		int n;
		int[] a = new int[20];
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
		System.out.printf("%d\n",fun(a[i]));
		}
		return 0;
	}

}

