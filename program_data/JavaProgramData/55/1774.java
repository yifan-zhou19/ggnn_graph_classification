package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String str = new String(new char[50]); //??????????????
		final String dest = "";
		String trans = new String(new char[36]);
												//trans[36]:???0~35???'0'~'9','A'~'Z'????
		int a;
		int b;
		int i;
		int d;
		int len;
		int num = 0; //long??4???????????????31?
		for (i = 0;i < 10;i++)
		{
			trans = tangible.StringFunctions.changeCharacter(trans, i, '0' + i);
		}
		for (i = 10;i < 36;i++)
		{
			trans = tangible.StringFunctions.changeCharacter(trans, i, 'A' + i - 10);
		}
		a = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		str = ConsoleInput.readToWhiteSpace(true).charAt(0);
		b = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;str.charAt(i) != '\0';i++)
		{ //?????a???????????
			if (str.charAt(i) >= '0' && str.charAt(i) <= '9')
			{
				d = str.charAt(i) - '0';
			}
			else if (str.charAt(i) >= 'a' && str.charAt(i) <= 'z')
			{
				d = str.charAt(i) - 'a' + 10;
			}
			else if (str.charAt(i) >= 'A' && str.charAt(i) <= 'Z')
			{
				d = str.charAt(i) - 'A' + 10;
			}
			num = num * a + d;
		} //????????????num
		i = 0;
		do
		{ //???b?????????dest???
			dest = tangible.StringFunctions.changeCharacter(dest, i++, trans.charAt(num % b)); //???num==0???
			num = num / b;
		}while (num != 0);
		len = dest.length(); //????????????dest????
		for (i = len - 1;i >= 0;i--) //????
		{
			System.out.print(dest.charAt(i));
		}
		return 0;
	}



}

