package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[301];
		int i;
		int j;
		int n;
		int k = 0;
		int m;
		int temp;
		char c;
		for (i = 0;i < 300;i++)
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
				break;
			}
		}
		n = i + 1;
		for (i = 1;i < n;i++)
		{
			if (a[i - 1] != a[i])
			{
				k = 1;
			}
		}
		if (n == 1 || k == 0)
		{
			System.out.print("No\n");
		}
		else
		{
			for (i = 0;i < n - 1;i++)
			{
				m = i;
				for (j = i + 1;j < n;j++)
				{
					if (a[j] > a[m])
					{
						m = j;
					}
				}
				if (m != i)
				{
					temp = a[i];
					a[i] = a[m];
					a[m] = temp;
				}
			}
			for (i = 1;i < n;i++)
			{
				if (a[i] != a[i - 1])
				{
					System.out.printf("%d\n", a[i]);
					break;
				}
			}
		}
		return 0;
	}
}

