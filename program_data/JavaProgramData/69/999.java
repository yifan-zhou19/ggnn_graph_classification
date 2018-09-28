package <missing>;

public class GlobalMembers
{
	public static void dele0(tangible.RefObject<String> a)
	{
		int i;
		int j;
		for (i = 0; * (a.argValue.Substring(i)) == '0';i++)
		{
			;
		}
		for (j = 0; * (a.argValue.Substring(j) + i) != 0;j++)
		{
			*(a.argValue.Substring(j)) = *(a.argValue.Substring(i) + j);
		}
		*(a.argValue.Substring(j)) = 0;
	}

	public static void Main()
	{
		int i;
		int a1;
		int b1;
		int add = 0;
		String a = new String(new char[300]);
		String b = new String(new char[300]);
		String c = new String(new char[300]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = tempVar.charAt(0);
		}
	tangible.RefObject<String> tempRef_a = new tangible.RefObject<String>(a);
		dele0(tempRef_a);
		a = tempRef_a.argValue;
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			b = tempVar2.charAt(0);
		}
	tangible.RefObject<String> tempRef_b = new tangible.RefObject<String>(b);
		dele0(tempRef_b);
		b = tempRef_b.argValue;
		a1 = a.length();
		b1 = b.length();
		for (i = 0;i < a1 && i < b1;i++)
		{
			if (a.charAt(a1 - i - 1) + b.charAt(b1 - i - 1) - '0'-'0' + add > 9)
			{
				c = tangible.StringFunctions.changeCharacter(c, i, a.charAt(a1 - i - 1) + b.charAt(b1 - i - 1) - '0' - 10 + add);
				add = 1;
			}
			else
			{
				c = tangible.StringFunctions.changeCharacter(c, i, a.charAt(a1 - i - 1) + b.charAt(b1 - i - 1) - '0' + add);
				add = 0;
			}
		}

		if (i == a1)
		{
			for (;i < b1;i++)
			{
				if (b.charAt(b1 - i - 1) - '0' + add > 9)
				{
					c = tangible.StringFunctions.changeCharacter(c, i, b.charAt(b1 - i - 1) - 10 + add);
					add = 1;
				}
				else
				{
					c = tangible.StringFunctions.changeCharacter(c, i, b.charAt(b1 - i - 1) + add);
					add = 0;
				}
			}
		}
		else
		{
			for (;i < a1;i++)
			{
				if (a.charAt(a1 - i - 1) - '0' + add > 9)
				{
					c = tangible.StringFunctions.changeCharacter(c, i, a.charAt(a1 - i - 1) - 10 + add);
					add = 1;
				}
				else
				{
					c = tangible.StringFunctions.changeCharacter(c, i, a.charAt(a1 - i - 1) + add);
					add = 0;
				}
			}
		}
		if (add == 1)
		{
			System.out.print("1");
		}
		if (i == 0)
		{
			System.out.print("0");
		}
		else
		{
			for (;i > 0;i--)
			{
				System.out.printf("%c",c.charAt(i - 1));
			}
		}

	}
}

