import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int TIME_LIMIT = 1000;

	public static int parseInput(tangible.RefObject<String> input, int[] record)
	{
		int idx = 0;
		String number = new String(new char[5]);
		int number_idx = 0;
		int count = 0;
		while (idx < input.argValue.length())
		{
			if (input.argValue.charAt(idx) != ',')
			{
				number = tangible.StringFunctions.changeCharacter(number, number_idx++, input.argValue.charAt(idx));
			}
			else
			{
				number = tangible.StringFunctions.changeCharacter(number, number_idx, '\0');
				number_idx = 0;
				int inum = Integer.parseInt(number);
				for (int i = inum; i < TIME_LIMIT; i++)
				{
					record[i]++;
				}
				count++;
			}
			idx++;
		}

		//???????
		number = tangible.StringFunctions.changeCharacter(number, number_idx, '\0');
		int inum = Integer.parseInt(number);
		for (int i = inum; i < TIME_LIMIT; i++)
		{
			record[i]++;
		}
		count++;
		return count;
	}

	public static int Main()
	{
		String input = new String(new char[100000]);
		int[] enter = new int[TIME_LIMIT];
		int[] leave = new int[TIME_LIMIT];
		for (int i = 0; i < TIME_LIMIT; i++)
		{
			enter[i] = leave[i] = 0;
		}
		input = new Scanner(System.in).nextLine();
	tangible.RefObject<String> tempRef_input = new tangible.RefObject<String>(input);
		int all = parseInput(tempRef_input, enter);
		input = tempRef_input.argValue;
		input = new Scanner(System.in).nextLine();
	tangible.RefObject<String> tempRef_input2 = new tangible.RefObject<String>(input);
		parseInput(tempRef_input2, leave);
		input = tempRef_input2.argValue;

		int max = 0;
		for (int i = 0; i < TIME_LIMIT; i++)
		{
			if (enter[i] - leave[i] > max)
			{
				max = enter[i] - leave[i];
			}
		}
		System.out.print(all);
		System.out.print(' ');
		System.out.print(max);
		System.out.print("\n");
		return 0;
	}

}

