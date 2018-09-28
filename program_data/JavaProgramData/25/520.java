package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String answer = new String(new char[100]);
		for (int i = 0; i < 100; i++)
		{
			answer = tangible.StringFunctions.changeCharacter(answer, i, '0');
		}
		answer = tangible.StringFunctions.changeCharacter(answer, 0, '1');
		int num;
		num = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));

		int flag = 0;
		while (num > 0)
		{
			for (int i = 0; i <= 80; i++)
			{

				answer = tangible.StringFunctions.changeCharacter(answer, i, answer.charAt(i) + answer.charAt(i) - 48);
				if (flag == 1)
				{
					flag = 0;
					answer.charAt(i)++;
				}
				if (answer.charAt(i) > '9')
				{
					flag = 1;
					answer = tangible.StringFunctions.changeCharacter(answer, i, answer.charAt(i) - 10);
				}

			}
			num--;
		}
		int i = 80;
		while (answer.charAt(i) == '0')
		{
			i--;

		}
		for (int j = i; i >= 0; i--)
		{


			System.out.print(answer.charAt(i));
		}
		System.out.print("\n");
		return 0;
	}


}

