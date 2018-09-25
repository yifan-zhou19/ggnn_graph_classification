package <missing>;

public class GlobalMembers
{
	public static String str = new String(new char[1001]);
	public static String letter = new String(new char[27]);
	public static char temp;
	public static int i;
	public static int[] start = new int[27];
	public static int l;
	public static int s = 1;
	public static int op = 'A'-'a';
	public static int opl = 'a'-'A';
	public static int Main()
	{

		str = ConsoleInput.readToWhiteSpace(true).charAt(0);
		l = str.length();
		letter = tangible.StringFunctions.changeCharacter(letter, 1, str.charAt(0));
		temp = letter.charAt(1);
		start[1] = 0;
		for (i = 0;i < l;i++)
		{
			if (str.charAt(i) == temp || str.charAt(i) == temp + op || str.charAt(i) == temp + opl)
			{
			continue;
			}
			else
			{
				s++;
				letter = tangible.StringFunctions.changeCharacter(letter, s, str.charAt(i));
				start[s] = i;
				temp = letter.charAt(s);
			}
		}
		for (i = 1;i <= s;i++)
		{

			if (letter.charAt(i) >= 'a' && letter.charAt(i) <= 'z')
			{
			   letter = tangible.StringFunctions.changeCharacter(letter, i, letter.charAt(i) + op);
			}
			if (i < s)
			{
				System.out.print("(");
			System.out.print(letter.charAt(i));
			System.out.print(",");
			System.out.print(start[i + 1] - start[i]);
			System.out.print(")");
			}
			if (i == s)
			{
				System.out.print("(");
			System.out.print(letter.charAt(i));
			System.out.print(",");
			System.out.print(l - start[i]);
			System.out.print(")");
			}
		}


		return 0;
	}

}

