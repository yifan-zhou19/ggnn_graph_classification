package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[100];
		int b;
		int n;
		int i;
		int sum;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		sum = 0;
		b = 0;
		for (i = 1;i <= n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[i] = Integer.parseInt(tempVar2);
			}
			if (sum < a[i])
			{
				sum = a[i];
			}
		}
		for (i = 1;i <= n;i++)
		{
			if (a[i] < sum && b < sum && b < a[i])
			{
				b = a[i];
			}
		}
		System.out.printf("%d\n%d\n",sum,b);
		return 0;
	}

}

