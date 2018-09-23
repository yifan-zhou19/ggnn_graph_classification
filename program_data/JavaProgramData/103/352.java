package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		String line = new String(new char[1001]);
		line = ConsoleInput.readToWhiteSpace(true).charAt(0);
		for (i = 0;i < line.length();i++)
		{
			if (line.charAt(i) >= 97 && line.charAt(i) <= 122)
			{
				line = tangible.StringFunctions.changeCharacter(line, i, line.charAt(i) - 32);
			}
		} //??????????????
		int[] count = new int[1000]; //count??????,num?????????
		int num = 0;
		char temp; //temp???????????,ch????????
		String ch = new String(new char[1000]);
		ch = tangible.StringFunctions.changeCharacter(ch, 0, temp = line.charAt(0));
		count[0] = 1;
		for (i = 1;i < line.length();i++)
		{
			if (line.charAt(i) == temp)
			{
				count[num]++; //??????????1
			}
			else
			{
				ch = tangible.StringFunctions.changeCharacter(ch, num + 1, line.charAt(i));
				count[num + 1] = 1;
				num++;
				temp = line.charAt(i);
			} //??????????????
		}
		for (i = 0;i <= num;i++)
		{
			System.out.print('(');
			System.out.print(ch.charAt(i));
			System.out.print(',');
			System.out.print(count[i]);
			System.out.print(')');
		}
		System.out.print("\n");
		return 0;
	}
}

