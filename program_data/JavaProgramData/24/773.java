package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int min;
		int max;
		int i;
		String str_i = new String(new char[100]);
		String str_a = new String(new char[100]);
		String str = new String(new char[200]);
		int flag = 1;
		max = -1;
		min = 100000;
		while (flag != 0)
		{
			for (i = 0;;i++)
			{
				str = tangible.StringFunctions.changeCharacter(str, i, System.in.read());
				if (str.charAt(i) == ' ')
				{
					str = tangible.StringFunctions.changeCharacter(str, i, '\0');
					break;
				}
				if (str.charAt(i) == '\n')
				{
					str = tangible.StringFunctions.changeCharacter(str, i, '\0');
					flag = 0;
					break;
				}
			}
			if (str.length() < min)
			{
				min = str.length();
				str_i = str;
			}
			int test = str.length();
			if (test > max)
			{
				max = str.length();
				str_a = str;
			}
		}
		System.out.printf("%s\n",str_a);
		System.out.printf("%s",str_i);
		return 0;


	}
}

