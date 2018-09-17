package <missing>;

public class GlobalMembers
{
	public static int f(char a,char b)
	{
		char c;
		char d;
		c = b + 'A'-'a';
		d = b - 'A'+'a';
		if ((a == b) || (a == c) || (a == d))
		{
		return 1;
		}
		else
		{
		return 0;
		}
	}
	public static int g(char a)
	{
		char b;
		int c;
		int d;
		c = a - 'A';
		d = 'a'-'A';
		if (c < d)
		{
		return a;
		}
		else
		{
			b = a + 'A'-'a';
			return b;
		}
	}
	public static int h(int a,int b)
	{
		int i;
		int c = 1;
		for (i = 1;i <= b;i++)
		{
			c = c * a;
		}
		return c;
	}
	public static int Main()
	{
		String a = new String(new char[1001]);
		String b = new String(new char[5001]);
		char c;
		char d;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = tempVar.charAt(0);
		}
		int i;
		int j;
		int k;
		int l;
		int m;
		int n;
		int p;
		int q;
		int count;
		i = j = n = 0;
		count = 1;
		while (a.charAt(i) != null)
		{
			n = n + 1;
			i = i + 1;
		}
		i = 0;
		for (i = 1;i <= n;i++)
		{
			c = g(a.charAt(i - 1));
			d = g(a.charAt(i));
			q = c - d;
			if (q == 0)
			{
			count = count + 1;
			}
			else
			{
				b = tangible.StringFunctions.changeCharacter(b, j, '(');
				j++;
				b = tangible.StringFunctions.changeCharacter(b, j, g(a.charAt(i - 1)));
				j++;
				b = tangible.StringFunctions.changeCharacter(b, j, ',');
				j++;
				p = 1;
				for (k = 1;k <= 1000;k++)
				{
					l = h(10, k);
					m = count / l;
					if (m != 0)
					{
					p = p + 1;
					}
					else
					{
					k = 1001;
					}
				}
				for (k = 1;k <= p;k++)
				{
					b = tangible.StringFunctions.changeCharacter(b, j, (count / h(10, p - k)) % 10 + '0');
					j++;
				}
				b = tangible.StringFunctions.changeCharacter(b, j, ')');
				j++;
				count = 1;
			}
		}
		b = tangible.StringFunctions.changeCharacter(b, j, '\0');
		System.out.printf("%s",b);
		return 0;
	}
}

