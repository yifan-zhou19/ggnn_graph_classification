package <missing>;

public class GlobalMembers
{
	public static int max(int[] a, int n)
	{
		int i;
		int t;
		int max = 0;
		for (i = 0;i <= n - 1;i++)
		{
			if (a[i] > max)
			{
				t = i;
				max = a[i];
			}
		}
		return (t);
	}
	public static void Main()
	{
		int[] a = new int[300];
		int i;
		int n;
		int m;
		int t;
		int k;
		char c;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a[0] = Integer.parseInt(tempVar);
		}
		for (i = 1;;i++)
		{
			if ((c = System.in.read()) != ',')
			{
				break;
			}
			else
			{
				String tempVar2 = ConsoleInput.scanfRead();
				if (tempVar2 != null)
				{
					a[i] = Integer.parseInt(tempVar2);
				}
			}
		}
		n = i;
		if (n == 1)
		{
			System.out.print("No");
		}
		else
		{
			t = max(a, n);
			m = a[t];
			a[t] = 0;
			for (k = 1;k <= n - 1;k++)
			{
				if (a[max(a, n)] == m)
				{
					if (k == n - 1)
					{
						System.out.print("No");
					}
					a[max(a, n)] = 0;
				}
				else
				{
					System.out.printf("%d",a[max(a, n)]);
					break;
				}
			}
		}
	}
}

