package <missing>;

public class GlobalMembers
{
	public static int f(int a)
	{
		if (a == 3)
		{
			return 2;
		}
			else if (a == 2 || a == 1)
			{
				return 1;
			}
			else
			{
				return (f(a - 1) + f(a - 2));
			}
	}
	public static int Main()
	{
		int a;
		int n;
		int k;
		int i;
		int[] r = new int[100];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			k = Integer.parseInt(tempVar);
		}
		for (i = 1;i <= k;i++)
		{
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			n = Integer.parseInt(tempVar2);
		}
		a = f(n);
		System.out.printf("%d\n",a);
		}
		return 0;
	}
}

