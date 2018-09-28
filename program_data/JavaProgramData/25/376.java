package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int num;
		int temp;
		int up = 0;
		int flag = 0;
		String m = new String(new char[100]);
		for (int i = 1; i < 100;i++)
		{
			m = tangible.StringFunctions.changeCharacter(m, i, '0');
		}
		m = tangible.StringFunctions.changeCharacter(m, 0, '1');
		num = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int k = 0; k < num; k++)
		{
			for (int p = 0; p < 100;p++)
			{
				temp = (m.charAt(p) - '0') * 2;
				m = tangible.StringFunctions.changeCharacter(m, p, temp % 10 + up + '0');
				up = temp / 10;
			}
		}
		for (int r = 99; r >= 0; r--)
		{
			if ((m.charAt(r) == '0') && (flag == 0))
			{
				continue;
			}
			System.out.print(m.charAt(r));
			flag = 1;
		}
		return 0;
	}
}

