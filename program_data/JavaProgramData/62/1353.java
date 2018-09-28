package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String s;
		int i;
		int j = 0;
		int n;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		s = (String)malloc(1000 * (Character.SIZE / Byte.SIZE));
		s = new Scanner(System.in).nextLine();
		n = s.length();
		for (i = 0;i < n;i++)
		{
			if (s.charAt(i) != ' ')
			{
				s = tangible.StringFunctions.changeCharacter(s, j, s.charAt(i));
				j++;
			}
			else
			{
				if (s.charAt(i + 1) != ' ')
				{
					s = tangible.StringFunctions.changeCharacter(s, j, s.charAt(i));
					j++;
				}
			}
		}
		for (i = 0;i < j;i++)
		{
			System.out.printf("%c",s.charAt(i));
		}
		System.out.print("\n");
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'free' has no equivalent in Java:
		free(s);
	}

}

