package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String a = new String(new char[251]);
		String b = new String(new char[251]);
		char t = '0';
		int[] c = new int[252];
		int[] d = new int[252];
		int l;
		int l1;
		int l2;
		int i;
		int x = 0;
		int l0 = 0;
		a = new Scanner(System.in).nextLine();
		b = new Scanner(System.in).nextLine();
		l1 = a.length();
		l2 = b.length();
		if (l1 > l2)
		{
			l = l1;
			for (i = l2;i < l;i++)
			{
				b = tangible.StringFunctions.changeCharacter(b, i, '0');
			}
			for (i = l2 - 1;i >= 0;i--)
			{
				t = b.charAt(i);
				b = tangible.StringFunctions.changeCharacter(b, i, b.charAt(l - l2 + i));
				b = tangible.StringFunctions.changeCharacter(b, l - l2 + i, t);
			}
		}
		else if (l1 < l2)
		{
			l = l2;
			for (i = l1;i < l;i++)
			{
				a = tangible.StringFunctions.changeCharacter(a, i, '0');
			}
			for (i = l1 - 1;i >= 0;i--)
			{
				t = a.charAt(i);
				a = tangible.StringFunctions.changeCharacter(a, i, a.charAt(l - l1 + i));
				a = tangible.StringFunctions.changeCharacter(a, l - l1 + i, t);
			}
		}
		else
		{
			l = l1;
		}
		if (l == 1)
		{
			x = a.charAt(0) + b.charAt(0) - 96;
			System.out.printf("%d",x);
		}
		else
		{
			for (i = l - 1;i > 0;i--)
			{
				c[i] = a.charAt(i) + b.charAt(i) - 96 + c[i];
				if (c[i] > 9)
				{
					c[i] = c[i] - 10;
					c[i - 1] = c[i - 1] + 1;
				}
			}
		c[0] = c[0] + a.charAt(0) + b.charAt(0) - 96;
		if (c[0] > 9)
		{
			c[0] = c[0] - 10;
			c[l] = 1;
		}
		if (c[l] != 0)
		{
			System.out.printf("%d",c[l]);
			for (i = 1;i <= l;i++)
			{
				System.out.printf("%d",c[i - 1]);
			}
		}
		else
		{
			l0 = l;
			for (i = 1;i <= l;i++)
			{
				if (c[i - 1] == 0)
				{
					l0--;
				}
				else
				{
					break;
				}
			}
			if (l0 < l)
			{
				for (i = l;i > l - l0;i--)
				{
					d[l - i] = c[i - 1];
				}
				for (i = l0;i >= 1;i--)
				{
					System.out.printf("%d",d[i - 1]);
				}
			}
			else
			{
				for (i = 1;i <= l;i++)
				{
					System.out.printf("%d",c[i - 1]);
				}
			}
		}
		}
		System.out.print("\n");
	}



}

