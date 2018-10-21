package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int[] a = new int[100];
		int sum = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0; i < n; i++)
		{
			a[i] = i + 1;
		}
		for (i = 0; i < n; i++)
		{
			if (a[i] % 7 == 0 || a[i] % 10 == 7 || (int)a[i] / 10 == 7)
			{
				continue;
			}
			sum += a[i] * a[i];
		}
		System.out.printf("%d",sum);
		return 0;
	}

}

