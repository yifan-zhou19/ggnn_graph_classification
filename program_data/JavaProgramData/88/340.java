package <missing>;

public class GlobalMembers
{
	public static int number(char a)
	{
		int m;
		if (a >= '0' && a <= '9')
		{
		m = 1;
		}
		else
		{
		m = 0;
		}
		return m;
	}
	public static int Main()
	{
		String c = new String(new char[30]);
		int i;
		int len;
		int n;
		c = new Scanner(System.in).nextLine();
		len = c.length();
		n = 0;
		while (number(c.charAt(n)) == 0)
		{
		n++;
		}
		if (n == len - 1)
		{
			System.out.printf("%c",c.charAt(len - 1));
		}
		if (n == len - 2 && number(c.charAt(len - 1)) == 1)
		{
			System.out.printf("%c%c",c.charAt(len - 2),c.charAt(len - 1));
		}
		if (n == len - 2 && number(c.charAt(len - 1)) == 0)
		{
			System.out.printf("%c",c.charAt(len - 2));
		}
		if (n < len - 2)
		{
		System.out.printf("%c",c.charAt(n));
		for (i = n + 1;i < len;i++)
		{
		if (number(c.charAt(i - 1)) == 1 && number(c.charAt(i)) == 1)
		{
			System.out.printf("%c",c.charAt(i));
		}
		if (number(c.charAt(i - 1)) == 0 && number(c.charAt(i)) == 1)
		{
			System.out.printf("\n%c",c.charAt(i));
		}
		}
		}
		return 0;
	}
}
