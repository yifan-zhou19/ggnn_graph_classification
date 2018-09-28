package <missing>;

public class GlobalMembers
{
	public static void rev(tangible.RefObject<String> x)
	{
		int i;
		int tmp;
		int l;
		l = x.argValue.length();
		for (i = 0;i <= l / 2 - 1;i++)
		{
			tmp = x.argValue.charAt(i);
			x.argValue.charAt(i) = x.argValue.charAt(l - i - 1);
			x.argValue.charAt(l - i - 1) = tmp;
		}
	}
	public static int val(char a)
	{
		if (a > '0' && a <= '9')
		{
			return a - 48;
		}
		else
		{
			return 0;
		}
	}

	public static int Main()
	{
		String a = new String(new char[260]);
		String b = new String(new char[260]);
		String sum = new String(new char[260]);
		int i;
		int tmp = 0;
		int sign = 0;
		for (i = 0;i < 260;i++)
		{
			a = a.substring(0, i);
		}
		for (i = 0;i < 260;i++)
		{
			b = b.substring(0, i);
		}
		for (i = 0;i < 260;i++)
		{
			sum = sum.substring(0, i);
		}
		a = new Scanner(System.in).nextLine();
		b = new Scanner(System.in).nextLine();
	tangible.RefObject<String> tempRef_a = new tangible.RefObject<String>(a);
		rev(tempRef_a);
		a = tempRef_a.argValue;
	tangible.RefObject<String> tempRef_b = new tangible.RefObject<String>(b);
		rev(tempRef_b);
		b = tempRef_b.argValue;
		for (i = 0;i <= a.length() || i <= b.length();i++)
		{
			sum = tangible.StringFunctions.changeCharacter(sum, i, val(a.charAt(i)) + val(b.charAt(i)) + tmp + '0');
			if (sum.charAt(i) > '9')
			{
				sum = tangible.StringFunctions.changeCharacter(sum, i, sum.charAt(i) - 10);
				tmp = 1;
			}
			else
			{
				tmp = 0;
			}
		}
		for (i = sum.length() - 1;i >= 0;i--)
		{
			if (i == 0)
			{
				sign = 1;
			}
			if (sum.charAt(i) != '0' || sign == 1)
			{
				System.out.printf("%c",sum.charAt(i));
				sign = 1;
			}
		}
		return 0;
	}


}

