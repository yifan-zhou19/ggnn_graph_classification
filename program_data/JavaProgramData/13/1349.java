package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int timer = 0;
		int[] a = new int[20001];
		int[] b = new int[20001];
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
				a[i] = Integer.parseInt(tempVar2);
			}
		}
		for (i = 2;i <= n;i++)
		{
			for (j = 1;j < i;j++)
			{
				if (a[j] != a[i])
				{
					timer++;
				}
			}
			if (timer != i - 1)
			{
				a[i] = 1;
			}
			timer = 0;
		}
		for (i = 1;i <= n;i++)
		{
			if (a[i] == 1)
			{
				timer++;
			}
			else
			{
				a[i - timer] = a[i];
			}
		}
		for (i = 1;i < n - timer;i++)
		{
			System.out.printf("%d ",a[i]);
		}
		System.out.printf("%d",a[n - timer]);
		return 0;
	}
}

