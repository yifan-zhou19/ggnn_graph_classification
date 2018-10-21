package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int[] a = new int[102];
		int i;
		int j;
		int t;
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
		for (i = 1;i <= n - 1;i++)
		{
			for (j = i + 1;j <= n;j++)
			{
				if (a[j] > a[i])
				{
					t = a[j];
					a[j] = a[i];
					a[i] = t;
				}
			}
		}
		System.out.printf("%d\n",a[1]);
		for (i = 2;a[i] < a[1];i++)
		{
			System.out.printf("%d",a[i]);
			break;
		}
	}

}

