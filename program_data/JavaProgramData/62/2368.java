package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[1000]);
		char t;
		int i = 0;
		t = System.in.read();

		while (t > 20)
		{
			while (t != ' ')
			{
				a = tangible.StringFunctions.changeCharacter(a, i, t);
				t = System.in.read();
				i++;
				if (t < 33)
				{
					break;
				}
			}
			if (t < 32)
			{
				break;
			}
			while (t == ' ')
			{
				t = System.in.read();
			}
			a = tangible.StringFunctions.changeCharacter(a, i, ' ');
			i++;
		}
		for (int k = 0;k < i;k++)
		{
			System.out.print(a.charAt(k));
		}
		return 0;
	}
}

