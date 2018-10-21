package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String an = new String(new char[1000]);
		String bn = new String(new char[1000]);
		cin.get(an,1000);
		int i = 0;
		int j = 0;
		for (i = 0;i < an.length();i++)
		{
			if (an.charAt(i) != ' ' || an.charAt(i) == ' ' && an.charAt(i + 1) != ' ')
			{
				bn = tangible.StringFunctions.changeCharacter(bn, j, an.charAt(i));
				j++;
			}
		}
		int jj;
		for (jj = 0;jj < j;jj++)
		{
			System.out.print(bn.charAt(jj));
		}
		return 0;
	}





}

