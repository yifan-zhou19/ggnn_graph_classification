package <missing>;

public class GlobalMembers
{
	//*******************
	//*???????*
	//*??????*
	//*2011/11/14*
	//*******************

	public static int change(char a)
	{
		int b;
		if ((a <= '9') && (a >= '0'))
		{
			b = a - '0';
		}
		else if ((a >= 'a') && (a <= 'z'))
		{
			b = a - 'a' + 10;
		}
		else
		{
			b = a - 'A' + 10;
		}
		return b;
	} // ?????????????????

	public static int Main()
	{
		int i = 0;
		int j;
		int num1;
		int num2;
		int m;
		int ten = 0; // ten???????
		String output = new String(new char[100]);
		char chu;
		char mo;
		num1 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		System.in.read();

		while ((chu = System.in.read()) != ' ')
		{
			m = change(chu); // ????
			ten = ten * num1; // ?num1??????????????ten
			ten = ten + m;
		}

		num2 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));

		while (ten > 0)
		{
			m = ten % num2;
			if (m > 9)
			{
				mo = m - 10 + 'A';
			}
			else
			{
				mo = m + '0';
			}
			output = tangible.StringFunctions.changeCharacter(output, i, mo);
			i++;
			ten = ten / num2;
		} // ?????????????

		if (i == 0)
		{
			System.out.print("0");
			System.out.print("\n");
		}
		else
		{
			for (j = i - 1; j >= 0; j--)
			{
				System.out.print(output.charAt(j));
			}
		}
		return 0;
	}
}

