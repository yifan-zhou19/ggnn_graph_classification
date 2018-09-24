package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int i;
		int n;
		int j;
		int[] a = new int[301];
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
		System.out.printf("%d",a[1]);
		for (i = 2;i <= n;i++)
		{
			if (a[i] == a[1])
			{
				a[i] = -1;
			}
		}
		for (i = 2;i <= n;i++)
		{
			if (a[i] != -1)
			{
				System.out.printf(",%d",a[i]);
				for (j = i + 1;j <= n;j++)
				{
					if (a[j] == a[i])
					{
						a[j] = -1;
					}
				}
			}
		}
	}

}

