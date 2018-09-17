package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int num = 0;
		String st = new String(new char[1100]);
		st = ConsoleInput.readToWhiteSpace(true).charAt(0);
		for (int i = 0;i < st.length();i++)
		{
			if (st.charAt(i) >= 'a' && st.charAt(i) <= 'z')
			{
				st = tangible.StringFunctions.changeCharacter(st, i, st.charAt(i) + 'A'-'a');
			}
		}
		for (int i = 0;i < st.length();i++)
		{
			if (st.charAt(i) == st.charAt(i + 1))
			{
				num++;
			}
			else
			{
				System.out.print("(");
				System.out.print(st.charAt(i));
				System.out.print(",");
				System.out.print(num + 1);
				System.out.print(")");
				num = 0;
			}
		}
		return 0;
	}



}

