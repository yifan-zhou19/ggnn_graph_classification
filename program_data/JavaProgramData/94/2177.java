package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m;
		int n;
		int i;
		int[] a = new int[1000];
		int t;
		int count = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 1;i <= n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				t = Integer.parseInt(tempVar2);
			}
			if (t % 2 == 1)
			{
				a[count] = t;
				count++;
			}
		}
		m = count;
		while (count >= 2)
		{
			for (i = 1;i <= count - 1;i++)
			{
				if (a[i - 1] > a[i])
				{
					t = a[i - 1];
					a[i - 1] = a[i];
					a[i] = t;
				}
			}
			count--;
		}
		System.out.printf("%d",a[0]);
		for (i = 1;i <= m - 1;i++)
		{
			System.out.printf(",%d",a[i]);
		}
		return 0;
	}
}

