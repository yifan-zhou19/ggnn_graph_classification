package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[100];
		int sum = 0;
		int i;
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 1;i <= n;i++)
		{
			a[i] = i;
			if (i % 7 == 0 || i % 10 == 7 || i >= 70 && i <= 79)
			{
				a[i] = 0;
			}
			if (a[i] != 0)
			{
				sum += a[i] * a[i];
			}
		}
		System.out.printf("%d",sum);
		return 0;
	}

}

