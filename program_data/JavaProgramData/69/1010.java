package <missing>;

public class GlobalMembers
{
	public static int strplus(tangible.RefObject<String> strin1, tangible.RefObject<String> strin2, tangible.RefObject<String> strout)

	{

		int strlen1;
		int strlen2;
		int strlen3;

		int i;
		int j;
		int k;

		int temp;
		int carry = 0;



		i = strlen1 = strin1.argValue.length();

		j = strlen2 = strin2.argValue.length();

		k = strlen3 = (strlen1 > strlen2 != 0?strlen1:strlen2);

		strout.argValue = strout.argValue.substring(0, strlen3);

		while (true)

		{

			if (i == 0 && j == 0)
			{
				break;
			}

			if (i != 0)
			{
				i--;
			}

			if (j != 0)
			{
				j--;
			}

			k--;

			temp = strin1.argValue.charAt(i) - '0' + strin2.argValue.charAt(j) - '0' + carry;

			carry = temp / 10;

			strout.argValue.charAt(k) = temp % 10 + '0';



		}
	return 0;
	}



	public static int Main()

	{

		String a = new String(new char[251]);
		String b = new String(new char[251]);
		String c = new String(new char[252]);

		int i;

		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			(a.charAt(1)) = tempVar;
		}

		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			(b.charAt(1)) = tempVar2;
		}
		if (a.charAt(1) == '0' && b.charAt(1) == '0' && a.charAt(2) == 0 && b.charAt(2) == 0)
		{
			System.out.print("0");
			return 0;
		}

		a = tangible.StringFunctions.changeCharacter(a, 0, b[0] = c[0] = '0');

	tangible.RefObject<String> tempRef_a = new tangible.RefObject<String>(a);
	tangible.RefObject<String> tempRef_b = new tangible.RefObject<String>(b);
	tangible.RefObject<String> tempRef_c = new tangible.RefObject<String>(c);
		strplus(tempRef_a, tempRef_b, tempRef_c);
		c = tempRef_c.argValue;
		b = tempRef_b.argValue;
		a = tempRef_a.argValue;

		for (i = 0;c.charAt(i) == '0';i++)
		{
			;
		}

		System.out.printf("%s",c.Substring(i));

		return 0;

	}

}

