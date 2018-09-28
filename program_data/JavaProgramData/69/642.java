package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int l1;
		int l2;
		int n;
		int[] a = new int[255];
		int[] b = new int[255];
		int k = 0;
		int f = 0;
		int i;
		int j;
		int x = 0;
		int y = 0;
		String s1 = new String(new char[255]);
		String s2 = new String(new char[255]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			s1 = tempVar.charAt(0);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			s2 = tempVar2.charAt(0);
		}
		l1 = s1.length();
		l2 = s2.length();
		for (i = 0;i < l1;i++)
		{
			if (s1.charAt(i) != '0')
			{
				y = 1;
			}
		}
		for (i = 0;i < l2;i++)
		{
			if (s2.charAt(i) != '0')
			{
				y = 1;
			}
		}
		if (y == 0)
		{
			System.out.printf("%d",0);
			return 0;
		}
		else
		{
		if (l1 > l2)
		{
			for (i = 1;i <= l1;i++)
			{
				if (l2 - i >= 0)
				{
					b[l1 - i] = (s1.charAt(l1 - i) - 48 + s2.charAt(l2 - i) - 48 + a[l1 - i]) % 10;
					a[l1 - i - 1] = (s1.charAt(l1 - i) - 48 + s2.charAt(l2 - i) - 48 + a[l1 - i]) / 10;
				}
				else
				{
					b[l1 - i] = (s1.charAt(l1 - i) - 48 + a[l1 - i]) % 10;
					a[l1 - i - 1] = (s1.charAt(l1 - i) - 48 + a[l1 - i]) / 10;
				}
			}
			if (a[0] != 0)
			{
				System.out.printf("%d",a[0]);
				x = 1;
			}
			for (i = 0;i < l1;i++)
			{
				if (b[i] != 0 || x == 1)
				{
					System.out.printf("%d",b[i]);
					x = 1;
				}
			}
			x = 0;
		}
		else if (l1 == l2)
		{
			for (i = 1;i <= l1;i++)
			{
				if (l2 - i >= 0)
				{
					b[l1 - i] = (s1.charAt(l1 - i) - 48 + s2.charAt(l2 - i) - 48 + a[l1 - i]) % 10;
					a[l1 - i - 1] = (s1.charAt(l1 - i) - 48 + s2.charAt(l2 - i) - 48 + a[l1 - i]) / 10;
				}
				else
				{
					b[l1 - i] = (s1.charAt(l1 - i) - 48 + a[l1 - i]) % 10;
					a[l1 - i - 1] = (s1.charAt(l1 - i) - 48 + a[l1 - i]) / 10;
				}
			}
			if (a[0] != 0)
			{
				System.out.printf("%d",a[0]);
				x = 1;
			}
			for (i = 0;i < l1;i++)
			{
				if (b[i] != 0 || x == 1)
				{
				System.out.printf("%d",b[i]);
				x = 1;
				}
			}
			x = 0;
		}
		else
		{
			for (i = 1;i <= l2;i++)
			{
				if (l1 - i >= 0)
				{
					b[l2 - i] = (s1.charAt(l1 - i) - 48 + s2.charAt(l2 - i) - 48 + a[l2 - i]) % 10;
					a[l2 - i - 1] = (s1.charAt(l1 - i) - 48 + s2.charAt(l2 - i) - 48 + a[l2 - i]) / 10;
				}
				else
				{
					b[l2 - i] = (s2.charAt(l2 - i) - 48 + a[l2 - i]) % 10;
					a[l2 - i - 1] = (s2.charAt(l2 - i) - 48 + a[l2 - i]) / 10;
				}
			}
			if (a[0] != 0)
			{
				System.out.printf("%d",a[0]);
				x = 1;
			}
			for (i = 0;i < l2;i++)
			{
				if (b[i] != 0 || x == 1)
				{
				System.out.printf("%d",b[i]);
				x = 1;
				}
			}
			x = 0;
		}
		}
		return 0;
	}
}

