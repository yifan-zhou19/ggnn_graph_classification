package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int a;
		int b;
		int l;
		int i;
		int j;
		int m;
		int k;
		String c = new String(new char[100]);
		int[] d = new int[100];
		String e = new String(new char[100]);
		int[] f = new int[100];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			c = tempVar2.charAt(0);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			b = Integer.parseInt(tempVar3);
		}
		l = c.length();
		for (i = 0;i < l;i++)
		{
			if (c.charAt(i) >= 'A' && c.charAt(i) <= 'Z')
			{
				f[i] = 10 + c.charAt(i) - 'A';
			}
			if (c.charAt(i) >= 'a' && c.charAt(i) <= 'z')
			{
				f[i] = 10 + c.charAt(i) - 'a';
			}
			if (c.charAt(i) >= '0' && c.charAt(i) <= '9')
			{
				f[i] = c.charAt(i) - '0';
			}
		}
		m = 0;
		for (i = 0;i < l;i++)
		{
			k = 1;
			j = 1;
			while (j < (l - i))
			{
				k = k * a;
				j++;
			}
			m = m + f[i] * k;
		}
		i = 0;
		while (m > 0)
		{
			if (m >= b)
			{
				d[i] = m % b;
				m = m / b;
				i++;
			}
			else
			{
				d[i] = m;
				m = 0;
			}
		}
		l = i + 1;
		for (i = 0;i < l;i++)
		{
			if (d[i] < 10)
			{
				e = tangible.StringFunctions.changeCharacter(e, l - 1 - i, d[i] + '0');
			}
			else
			{
				e = tangible.StringFunctions.changeCharacter(e, l - 1 - i, d[i] - 10 + 'A');
			}
		}
		for (i = 0;i < l;i++)
		{
			System.out.printf("%c",e.charAt(i));
		}
	}







}

