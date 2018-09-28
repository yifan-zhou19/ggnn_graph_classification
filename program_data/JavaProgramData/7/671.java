package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[256]);
		String b = new String(new char[256]);
		char[][] c = new char[100][50];
		String x = new String(new char[256]);
		String d = new String(new char[256]);
		int i;
		int n1;
		int n2;
		int k;
		int m;
		int n;
		int want = -1;
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
				d = tempVar3.charAt(0);
			}
		n1 = a.length();
		n2 = b.length();
		n = n1 - n2 + 1;
		for (k = 0;k < n;k++)
		{
			m = k;
			for (i = 0;i < n2;i++,m++)
			{
			x = tangible.StringFunctions.changeCharacter(x, i, a.charAt(m));
			}
			c[k] = x;
		}
		for (i = 0;i < n;i++)
		{
			if (strcmp(b,c[i]) == 0)
			{
				want = i;
				break;
			}
		}
		if (want == 0)
		{
			System.out.printf("%s",d);
			for (i = n2;i < n1;i++)
			{
				System.out.printf("%c",a.charAt(i));
			}
		}
	if (want == (n1 - n2))
	{
		for (i = 0;i < want;i++)
		{
			System.out.printf("%c",a.charAt(i));
		}
		System.out.printf("%s",d);
	}
	if (want > 0 && want < (n1 - n2))
	{
	for (i = 0;i < want;i++)
	{
		System.out.printf("%c",a.charAt(i));
	}
		System.out.printf("%s",d);
		for (i = want + n2;i < n1;i++)
		{
			System.out.printf("%c",a.charAt(i));
		}
	}
	if (want == -1)
	{
		System.out.printf("%s",a);
	}
		return 0;
	}

}

