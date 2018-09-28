package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int num = 0;
	int reminder;
	int a;
	int b;
	int i;
	int j;
	String figure1 = new String(new char[100]);
	String figure2 = new String(new char[100]);
	a = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	System.in.read();
	for (i = 0;;i++)
	{
		figure1 = tangible.StringFunctions.changeCharacter(figure1, i, System.in.read());
		if (figure1.charAt(i) >= 'a' && figure1.charAt(i) <= 'z')
		{
			figure1 = tangible.StringFunctions.changeCharacter(figure1, i, figure1.charAt(i) - 87);
		}
		else if (figure1.charAt(i) >= 'A' && figure1.charAt(i) <= 'Z')
		{
			figure1 = tangible.StringFunctions.changeCharacter(figure1, i, figure1.charAt(i) - 55);
		}
		else if (figure1.charAt(i) >= 42 && figure1.charAt(i) <= 57)
		{
			figure1 = tangible.StringFunctions.changeCharacter(figure1, i, figure1.charAt(i) - '0');
		}
		else
		{
			break;
		}
		num = num * a + figure1.charAt(i);
	}
	reminder = num;
	b = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	for (j = 0;;j++)
	{
		if (reminder % b >= 10)
		{
			figure2 = tangible.StringFunctions.changeCharacter(figure2, j, reminder % b + 55);
		}
		else
		{
			figure2 = tangible.StringFunctions.changeCharacter(figure2, j, reminder % b + '0');
		}
		reminder = reminder / b;
		if (reminder == 0)
		{
			break;
		}
	}
	for (;j >= 0;j--)
	{
		System.out.print(figure2.charAt(j));
	}
	System.out.print("\n");
	return 0;
	}

}

