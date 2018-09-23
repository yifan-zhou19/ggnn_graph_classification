package <missing>;

public class GlobalMembers
{
	public static int equal(tangible.RefObject<String> x, tangible.RefObject<String> y) //????equal ???????????? ????1 ????0
	{
		for (int k = 0;x.argValue.charAt(k) != '\0' || y.argValue.charAt(k) != '\0';k++)
		{
			if (x.argValue.charAt(k) != y.argValue.charAt(k))
			{
				return 0;
			}
		}
		return 1;
	}

	public static int Main()
	{
		char[][] str = new char[100][100]; //??100????100???????? ?????????

		int number = 0; //number???????

		while (true) //????
		{
			str[number++] = ConsoleInput.readToWhiteSpace(true).charAt(0);
			if (System.in.read() == '\n') //??????????? ??????? ????
			{
				break;
			}
		}

		String str1 = new String(new char[100]); //???????? ??????????? ???????
		String str2 = new String(new char[100]);
		str1 = ConsoleInput.readToWhiteSpace(true).charAt(0);
		str2 = ConsoleInput.readToWhiteSpace(true).charAt(0);

		for (int k = 0;k != number - 1;k++) //?????
		{
		tangible.RefObject<String> tempRef_str1 = new tangible.RefObject<String>(str1);
			if (equal(str[k], tempRef_str1) != 0)
			{
				str1 = tempRef_str1.argValue;
				System.out.print(str2);
				System.out.print(" ");
				continue;
			}
			else
			{
				str1 = tempRef_str1.argValue;
			}
			System.out.print(str[k]);
			System.out.print(" ");
		}
	tangible.RefObject<String> tempRef_str12 = new tangible.RefObject<String>(str1);
		if (equal(str[number - 1], tempRef_str12) != 0)
		{
			str1 = tempRef_str12.argValue;
			System.out.print(str2);
			System.out.print("\n");
		}
		else
		{
			str1 = tempRef_str12.argValue;
			System.out.print(str[number - 1]);
			System.out.print("\n");
		}
		return 0;
	}

}

