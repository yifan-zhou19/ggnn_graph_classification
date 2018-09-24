package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[250 + 1]);
		String b = new String(new char[250 + 1]);
		final String c = "";
		int i;
		int n1 = 0; //n1,n2???????0??
		int n2 = 0;
		a = ConsoleInput.readToWhiteSpace(true).charAt(0);
		b = ConsoleInput.readToWhiteSpace(true).charAt(0);

		int l1 = a.length() / (Character.SIZE / Byte.SIZE);
		int l2 = b.length() / (Character.SIZE / Byte.SIZE);
		c = tangible.StringFunctions.changeCharacter(c, l1, '0');
		c = tangible.StringFunctions.changeCharacter(c, l2, '0'); //???????????0 ????????1

		for (i = 0;i < l1 - 1;i++)
		{
			if (a.charAt(i) != 48)
			{
				break;
			}
			a = tangible.StringFunctions.changeCharacter(a, i, '\0');
			n1++;
		}
		for (i = 0;i < l2 - 1;i++)
		{
			if (b.charAt(i) != 48)
			{
				break;
			}
			b = tangible.StringFunctions.changeCharacter(b, i, '\0');
			n2++;
		}

		for (i = 0;i < l1 / 2;i++)
		{
			int temp;
			temp = a.charAt(i);
			a = tangible.StringFunctions.changeCharacter(a, i, a.charAt(l1 - 1 - i));
			a = tangible.StringFunctions.changeCharacter(a, l1 - 1 - i, temp);
		}
		for (i = 0;i < l2 / 2;i++)
		{
			int temp;
			temp = b.charAt(i);
			b = tangible.StringFunctions.changeCharacter(b, i, b.charAt(l2 - 1 - i));
			b = tangible.StringFunctions.changeCharacter(b, l2 - 1 - i, temp);
		}
		l1 = l1 - n1;
		l2 = l2 - n2; //?????????????0????
	//////////////////////////?????? ????
		int max = l1;
		if (l1 > l2)
		{
			max = l1;
			for (i = l2;i < l1;i++)
			{
			b = tangible.StringFunctions.changeCharacter(b, i, '0');
			}
		}
		if (l1 < l2)
		{
			max = l2;
			for (i = l1;i < l2;i++)
			{
			a = tangible.StringFunctions.changeCharacter(a, i, '0');
			}
		}
	//////////////////////////???????0 ?2?????? ????
		for (i = 0;i <= max;i++)
		{
		c = tangible.StringFunctions.changeCharacter(c, i, '0');
		}
		for (i = 0;i < max;i++)
		{
			if (a.charAt(i) - 48 + b.charAt(i) - 48 + c.charAt(i) - 48 < 10) //???
			{
			c = tangible.StringFunctions.changeCharacter(c, i, a.charAt(i) - 48 + b.charAt(i) - 48 + c.charAt(i) - 48 + 48);
			}
			else //???
			{
				c = tangible.StringFunctions.changeCharacter(c, i, a.charAt(i) - 48 + b.charAt(i) - 48 + c.charAt(i) - 48 - 10 + 48);
				c = tangible.StringFunctions.changeCharacter(c, i + 1, '1');
			}
		}
	//////////////////////////??
		if (c.charAt(max) == '1') //???????1 ????????1 ???
		{
			System.out.print(1);
			for (i = max - 1;i >= 0;i--)
			{
			System.out.print(c.charAt(i));
			}
		}
		else //????????1 ?????
		{
			for (i = max - 1;i >= 0;i--)
			{
			System.out.print(c.charAt(i));
			}
		}
		System.out.print("\n");
	//////////////////////////??

		return 0;
	}

}

