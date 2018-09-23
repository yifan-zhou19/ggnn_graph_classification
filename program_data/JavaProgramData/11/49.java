package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		int j;
		int k;
		int l;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			j = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			k = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			l = Integer.parseInt(tempVar3);
		}
		if (j % 4 == 0)
		{
			if (j % 100 != 0)
			{
				a[1] = 29;
			}
			else if (j % 100 == 0 && j % 400 == 0)
			{
				a[1] = 29;
			}
			if (j % 100 == 0 && j % 400 != 0)
			{
				a[1] = 28;
			}
		}
		int sum = 0;
		int m;
		for (m = 0;m < k - 1;m++)
		{
			sum = sum + a[m];
		}
		sum = sum + l;
		System.out.printf("%d",sum);
		return 0;
	}
}

