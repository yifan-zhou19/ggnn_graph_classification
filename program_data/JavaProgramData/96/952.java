package <missing>;

public class GlobalMembers
{
	public static String li = new String(new char[110]);
	public static String up = new String(new char[110]);
	public static int num = 0;
	public static void chu(int i)
	{
		int bc;
		bc = (li.charAt(i) - '0') * 100 + (li.charAt(i + 1) - '0') * 10 + li.charAt(i + 2) - '0';
		int yu;
		int jie;
		jie = bc / 13;
		yu = bc % 13;
		if (num == 0 && jie > 10)
		{

				up = tangible.StringFunctions.changeCharacter(up, num, jie / 10 + '0');
				num = num + 1;
				up = tangible.StringFunctions.changeCharacter(up, num, jie - jie / 10 * 10 + '0');
				num = num + 1;

		}
		else
		{
			up = tangible.StringFunctions.changeCharacter(up, num, jie + '0');
			num = num + 1;
		}
		li = tangible.StringFunctions.changeCharacter(li, i, 0 + '0');
		if (yu > 10)
		{
			li = tangible.StringFunctions.changeCharacter(li, i + 1, yu / 10 + '0');
			li = tangible.StringFunctions.changeCharacter(li, i + 2, yu - 10 + '0');
		}
		else
		{
			li = tangible.StringFunctions.changeCharacter(li, i + 1, '0');
			li = tangible.StringFunctions.changeCharacter(li, i + 2, yu + '0');
		}
	}
	public static int Main()
	{
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(li,'\0',(Character.SIZE / Byte.SIZE));
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(up,'\0',(Character.SIZE / Byte.SIZE));
		while ((li = ConsoleInput.readToWhiteSpace(true).charAt(0)).length() > 0)
		{

			num = 0;
			int len;
			len = li.length();
			if (len > 3)
			{
			for (int j = 0;j < len - 2;j++)
			{
				chu(j);
			}
			System.out.print(up);
			System.out.print("\n");
			if (li.charAt(len - 2) == '1')
			{
				System.out.print('1');
			}
			System.out.print(li.charAt(len - 1));
			System.out.print("\n");
			}
			else
			{
				int t;
				t = Integer.parseInt(li);
				System.out.print(t / 13);
				System.out.print("\n");
				System.out.print(t % 13);
				System.out.print("\n");
			}
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
			memset(li,'\0',(Character.SIZE / Byte.SIZE));
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
			memset(up,'\0',(Character.SIZE / Byte.SIZE));
		}

		return 0;
	}


}

