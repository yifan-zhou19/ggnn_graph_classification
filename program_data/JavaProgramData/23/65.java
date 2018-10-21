package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[100]);
		String b = new String(new char[100]);
	 int d;
	 int e;
	 int f;
	 int h;
	 int g;
	 int i;
	 int j;
	 int k;
	a = new Scanner(System.in).nextLine();
	int[] c = new int[100];
	e = a.length();
	j = 0;
	for (i = 0;i < e;i++)
	{
		if (a.charAt(i) != ' ')
		{
			c[j]++;
		}
	 else
	 {
		 j = j + 1;
	 }
	}
	g = 0;
	for (i = 0;i <= j;i++)
	{
		for (k = 0;k < c[j - i];k++)
		{
	b = tangible.StringFunctions.changeCharacter(b, g + k, a.charAt(e - c[j - i] - g + k));
		}
	g = g + c[j - i];
	b = tangible.StringFunctions.changeCharacter(b, g, ' ');
	g++;
	}
	for (i = 0;i < e;i++)
	{
	System.out.printf("%c",b.charAt(i));
	}
	return 0;
	}
}

