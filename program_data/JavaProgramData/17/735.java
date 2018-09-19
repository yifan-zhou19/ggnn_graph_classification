package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String c = new String(new char[110]);
		String s = new String(new char[110]);
		int left;
		int i;
		int[] leftp = new int[110];
		while ((c = ConsoleInput.readToWhiteSpace(true).charAt(0)).length() > 0)
		{
			left = 0;
			i = 0;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
			memset(leftp,0,110 * (Integer.SIZE / Byte.SIZE));
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
			memset(s,0,110 * (Character.SIZE / Byte.SIZE));
			while (c.charAt(i) != '\0')
			{
				if (c.charAt(i) == '(')
				{
					left++;
					leftp[left] = i;
				}
				else
				{
					if (c.charAt(i) == ')')
					{
						if (left == 0)
						{
							s = tangible.StringFunctions.changeCharacter(s, i, '?');
						}
						else
						{
							left--;
						}
					}
				}
				i++;
			}
			if (left > 0)
			{
				for (i = 1;i <= left;i++)
				{
					s = tangible.StringFunctions.changeCharacter(s, leftp[i], '$');
				}
			}
			System.out.print(c);
			System.out.print("\n");
			for (i = 0;i < c.length();i++)
			{
				if ((s.charAt(i) == '?') || (s.charAt(i) == '$'))
				{
					System.out.print(s.charAt(i));
				}
				else
				{
					System.out.print(' ');
				}
			}
			System.out.print("\n");
		}
		return 0;
	}
}

