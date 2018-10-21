package <missing>;

public class GlobalMembers
{
	//************************************************************************
	//?????????????????                                     *
	//????wayne                                                          *
	//?????11.12????????????????????????????*
	//************************************************************************
	public static int Main()
	{
		String str = new String(new char[1000]); //?????????????
		String num1 = new String(new char[1000]);
		int a;
		int b;
		int len;
		int num = 0; //p[1000]??????????????
		int i;
		int j;
		int[] p = new int[1000];
		a = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		str = ConsoleInput.readToWhiteSpace(true).charAt(0);
		b = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		len = str.length(); //????????
		for (i = 0;i <= len - 1;i++)
		{
			if (str.charAt(i) > 47 && str.charAt(i) < 58)
			{
				str = tangible.StringFunctions.changeCharacter(str, i, str.charAt(i) - 48);
			}
			else if (str.charAt(i) > 64 && str.charAt(i) < 91)
			{
				str = tangible.StringFunctions.changeCharacter(str, i, str.charAt(i) - 55);
			}
			else if (str.charAt(i) > 96 && str.charAt(i) < 123) //?????????????
			{
				str = tangible.StringFunctions.changeCharacter(str, i, str.charAt(i) - 87);
			}
			p[i] = str.charAt(i);
			for (j = 1;j <= len - 1 - i;j++)
			{
			p[i] = p[i] * a; //???????????????
			}
			num = num + p[i]; //??????????
		}
		i = 0;
		do
		{
			num1 = tangible.StringFunctions.changeCharacter(num1, i, num % b);
			if (num1.charAt(i) >= 0 && num1.charAt(i) <= 9)
			{
				num1 = tangible.StringFunctions.changeCharacter(num1, i, num1.charAt(i) + 48);
			}
			else if (num1.charAt(i) >= 10 && num1.charAt(i) <= 35)
			{
				num1 = tangible.StringFunctions.changeCharacter(num1, i, num1.charAt(i) + 55);
			}
			num = num / b;
			i = i + 1;
		} while (num != 0); //?????????????????????
		for (j = i - 1;j >= 0;j--) //????????
		{
			System.out.print(num1.charAt(j));
		}
		System.out.print("\n");
		return 0;
	}
}

