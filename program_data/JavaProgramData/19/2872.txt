package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String str = new String(new char[110]);
		String a = new String(new char[110]);
		String b = new String(new char[110]);
		String out = new String(new char[2000]);
		String tmp = new String(new char[110]);
		int index = 0;
		int out_i = 0;
		int len;
		int len_a;
		int len_b;

//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(out, 0, (Character.SIZE / Byte.SIZE));
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(a, 0, (Character.SIZE / Byte.SIZE));
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(b, 0, (Character.SIZE / Byte.SIZE));

		str = new Scanner(System.in).nextLine();
		len = str.length();

		a = ConsoleInput.readToWhiteSpace(true).charAt(0);
		b = ConsoleInput.readToWhiteSpace(true).charAt(0);
		len_a = a.length();
		len_b = b.length();

		for (int i = 0; i < len; i++)
		{
			if (str.charAt(i) != ' ')
			{
				tmp = tangible.StringFunctions.changeCharacter(tmp, index++, str.charAt(i));
			}
			else if (str.charAt(i) == ' ')
			{
				tmp = tangible.StringFunctions.changeCharacter(tmp, index++, '\0');
				if (!strcmp(tmp, a))
				{
					for (int j = 0; j < len_b; j++)
					{
						out = tangible.StringFunctions.changeCharacter(out, out_i++, b.charAt(j));
					}

				}
				else
				{
					for (int j = 0; j < tmp.length(); j++)
					{
						out = tangible.StringFunctions.changeCharacter(out, out_i++, tmp.charAt(j));
					}
				}
				out = tangible.StringFunctions.changeCharacter(out, out_i++, ' ');
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
				memset(tmp, 0, (Character.SIZE / Byte.SIZE));
				index = 0;
			}

			if (i == len - 1)
			{
				tmp = tangible.StringFunctions.changeCharacter(tmp, index++, '\0');
				if (!strcmp(tmp, a))
				{
					for (int j = 0; j < len_b; j++)
					{
						out = tangible.StringFunctions.changeCharacter(out, out_i++, b.charAt(j));
					}

				}
				else
				{
					for (int j = 0; j < tmp.length(); j++)
					{
						out = tangible.StringFunctions.changeCharacter(out, out_i++, tmp.charAt(j));
					}
				}
				//out[out_i++] = ' ';
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
				memset(tmp, 0, (Character.SIZE / Byte.SIZE));
				index = 0;
			}
		}

		System.out.print(out);
		System.out.print("\n");

	}
}

