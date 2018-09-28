package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[256]);
		String b = new String(new char[256]);
		String c = new String(new char[256]);
		int i;
		int j;
		int n;
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
		n = b.length();
		int m;
		m = a.length();
		int q;
		int k;
		for (i = 0;i < m;i++)
		{
			if (a.charAt(i) == b.charAt(0))
			{
				k = 1;
				for (j = i;j < i + n;j++)
				{
					if (b.charAt(j - i) != a.charAt(j))
					{
						k = 0;
					}
				}
				if (k != 0)
				{
					q = i;
				break;
				}
			}
			k = 0;
		}
		if (k != 0)
		{
		for (i = 0;i < q;i++)
		{
			System.out.printf("%c",a.charAt(i));
		}
		System.out.printf("%s",c);

			for (i = q + n;i < m;i++)
			{
			System.out.printf("%c",a.charAt(i));
			}
		}
		else
		{
			System.out.printf("%s",a);
		}
		return 0;
	}
}

