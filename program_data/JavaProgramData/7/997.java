package <missing>;

public class GlobalMembers
{
	public static void right(String a, int l, int t)
	{
		int i;
		for (i = l;i >= t;i--)
		{
		a[i] = a[i - 1];
		}
		a[l + 1] = '\0';
	}
	public static void left(String a, int l, int t)
	{
		int i;
		for (i = t;i <= l;i++)
		{
		a[i - 2] = a[i - 1];
		}
		a[l - 1] = '\0';
	}
	public static int Main()
	{
		String a = new String(new char[256]);
		String b = new String(new char[256]);
		String c = new String(new char[256]);
		int i;
		int j;
		int l1;
		int l2;
		int l3;
		int d;
		int e;
		int s;
		int r;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = tempVar.charAt(0);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			b = tempVar2.charAt(0);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			c = tempVar3.charAt(0);
		}
		l1 = a.length();
		l2 = b.length();
		l3 = c.length();
		if (l2 > l3)
		{
			s = 1;
			r = l2 - l3;
		}
		else if (l2 == l3)
		{
		s = r = 0;
		}
		else
		{
			s = -1;
			r = l3 - l2;
		}
		for (i = 1;i <= l1;i++)
		{
			e = a.charAt(i - 1) - b.charAt(0);
			if (e == 0)
			{
				d = 0;
				for (j = 1;j <= l2 - 1;j++)
				{
					e = a.charAt(i + j - 1) - b.charAt(j);
					if (e != 0)
					{
					d = 1;
					}
				}
				if (d == 0)
				{
					for (j = 1;j <= r;j++)
					{
						if (s > 0)
						{
						left(a, l1, i + l2);
						}
						if (s < 0)
						{
						right(a, l1, i);
						}
					}
					for (j = 1;j <= l3;j++)
					{
					a = tangible.StringFunctions.changeCharacter(a, i + j - 2, c.charAt(j - 1));
					}
					break;
				}
			}
		}
		System.out.printf("%s",a);
		return 0;
	}
}

