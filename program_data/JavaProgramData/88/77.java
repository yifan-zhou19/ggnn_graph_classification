package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String input_number = new String(new char[30]);
		input_number = new Scanner(System.in).nextLine();

		int indicator;
		int cool = 0;
		for (indicator = 0;indicator < input_number.length();indicator++)
		{
			if (Character.isDigit(input_number.charAt(indicator)))
			{
			cool = 0;
			System.out.print(input_number.charAt(indicator));
			}
			else if (cool == 0)
			{
				System.out.print("\n");
				cool = 1;
			}
		}
		return 0;
	}

}
