package <missing>;

public class GlobalMembers
{
	public static int f(char c)
	{
		int w;
		if (c >= '0' && c <= '9')
		{
			w = c - '0';
			return w;
		}
		if (c >= 'a' && c <= 'z')
		{
			w = c - 'a' + 10;
			return w;
		}
		if (c >= 'A' && c <= 'Z')
		{
			w = c - 'A' + 10;
			return w;
		}
	}

	public static char g(int a)
	{
		char c;
		if (a >= 0 && a < 9)
		{
			c = a + '0';
			return c;
		}
		if (a >= 10)
		{
			c = a - 10 + 'A';
			return c;
		}

	}

	public static int Main()
	{
		int a;
		int b;
		int i;
		int j;
		int l;
		int x;
		int sum = 0;
		int y;
		String n = new String(new char[10]);
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
		if (a == b)
		{
			System.out.printf("%s\n",n);
		}
		else
		{
		l = n.length();
		for (i = 0;i < l;i++)
		{
			x = f(n.charAt(i));
			y = (int)Math.pow(a,l - i - 1);
			sum = sum + x * y;
		}
		if (sum == 0)
		{
			System.out.print("0");
		}
		else
		{
		String m = new String(new char[50]);
		int z;
		l = (int)(Math.log(sum) / Math.log(b));
		for (i = 0;i <= l;i++)
		{
			if (i == l)
			{
				z = sum;
				m = tangible.StringFunctions.changeCharacter(m, i, g(z));
			}
			else
			{
				for (j = 1;j <= b;j++)
				{
					z = j * Math.pow(b,l - i);
					if (z > sum)
					{
						z = (j - 1) * Math.pow(b,l - i);
						sum = sum - z;
						m = tangible.StringFunctions.changeCharacter(m, i, g(j - 1));
						break;
					}
				}
			}
		}

		for (i = 0;i <= l;i++)
		{
			System.out.printf("%c",m.charAt(i));
		}
		System.out.print("\n");
		}
		}

		return 0;



	}

}

