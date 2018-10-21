package <missing>;

public class GlobalMembers
{
	/************************************
	2.cpp
	???Nov 9, 2011
	??(12.9) ????
	?? 1100012886
	************************************/

	/*
	         note:
	         0-48
	         A-65
	         a-97
	*/

	public static String str = new String(new char[100]); //???????????
	public static String res = new String(new char[100]);
	public static int a; //decimal??????10???????
	public static int b;
	public static int decimal = 0;

	public static void fix() //?????????????????
	{
		int i = 0;
		do
		{
			if (str.charAt(i) > 96)
			{
				str = tangible.StringFunctions.changeCharacter(str, i, str.charAt(i) - 32);
			}
			i++;
		} while (str.charAt(i) != '\0');
	}

	public static void turn1() //?????????10??
	{
		int i = 0; //t??????????
		int t;
		do
		{
			if (str.charAt(i) > 64)
			{
				t = str.charAt(i) - 55;
			}
			else
			{
				t = str.charAt(i) - 48;
			}
			decimal = decimal * a + t;
			i++;
		} while (str.charAt(i) != '\0');
	}

	public static void turn2() //???10?????b?????
	{
		int i = 0; //t??????????
		int j;
		int t;
		//????
		while (decimal >= b)
		{
			t = decimal % b;
			if (t > 9)
			{
				res = tangible.StringFunctions.changeCharacter(res, i, t + 55);
			}
			else
			{
				res = tangible.StringFunctions.changeCharacter(res, i, t + 48);
			}
			decimal = decimal / b;
			i++;
		}
		t = decimal % b;
		if (t > 9)
		{
			res = tangible.StringFunctions.changeCharacter(res, i, t + 55);
		}
		else
		{
			res = tangible.StringFunctions.changeCharacter(res, i, t + 48);
		}
		//????
		for (j = i; j >= 0; j--)
		{
			System.out.print(res.charAt(j));
		}
	}

	public static int Main()
	{
		a = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		str = ConsoleInput.readToWhiteSpace(true).charAt(0);
		b = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		fix();
		turn1();
		turn2();
		return 0;
	}
}

