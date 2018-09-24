package <missing>;

public class GlobalMembers
{
	public static char big(char x)
	{
		if (x >= 'a' && x <= 'z')
		{
			return (x - 'a'+'A');
		}
		else
		{
			return x;
		}
	}
	public static int Main()
	{
		String a = new String(new char[1003]);
		char t;
		int sum = 0;
		int i;
		int len;
		a = ConsoleInput.readToWhiteSpace(true).charAt(0);
		len = a.length();
		sum = 1;
		t = big(a.charAt(0));
		for (i = 1;i < len;i++)
		{
			if (big(a.charAt(i)) == t)
			{
				sum++;
			}
			if (big(a.charAt(i)) != t)
			{
				System.out.print("(");
				System.out.print(t);
				System.out.print(",");
				System.out.print(sum);
				System.out.print(")");
				sum = 1;
				t = big(a.charAt(i));
			}
		}
		System.out.print("(");
		System.out.print(t);
		System.out.print(",");
		System.out.print(sum);
		System.out.print(")");
		return 0;
	}
}

