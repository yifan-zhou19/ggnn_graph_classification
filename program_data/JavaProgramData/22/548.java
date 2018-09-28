package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[300];
		int i;
		int j;
		int k;
		int n;
		char c;
		for (i = 0;;i++)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				a[i] = Integer.parseInt(tempVar);
			}
			String tempVar2 = ConsoleInput.scanfRead(null, 1);
			if (tempVar2 != null)
			{
				c = tempVar2.charAt(0);
			}
			if (c == '\n')
			{
				n = i + 1;
				break;
			}
		}
		if (n == 1)
		{
			System.out.print("No");
		}
		else
		{
		for (i = 0;i < n - 1;i++)
		{
			for (j = 0;j < n - 1 - i;j++)
			{
				if (a[j] > a[j + 1])
				{
					k = a[j + 1];
					a[j + 1] = a[j];
					a[j] = k;
				}
			}
		}
		for (i = n - 2;i >= 0;i--)
		{
			if (a[i] != a[n - 1])
			{
				System.out.printf("%d",a[i]);
				break;
			}
			else
			{
				if (i != 0)
				{
					continue;
				}
				else
				{
					System.out.print("No");
				}
			}
		}
		}
		return 0;
	}
}

