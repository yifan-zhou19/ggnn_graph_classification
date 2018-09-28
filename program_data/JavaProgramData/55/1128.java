package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String input = new String(new char[100]);
		String output = new String(new char[100]);
		int in;
		int out;
		int num = 0;
		int tmp;
		int tmp1;
		in = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		input = ConsoleInput.readToWhiteSpace(true).charAt(0);
		out = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int i = 0; input.charAt(i) != '\0'; i++)
		{
			if (input.charAt(i) > 47 && input.charAt(i) < 58)
			{
				tmp = input.charAt(i) - 48;
			}
			else if (input.charAt(i) > 64 && input.charAt(i) < 91)
			{
				tmp = input.charAt(i) - 55;
			}
			else
			{
				tmp = input.charAt(i) - 87;
			}
			num = num * in + tmp;
		}
		int i = 0;
		for (;num != 0; i++)
		{
			tmp1 = num % out;
			if (tmp1 < 10)
			{
				output = tangible.StringFunctions.changeCharacter(output, i, tmp1 + 48);
			}
			else
			{
				output = tangible.StringFunctions.changeCharacter(output, i, tmp1 + 55);
			}
			num /= out;
		}
		if (i == 0)
		{
			output = tangible.StringFunctions.changeCharacter(output, i, 48);
			i++;
		}
		for (int j = i - 1; j >= 0; j--)
		{
			System.out.print(output.charAt(j));
		}
		System.out.print("\n");

		return 0;
	}





}

