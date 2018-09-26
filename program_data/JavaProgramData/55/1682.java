public class stack
{
	public String data = new String(new char[101]);
	public int top;
}

package <missing>;

public class GlobalMembers
{
	public static int change(int a, tangible.RefObject<String> s)
	{
		int i;
		int b;
		int n;
		int c;

		for (n = 0, c = 1, i = s.argValue.length() - 1; i >= 0; i--)
		{
			if (s.argValue.charAt(i) >= 'A' && s.argValue.charAt(i) <= 'Z')
			{
				b = s.argValue.charAt(i) - 55;
			}
			else if (s.argValue.charAt(i) >= 'a' && s.argValue.charAt(i) <= 'z')
			{
				b = s.argValue.charAt(i) - 87;
			}
			else
			{
				b = s.argValue.charAt(i) - '0';
			}
			n += b * c;
			c *= a;
		}

		return n;
	}

	public static int Main()
	{
		int a;
		int b;
		int n;
		String str = new String(new char[101]);

		while (scanf("%ld %s %ld", a, str, b) != EOF)
		{
		tangible.RefObject<String> tempRef_str = new tangible.RefObject<String>(str);
			n = change(a, tempRef_str);
			str = tempRef_str.argValue;
			if (n == 0)
			{
				System.out.print("0");
			}
			else
			{
				int temp;
				stack s = new stack();
				s.top = 0;

				while (n != 0)
				{
					temp = n % b;
					if (temp >= 0 && temp <= 9)
					{
						s.data = tangible.StringFunctions.changeCharacter(s.data, s.top++, temp + '0');
					}
					else
					{
						s.data = tangible.StringFunctions.changeCharacter(s.data, s.top++, temp - 10 + 'A');
					}
					n /= b;
				}

				while (s.top != 0)
				{
					System.out.printf("%c", s.data.charAt(--s.top));
				}
			}
			System.out.print("\n");
		}

		return 0;
	}

}

