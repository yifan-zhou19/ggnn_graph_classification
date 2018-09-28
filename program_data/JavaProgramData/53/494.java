package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int[] a = new int[300];
		int[] b = new int[300];
		int x;
		int i;
		int j;
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
				x = Integer.parseInt(tempVar2);
			}
			a[i] = x;
		}
		for (i = 2;i <= n;i++)
		{
			for (j = 1;j <= i - 1;j++)
			{
				if (a[i] == a[j])
				{
					a[i] = 0;
				}
			}
		}
		System.out.printf("%d",a[1]);
		for (i = 2;i <= n;i++)
		{
			if (a[i] != 0)
			{
				System.out.printf(",%d",a[i]);
			}
		}
	}
}

