package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[1000];
		int n;
		char c;
		int i;
		int j;
		int t;
		int k;
		k = 0;
		n = 0;
		while (true)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				a[n++] = Integer.parseInt(tempVar);
			}
			String tempVar2 = ConsoleInput.scanfRead(null, 1);
			if (tempVar2 != null)
			{
				c = tempVar2.charAt(0);
			}
			if (c == '\n')
			{
				break;
			}
		}
		if (n == 1)
		{
			System.out.print("No");
		}
		else
		{
			{
				for (j = 0;j < n - 1;j++)
				{
				for (i = 0;i < n - 1 - j;i++)
				{
					if (a[i] > a[i + 1])
					{
						t = a[i];
						a[i] = a[i + 1];
						a[i + 1] = t;
					}
				}
				}
		}

	for (i = n - 2;i >= 0;i--)
	{
		if (a[i] < a[n - 1])
		{
		System.out.printf("%d",a[i]);
	break;
		}
	}
	for (i = n - 2;i >= 0;i--)
	{
		if (a[i] == a[n - 1])
		{
	k = k + 1;
		}
	}
	if (k == n - 1)
	{
	System.out.print("No");
	}
		}
		return 0;
	}
}

