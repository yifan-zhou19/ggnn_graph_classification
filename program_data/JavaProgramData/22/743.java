package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[300];
		char c;
		int i;
		int j;
		int k;
		int l;
		int m;
		int n;
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
			if (c != ',')
			{
				k = i;
				break;
			}
		}
		if (k == 0)
		{
			System.out.print("No");
		}
		else
		{
		for (i = 1;i <= k;i++)
		{
			if (a[i] < a[0])
			{
				m = a[0];
				n = a[i];
				l = i;
				break;
			}
			else if (a[i] > a[0])
			{
				m = a[i];
				n = a[0];
				l = i;
				break;
			}
			else
			{
				continue;
			}
		}
		if (i == k + 1)
		{
			System.out.print("No");
			l = k + 1;
		}
		else
		{
		for (j = l + 1;j <= k;j++)
		{
			if (a[j] > m)
			{
				n = m;
				m = a[j];
			}
			else if (a[j] > n && a[j] < m)
			{
				n = a[j];
			}
			else
			{
				continue;
			}
		}
		System.out.printf("%d",n);
		}
		}
		return 0;
	}
}

