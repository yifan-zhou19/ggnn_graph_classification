package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String str = new String(new char[1000]);
		int[] ji = new int[1000];
		int i;
		int j;
		int n;
		str = ConsoleInput.readToWhiteSpace(true).charAt(0);
		for (i = 0;i < 1000;i++)
		{
			ji[i] = 1;
		}
		n = str.length();
		for (i = 0;i < n;i++)
		{
		if (str.charAt(i) >= 'a')
		{
			str = tangible.StringFunctions.changeCharacter(str, i, str.charAt(i) - 'a'+'A');
		}
		}
		for (i = 0;i < n;i++)
		{
						if (str.charAt(i) == str.charAt(i + 1))
						{
											for (j = i + 1;j < n;j++)
											{
												str = tangible.StringFunctions.changeCharacter(str, j, str.charAt(j + 1));
											}
											n--;
											ji[i]++;
											i--;
						}
		}
		for (i = 0;i < n;i++)
		{
			System.out.print("(");
			System.out.print(str.charAt(i));
			System.out.print(",");
			System.out.print(ji[i]);
			System.out.print(")");
		}
		return 0;
	}
}

