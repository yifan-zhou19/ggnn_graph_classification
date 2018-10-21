package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[50000];
		int[] b = new int[50000];
		int[] s = new int[50000];
		int[] u = new int[50000];
		int[] v = new int[50000];
		int n;
		int i;
		int j;
		int x;
		int y;
		int m = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[i] = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				b[i] = Integer.parseInt(tempVar3);
			}
			u[a[i]] = 1;
			v[b[i]] = 1;
			for (j = a[i] + 1;j < b[i];j++)
			{
				s[j] = 1;
			}
		}
		for (i = 0;i < 50000;i++)
		{
			if (u[i] == 1 && v[i] == 1)
			{
				s[i] = 1;
			}
		}
		for (i = 0;i < n - 1;i++)
		{
			if (a[i] < a[i + 1])
			{
				j = a[i];
				a[i] = a[i + 1];
				a[i + 1] = j;
			}
		}
		s[a[n - 1]] = 1;
		for (i = 0;i < n - 1;i++)
		{
			if (b[i] > b[i + 1])
			{
				j = b[i];
				b[i] = b[i + 1];
				b[i + 1] = j;
			}
		}
		s[b[n - 1]] = 1;
		for (i = 0;i < 10001;i++)
		{
			if (s[i] == 1 && m == 0)
			{
				x = i;
				m = 1;
			}
			if (m == 1)
			{
				if (s[i] == 0)
				{
					y = i - 1;
					m = 2;
				}
			}
			if (m == 2)
			{
				if (s[i] == 1)
				{
					m = 3;
				}
			}
		}
		if (m == 2)
		{
			System.out.printf("%d %d",x,y);
		}
		else
		{
			System.out.print("no");
		}
		return 0;
	}
}

