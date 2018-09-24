package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int f = new int(int a,int min);
		int n;
		int[] a = new int[150];
		int i;
		int b;
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
			b = f(a[i], 2);
			System.out.printf("%d\n",b);
		}
		return 0;
	}


	public static int f(int a,int min)
	{
		int result = 1;
		int i;
		if (a < min)
		{
		return 0;
		}
		for (i = min;i < a;i++)
		{
			if (a % i == 0)
			{
			result += f(a / i, i);
			}
		}
		return result;
	}
}

