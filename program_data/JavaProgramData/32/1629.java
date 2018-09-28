package <missing>;

public class GlobalMembers
{
	public static void stringrev(tangible.RefObject<String> a, tangible.RefObject<String> b)
	{
		int i;
		int j;
		int k;
		int l;
		int n;
		l = a.argValue.length();
		for (i = 0;i < l;i++)
		{
			b.argValue.charAt(i) = a.argValue.charAt(l - 1 - i);
		}
		b.argValue = b.argValue.substring(0, i);
	}
	public static void jianfa(tangible.RefObject<String> a, tangible.RefObject<String> b, tangible.RefObject<String> c)
	{
		int i;
		int j;
		int k;
		int l = a.argValue.length();
		int t = 0;
		char[] d = {0, '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0'};
		char[] e = {0, '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0'};
	tangible.RefObject<String> tempRef_d = new tangible.RefObject<String>(d);
		stringrev(a, tempRef_d);
		d = tempRef_d.argValue;
	tangible.RefObject<String> tempRef_e = new tangible.RefObject<String>(e);
		stringrev(b, tempRef_e);
		e = tempRef_e.argValue;
		for (i = 0;i < l;i++)
		{
			if (e[i] != 0)
			{
			d[i] = d[i] - e[i] - t;
			}
			else
			{
			d[i] = d[i] - '0' - t;
			}
			if (d[i] < 0)
			{
				d[i] = d[i] + 10 + '0';
				t = 1;
			}
			else
			{
				d[i] = d[i] + '0';
				t = 0;
			}
		}
		for (j = l - 1;j >= 0;j--)
		{
			if (d[j] == '0')
			{
				d[j] = 0;
			}
			else
			{
				break;
			}
		}
	tangible.RefObject<String> tempRef_d2 = new tangible.RefObject<String>(d);
		stringrev(tempRef_d2, c);
		d = tempRef_d2.argValue;
	}

	public static void Main()
	{
		int n;
		int i;
		int j;
		int k;
		String a = new String(new char[101]);
		String b = new String(new char[101]);
		char[] c = {0, '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0'};
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		while (n-- != 0)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a = tempVar2.charAt(0);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				b = tempVar3.charAt(0);
			}
		tangible.RefObject<String> tempRef_a = new tangible.RefObject<String>(a);
		tangible.RefObject<String> tempRef_b = new tangible.RefObject<String>(b);
		tangible.RefObject<String> tempRef_c = new tangible.RefObject<String>(c);
			jianfa(tempRef_a, tempRef_b, tempRef_c);
			c = tempRef_c.argValue;
			b = tempRef_b.argValue;
			a = tempRef_a.argValue;
			System.out.printf("%s\n",c);
		}
	}
}

