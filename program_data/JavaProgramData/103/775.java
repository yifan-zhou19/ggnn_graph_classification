package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		final String a = "";
		int[] b = new int[1005];
		int num = 1;
		a = ConsoleInput.readToWhiteSpace(true).charAt(0);
		for (int i = 0;i < a.length() - 1;i++)
		{
			if (a.charAt(i) - 'a' >= 0 && a.charAt(i) - 'z' <= 0)
			{
				a = tangible.StringFunctions.changeCharacter(a, i, a.charAt(i) + 'A'-'a');
			}
			if (a.charAt(i) != a.charAt(i + 1) && a.charAt(i) - a.charAt(i + 1) != 'A'-'a' && a.charAt(i) - a.charAt(i + 1) != 'a'-'A')
			{
				b[num] = i + 1;
				num++;
			}
		} //????,????b
			if (a.charAt(a.length() - 1) - 'a' >= 0 && a.charAt(a.length() - 1) - 'z' <= 0)
			{
				a = tangible.StringFunctions.changeCharacter(a, a.length() - 1, a.charAt(a.length() - 1) + 'A'-'a');
			}
			b[num] = a.length();
			for (int i = 1;i <= num;i++)
			{
				System.out.print("(");
				System.out.print(a.charAt(b[i - 1]));
				System.out.print(",");
				System.out.print(b[i] - b[i - 1]);
				System.out.print(")");
			} //??

				return 0;
	}

}

