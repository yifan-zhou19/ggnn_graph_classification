package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String str = new String(new char[4]);
	str = tangible.StringFunctions.changeCharacter(str, 0, 'z');
	str = tangible.StringFunctions.changeCharacter(str, 1, 'q');
	str = tangible.StringFunctions.changeCharacter(str, 2, 's');
	str = tangible.StringFunctions.changeCharacter(str, 3, 'l');
	int a = 0;
	int b = 0;
	int c = 0;
	int d = 0;
	for (a = 1;a <= 5;a++)
	{
	for (b = 1;b <= 5;b++)
	{
	for (c = 1;c <= 5;c++)
	{
	for (d = 1;d <= 5;d++)
	{
	if (a + b == c + d && a + d > b + c && a + c < b && a != b && a != c && a != d && b != c && b != d && c != d)
	{
		int[] s = {a, b, c, d};
	int i = 0;
	int j = 0;
	for (i = 0;i <= 2;i++)
	{
	for (j = i + 1;j <= 3;j++)
	{
		if (s[i] < s[j])
		{
		int x = 0;
	char y;
	x = s[i];
	s[i] = s[j];
	s[j] = x;
	 y = str.charAt(i);
	 str = tangible.StringFunctions.changeCharacter(str, i, str.charAt(j));
	 str = tangible.StringFunctions.changeCharacter(str, j, y);
		}
	}
	}
	int k = 0;
	for (k = 0;k <= 3;k++)
	{
	System.out.print(str.charAt(k));
	System.out.print(" ");
	System.out.print(10 * s[k]);
	System.out.print("\n");
	}
	}
	}
	}
	}
	}
	System.out.print("\n");

		return 0;
	}


}

