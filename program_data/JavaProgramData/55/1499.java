package <missing>;

public class GlobalMembers
{
	public static char Change(int x)
	{
		if (x <= 9)
		{
			return (x + 48);
		}
		if (x >= 10)
		{
			return (x + 55);
		}
	}
	public static int change(char x)
	{
	   if (x >= 48 && x <= 57)
	   {
		   return (x - 48);
	   }
	   if (x >= 65 && x <= 90)
	   {
		   return (x - 55);
	   }
	   if (x >= 97 && x <= 122)
	   {
		   return (x - 87);
	   }
	}
	public static int Main()
	{
		int a;
		int b;
		int i;
		int length;
		int Length;
		String num = new String(new char[30]);
		String NUM = new String(new char[100]);
		int number = 0;
		a = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		num = ConsoleInput.readToWhiteSpace(true).charAt(0);
		b = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < 30;i++)
		{
			if (num.charAt(i) != '\0')
			{
				;
			}
			else
			{
				break;
			}
		}
		length = i;
		for (i = 0;i < length;i++)
		{
			  number += change(num.charAt(length - i - 1)) * Math.pow((double)a,(double)i);
		}
		for (i = 0;i < 100 && number >= b;i++)
		{
			NUM = tangible.StringFunctions.changeCharacter(NUM, i, Change(number - (number / b) * b));
			number = number / b;
		}
		Length = i + 1;
		NUM = tangible.StringFunctions.changeCharacter(NUM, i, Change(number));
		for (i = 0;i < Length;i++)
		{
			System.out.print(NUM.charAt(Length - 1 - i));
		}
		return 0;
	}

}

