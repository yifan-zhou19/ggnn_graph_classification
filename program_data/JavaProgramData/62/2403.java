package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[100]);
		String b = new String(new char[100]);
		char c;
		int i = 0;
		int j = 0;
		int k = 0;
		while (cin.get(c) && c != '\n')
		{
			a = tangible.StringFunctions.changeCharacter(a, i++, c); //???????
		}
		for (j = 0;j < i;j++)
		{
			if (a.charAt(j) == 32 && a.charAt(j + 1) == 32)
			{
				continue; //?????????,??
			}
			else
			{
				b = tangible.StringFunctions.changeCharacter(b, k++, a.charAt(j)); //??????b[100]?
			}
		}
		for (int n = 0;n < k;n++)
		{
			System.out.print(b.charAt(n));
		}
		return 0;
	}
}

