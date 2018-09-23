package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int m;
		int flag;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int[] a = new int[200000];
		for (i = 1;i <= n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[i] = Integer.parseInt(tempVar2);
			}
		}
		if (n == 1)
		{
			System.out.printf("%d",a[1]);
		}
		else
		{
		System.out.printf("%d",a[1]);
		for (i = 2;i <= n;i++)
		{
			for (m = 1;m < i;m++)
			{
				if (a[i] == a[m])
				{
					flag = 1;
					break;
				}
				else
				{
					flag = -1;
				}
			}
			if (flag == -1)
			{
				System.out.printf(" %d",a[i]);
			}
		}

		}
		return 0;
	}
}

