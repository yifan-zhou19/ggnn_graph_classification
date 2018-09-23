package <missing>;

public class GlobalMembers
{
	public static int f(int a,int min)
	{
		if (a < min)
		{
			return 0;
		}
		int sum = 1;
		for (int i = min;i < a;i++)
		{
			if (a % i == 0)
			{
				sum += f(a / i, i);
			}
		}
		return sum;
	}
	public static int Main()
	{
		int n;
		int[] a = new int[100];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (int i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[i] = Integer.parseInt(tempVar2);
			}
			a[i] = f(a[i], 2);
		}
		for (int i = 0;i < n;i++)
		{
			System.out.printf("%d\n",a[i]);
		}
		return 0;
	}

}

