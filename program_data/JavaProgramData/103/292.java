package <missing>;

public class GlobalMembers
{
	public static String str = new String(new char[1000]);
	public static int[] num = new int[1000];
	public static final String w = "";
	public static int ch = 'a'-'A';
	public static int Main()
	{
		str = ConsoleInput.readToWhiteSpace(true).charAt(0);
		int len;
		int j = 0;
		if (str.charAt(0) > 'Z')
		{
			w = tangible.StringFunctions.changeCharacter(w, 0, str.charAt(0) - ch);
		}
		else
		{
			w = tangible.StringFunctions.changeCharacter(w, 0, str.charAt(0));
		}
		num[0]++;

		len = str.length();
		for (int i = 1;i < len;i++)
		{
			if (str.charAt(i) == w.charAt(j) || str.charAt(i) - ch == w.charAt(j))
			{
				num[j]++;
				continue;
			}
			else
			{
				j++;
				num[j]++;
				if (str.charAt(i) > 'Z')
				{
					w = tangible.StringFunctions.changeCharacter(w, j, str.charAt(i) - ch);
				}
				else
				{
					w = tangible.StringFunctions.changeCharacter(w, j, str.charAt(i));
				}
			}
		}
		for (int i = 0;i < 1000;i++)
		{
			if (num[i] != 0)
			{
				System.out.print("(");
				System.out.print(w.charAt(i));
				System.out.print(",");
				System.out.print(num[i]);
				System.out.print(")");
			}
		}
		return 0;
	}
}

