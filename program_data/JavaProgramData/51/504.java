package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int k;
		int l;
		int[] a = new int[600];
		String s = new String(new char[600]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		System.in.read();
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			s = tempVar2.charAt(0);
		}
		l = s.length();
		if (l < n)
		{
			System.out.print("NO\n");
			return 0;
		}
		for (i = 0; i < l; i++)
		{
			a[i] = 1;
		}
		for (i = 0; i < l - n + 1; i++)
		{
			for (j = i + 1; j < l - n + 1; j++)
			{
				int flag = 1;
				for (k = 0; k < n; k++)
				{
					if (s.charAt(i + k) != s.charAt(j + k))
					{
						flag = 0;
						break;
					}
				}
				if (flag == 1)
				{
					a[i]++;
				}
			}
		}
		int max = 0;
		for (i = 0; i < l; i++)
		{
			if (a[i] > max)
			{
				max = a[i];
			}
		}
		if (max == 1)
		{
			System.out.print("NO\n");
			return 0;
		}
		else
		{
			System.out.printf("%d\n", max);
		}
		for (i = 0; i < l; i++)
		{
			if (a[i] == max)
			{
				for (j = i; j < i + n; j++)
				{
					System.out.printf("%c", s.charAt(j));
				}
				System.out.print('\n');
			}
		}
		return 0;
	}
}

