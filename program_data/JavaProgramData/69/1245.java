package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int k;
		int lena;
		int lenb;
		int carry;
		int temp;
		String a = new String(new char[MAX_DIGITS + 1]);
		String b = new String(new char[MAX_DIGITS + 1]);
		String c = new String(new char[MAX_DIGITS + 2]);

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
		lena = a.length();
		lenb = b.length();
		carry = 0;
		k = 0;
		i = lena - 1;
		j = lenb - 1;
		while (i >= 0 && j >= 0)
		{
			  temp = a.charAt(i) - '0' + b.charAt(j) - '0' + carry;
			  c = tangible.StringFunctions.changeCharacter(c, k, temp % 10 + '0');
			  carry = temp / 10;
			  i--, j--, k++;
		}

		if (i >= 0)
		{
			  while (i >= 0)
			  {
					temp = a.charAt(i) - '0' + carry;
					c = tangible.StringFunctions.changeCharacter(c, k, temp % 10 + '0');
					carry = temp / 10;
					i--, k++;
			  }
		}
		else if (j >= 0)
		{
			 while (j >= 0)
			 {
				   temp = b.charAt(j) - '0' + carry;
				   c = tangible.StringFunctions.changeCharacter(c, k, temp % 10 + '0');
				   carry = temp / 10;
				   j--, k++;
			 }
		}

		if (carry != 0)
		{
		   c = tangible.StringFunctions.changeCharacter(c, k, '1');
		}
		else
		{
			k--;
		}

		while (c.charAt(k) == '0')
		{
			  k--;
		}
		if (k < 0)
		{
		   System.out.print("0");
		}
		else
		{
			 while (k >= 0)
			 {
				   System.out.printf("%c", c.charAt(k));
				   k--;
			 }
		}

		return 0;
	}

}

