package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int m;
		int n;
		int carry = 0;
		String a = new String(new char[252]);
		String b = new String(new char[252]);
		String A = new String(new char[252]);
		String B = new String(new char[252]);
		String ADD = new String(new char[252]);
		String add = new String(new char[252]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = tempVar.charAt(0);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			b = tempVar2.charAt(0);
		}

		while (true)
		{
			if (a.charAt(0) != '0')
			{
				break;
			}
			else if (a.charAt(0) == '0' && a.length() > 1)
			{
				for (i = 0;i < a.length() - 1;i++)
				{
					a = tangible.StringFunctions.changeCharacter(a, i, a.charAt(i + 1));
				}
				a = a.substring(0, a.length() - 1);
			}
			else
			{
				break;
			}
		}
		while (true)
		{
			if (b.charAt(0) != '0')
			{
				break;
			}
			else if (b.charAt(0) == '0' && b.length() > 1)
			{
				for (i = 0;i < b.length() - 1;i++)
				{
					b = tangible.StringFunctions.changeCharacter(b, i, b.charAt(i + 1));
				}
				b = b.substring(0, b.length() - 1);
			}
			else
			{
				break;
			}
		}

		for (i = 0;i < a.length();i++)
		{
			A = tangible.StringFunctions.changeCharacter(A, a.length() - 1 - i, a.charAt(i));
			A = A.substring(0, a.length());
		}
		for (i = 0;i < b.length();i++)
		{
			B = tangible.StringFunctions.changeCharacter(B, b.length() - 1 - i, b.charAt(i));
			B = B.substring(0, b.length());
		}

		if (a.length() < b.length())
		{
			m = a.length();
			n = b.length();
		}
		else
		{
			m = b.length();
			n = a.length();
		}

		for (i = 0;i < n;i++)
		{
			if (i < m)
			{
				ADD = tangible.StringFunctions.changeCharacter(ADD, i, A.charAt(i) + B.charAt(i) - '0' + carry);
				if (ADD.charAt(i) >= '0' && ADD.charAt(i) <= '9')
				{
					carry = 0;
				}
				else
				{
					carry = (ADD.charAt(i) - '0') / 10;
					ADD = tangible.StringFunctions.changeCharacter(ADD, i, (ADD.charAt(i) - '0') % 10 + '0');
				}
			}
			else
			{
				if (A.length() > B.length())
				{
					ADD = tangible.StringFunctions.changeCharacter(ADD, i, A.charAt(i) + carry);
				}
				else
				{
					ADD = tangible.StringFunctions.changeCharacter(ADD, i, B.charAt(i) + carry);
				}
				if (ADD.charAt(i) >= '0' && ADD.charAt(i) <= '9')
				{
					carry = 0;
				}
				else
				{
					carry = (ADD.charAt(i) - '0') / 10;
					ADD = tangible.StringFunctions.changeCharacter(ADD, i, (ADD.charAt(i) - '0') % 10 + '0');
				}
			}
		}
		if (carry != 0)
		{
			ADD = tangible.StringFunctions.changeCharacter(ADD, n, carry + '0');
			ADD = ADD.substring(0, n + 1);
		}
		else
		{
			ADD = ADD.substring(0, n);
		}

		for (i = 0;i < ADD.length();i++)
		{
			add = tangible.StringFunctions.changeCharacter(add, ADD.length() - 1 - i, ADD.charAt(i));
			add = add.substring(0, ADD.length());
		}

		System.out.printf("%s\n",add);

		return 0;
	}

}

