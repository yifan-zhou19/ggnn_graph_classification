package <missing>;

public class GlobalMembers
{
	public static int Main()
	{

		String string = new String(new char[1000]);
		String = new Scanner(System.in).nextLine();

		int len = 0;
		int count = 0;
		while (String[len])
		{
			len++;
		}

		int index = 0;

		char first_letter = Character.toUpperCase(String[0]);


		for (index = 0;index <= len;)
		{
			if (Character.toUpperCase(String[index]) == first_letter)
			{
				count++;
				index++;
			}
			else
			{

					System.out.printf("(%c,%d)",first_letter,count);
					count = 0;
					first_letter = Character.toUpperCase(String[index]);

			}
		}


		return 0;
	}
}
