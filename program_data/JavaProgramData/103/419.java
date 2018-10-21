package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String input = new String(new char[1005]);
		String reserve = new String(new char[1005]);
		int i;
		int j = 0;
		int[] num = new int[1005];
		int flag = 0;
		input = ConsoleInput.readToWhiteSpace(true).charAt(0);
		if (input.charAt(0) >= 'a')
		{
			input.charAt(0) -= ('a' - 'A');
		}
		reserve = tangible.StringFunctions.changeCharacter(reserve, 0, input.charAt(0));
		num[0] = 1;
		for (i = 1; input.charAt(i) != '\0'; i++)
		{
			if (input.charAt(i) >= 'a')
			{
				input.charAt(i) -= ('a' - 'A');
			}
			if (input.charAt(i) == input.charAt(i - 1))
			{
				num[j]++;
			}
			else
			{
				j++;
				reserve = tangible.StringFunctions.changeCharacter(reserve, j, input.charAt(i));
				num[j]++;
			}
		}
		reserve = tangible.StringFunctions.changeCharacter(reserve, j + 1, '\0');
		for (i = 0; reserve.charAt(i) != '\0'; i++)
		{
			if (flag == 0)
			{
				System.out.print("(");
				System.out.print(reserve.charAt(i));
				System.out.print(",");
				System.out.print(num[i]);
				System.out.print(")");
				flag = 1;
			}
			else
			{
				System.out.print("(");
				System.out.print(reserve.charAt(i));
				System.out.print(",");
				System.out.print(num[i]);
				System.out.print(")");
			}
		}

		return 0;
	}
}

