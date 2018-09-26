package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		String input = new String(new char[101]);
		String output = new String(new char[101]);
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * p1;
		int i = 0;
		int count = 0;

		input = new Scanner(System.in).nextLine();
		p1 = input;

		for (p1 = input; * (p1 + 1) != '\0';p1++)
		{
			output = tangible.StringFunctions.changeCharacter(output, i, *p1 + *(p1 + 1));
			i++;
			count++;
		}
		if (*(p1 + 1) == '\0')
		{
			output = tangible.StringFunctions.changeCharacter(output, count, *p1 + input.charAt(0));
		}

		for (i = 0;i <= count;i++)
		{
			System.out.printf("%c",output.charAt(i));
		}

	}


}

