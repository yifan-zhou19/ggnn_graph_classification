package <missing>;

public class GlobalMembers
{
	public static int f(int a,int min)
	{
		if (a < min)
		{
			return 0;
		}
		int result = 1;
		int i;
		for (i = min;i < a;i++)
		{
			if (a % i == 0)
			{
				result += f(a / i, i);
			}
		}
		return (result);
	}
	public static int Main()
	{
		int n;
		int[] a = new int[100];
		int[] b = new int[100];
		int i;
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
			b[i] = f(a[i], 2);
		}
		for (i = 0;i < n;i++)
		{
			System.out.printf("%d\n",b[i]);
		}
		return 0;
	}

}

