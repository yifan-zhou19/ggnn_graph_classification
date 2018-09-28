package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String inp1 = new String(new char[4000]);
		String inp2 = new String(new char[4000]);
		inp1 = ConsoleInput.readToWhiteSpace(true).charAt(0);
		inp2 = ConsoleInput.readToWhiteSpace(true).charAt(0);

		int[] time1 = new int[1000];
		int[] time2 = new int[1000];
		String temp = new String(new char[4]);

		int pointer = 0;
		int people = 0;
		for (int k = 0;inp1.charAt(k) != '\0';k++)
		{
			if (inp1.charAt(k) != ',')
			{
				temp = tangible.StringFunctions.changeCharacter(temp, pointer++, inp1.charAt(k));
			}
			else
			{
				temp = tangible.StringFunctions.changeCharacter(temp, pointer, '\0');
				time1[people++] = Integer.parseInt(temp);
				pointer = 0;
			}
		}
		temp = tangible.StringFunctions.changeCharacter(temp, pointer, '\0');
		time1[people++] = Integer.parseInt(temp);

		pointer = 0;
		people = 0;
		for (int k = 0;inp2.charAt(k) != '\0';k++)
		{
			if (inp2.charAt(k) != ',')
			{
				temp = tangible.StringFunctions.changeCharacter(temp, pointer++, inp2.charAt(k));
			}
			else
			{
				temp = tangible.StringFunctions.changeCharacter(temp, pointer, '\0');
				time2[people++] = Integer.parseInt(temp);
				pointer = 0;
			}
		}
		temp = tangible.StringFunctions.changeCharacter(temp, pointer, '\0');
		time2[people++] = Integer.parseInt(temp);

		int max = 0;
		for (int k = 0;k != 1000;k++)
		{
			int counter = 0;
			for (int i = 0;i != people;i++)
			{
				if (k >= time1[i] != 0 && k < time2[i])
				{
					counter++;
				}
			}
			if (counter > max)
			{
				max = counter;
			}
		}
		System.out.print(people);
		System.out.print(" ");
		System.out.print(max);
		System.out.print("\n");
		return 0;
	}
}

