package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String string = new String(new char[256]);
		String substring = new String(new char[256]);
		String replacement = new String(new char[256]);
			String = ConsoleInput.readToWhiteSpace(true);
			substring = ConsoleInput.readToWhiteSpace(true).charAt(0);
			replacement = ConsoleInput.readToWhiteSpace(true).charAt(0);
			int i;
			int j = 0;
			int length1;
			int length2;
			int m;
			int num = 0;
			length1 = String.length();
			length2 = substring.length();
			for (i = 0 ; i < length1 ; i++)
			{
				m = i;
				if (String[i] == substring.charAt(j))
				{

					for (j = 0 ; j < length2 ; j++)
					{
						if (String[i] == substring.charAt(j))
						{
							i++;
							num++;
						}
					}
				}
				j = 0;
				i = m;
				if (num == length2)
				{
					for (j = 0 ; j < length2 ; j++)
					{
						String[i] = replacement.charAt(j);
						i++;
					}
				break;
				}
				num = 0;
			}
			System.out.print(String);
			System.out.print("\n");
			return 0;
	}
}

