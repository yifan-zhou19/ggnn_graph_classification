package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m;
		int i;
		int len;
		int mod;
		int ans;
		int[] a = new int[100];
		int[] b = {10, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		String str = new String(new char[MAX + 1]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			str = tempVar.charAt(0);
		}
		len = str.length();
		for (i = 0;i < len;i++)
		{
			a[i] = str.charAt(i) - '0';
		}
		if (len == 1)
		{
			System.out.print("0\n");
			System.out.printf("%s",str);
		}
		else
		{
		if (len == 2)
		{
			if (a[0] * 10 + a[1] < 13)
			{
			System.out.print("0\n");
			System.out.printf("%s",str);
			}
		else
		{
			m = a[0] * 10 + a[1];
			ans = m / 13;
			mod = m % 13;
		System.out.printf("%d\n",ans);
		System.out.printf("%d",mod);
		}
		}
		else
		{
		if ((a[0] * 10 + a[1]) >= 13)
		{
			for (i = 0;i < len - 1;i++)
			{
				m = a[i] * 10 + a[i + 1];
				ans = m / 13;
				mod = m % 13;
				if (ans == 0)
				{
				a[i + 1] = a[i] * 10 + a[i + 1];
				}
				else
				{
					b[i] = ans;
					a[i + 1] = mod;
				}
			}
		for (i = 0;i < len - 1;i++)
		{
		System.out.printf("%d",b[i]);
		}
		System.out.print("\n");
		System.out.printf("%d",mod);
		}
		else
		{
			for (i = 0;i < len - 1;i++)
			{
				m = a[i] * 10 + a[i + 1];
				ans = m / 13;
				mod = m % 13;
				if (ans == 0)
				{
				a[i + 1] = a[i] * 10 + a[i + 1];
				}
				else
				{
					b[i] = ans;
					a[i + 1] = mod;
				}
			}
			for (i = 1;i < len - 1;i++)
			{
			System.out.printf("%d",b[i]);
			}
			System.out.print("\n");
			System.out.printf("%d",mod);
		}
		}
		}
	}

}

