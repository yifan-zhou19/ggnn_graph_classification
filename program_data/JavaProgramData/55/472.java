package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int a;
		int b;
		int i = 0;
		int c = 0;
		int d;
		int j = 0;
		int e;
		int f;
		int k;
		int x;
		String n = new String(new char[65]);
		char[] m = {0, '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0'};
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			n = tempVar2.charAt(0);
		}
		String tempVar3 = ConsoleInput.scanfRead(" ");
		if (tempVar3 != null)
		{
			b = Integer.parseInt(tempVar3);
		}
		d = n.length();
		while (n.charAt(i) != '\0')
		{
			if (n.charAt(i) >= 'a' && n.charAt(i) <= 'z')
			{
				 n = tangible.StringFunctions.changeCharacter(n, i, n.charAt(i) - 'a' + 10);
			}
			else if (n.charAt(i) >= 'A' && n.charAt(i) <= 'Z')
			{
				 n = tangible.StringFunctions.changeCharacter(n, i, n.charAt(i) - 'A' + 10);
			}
			else
			{
				n = tangible.StringFunctions.changeCharacter(n, i, n.charAt(i) - '0' + 0);
			}
			i++;
		}
		i = 0;
		c = n.charAt(0);
		for (i = 0;i < d - 1;i++)
		{
		c = c * a + n.charAt(i + 1);
		}
		while (c >= b)
		{
			m[j] = c % b;
			c = c / b;
			j++;
		}
		m[j] = c;
		for (k = 0;k <= j;k++)
		{
			if (m[k] > 9)
			{
				m[k] = m[k] - 10 + 'A';
			}
			else if (m[k] >= 0)
			{
				m[k] = m[k] - 0 + '0';
			}
		}
		e = m.length();
		f = e / 2;
		for (k = 0;k <= f - 1;k++)
		{
			x = m[e - k - 1];
			m[e - k - 1] = m[k];
			m[k] = x;
		}
		System.out.printf("%s",m);
	}


}

