package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int n;
		int k;
		int[] c = new int[100];
		int b;
		int j = 0;
		int s = 0;
		int[] a = new int[100];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0; i < n; i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				c[i] = Integer.parseInt(tempVar2);
			}
			if (!(c[i] % 2 == 0))
			{
				a[s] = c[i];
				s++;
			}

		}
		for (j = 0;j <= s;j++)
		{
			for (i = 0;i < s - j - 1;i++)
			{
				if (a[i] > a[i + 1])
				{
					b = a[i], a[i] = a[i + 1], a[i + 1] = b;
				}
			}
		}
		for (i = 0; i < s; i++)
		{
			if (i != s - 1)
			{
				System.out.printf("%d,", a[i]);
			}
			else
			{
				System.out.printf("%d", a[i]);
			}
		}
		return 0;
	}
}

