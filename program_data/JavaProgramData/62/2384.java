package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[100]);
		char b;
		int i1 = 0;
		while (cin.get(b) && b != '\n')
		{
			a = tangible.StringFunctions.changeCharacter(a, i1++, b); //shuruzifuchuan
		}
		String c = new String(new char[100]);
		int j = 0;
		for (int i2 = 0;i2 <= i1 - 1;i2++)
		{
			if (a.charAt(i2) == 32 && a.charAt(i2 + 1) == 32)
			{
				continue; //duogekonggexianglin,zhiquyige
			}
			else
			{
				c = tangible.StringFunctions.changeCharacter(c, j++, a.charAt(i2));
			}
		}
		for (int k = 0;k <= j - 1;k++)
		{
			System.out.print(c.charAt(k));
		}
		return 0;
	}
}

