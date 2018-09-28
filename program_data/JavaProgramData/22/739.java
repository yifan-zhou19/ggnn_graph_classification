package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[300];
		int m;
		int n = 0;
		int i;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a[0] = Integer.parseInt(tempVar);
		}
		m = a[0];
		for (i = 1;i <= 299;i++)
		{
			if (scanf(",%d", a[i]) == null)
			{
				break;
			}
			if (a[i] > m)
			{
				n = m;
				m = a[i];
			}
			else if (a[i] < m && n < a[i])
			{
				n = a[i];
			}
		}
		if (n == 0)
		{
			System.out.print("No\n");
		}
		else
		{
			System.out.printf("%d\n",n);
		}
			return 0;
	}

}

