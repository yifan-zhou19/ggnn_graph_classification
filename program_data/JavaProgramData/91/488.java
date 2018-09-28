package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int i;
	int j;
	int x;
	String a = new String(new char[105]);
	String b = new String(new char[105]);
	a = new Scanner(System.in).nextLine();
	x = a.length();
	for (j = 0;j < x;j++)
	{
		b = b.substring(0, j);
	}

	for (i = 0;i < x;i++)
	{
		if (i == x - 1)
		{
			b = tangible.StringFunctions.changeCharacter(b, i, a.charAt(i) + a.charAt(0));
		}
		else
		{
			b = tangible.StringFunctions.changeCharacter(b, i, a.charAt(i) + a.charAt(i + 1));
		}
	}

	for (j = 0;j < x;j++)
	{
	System.out.printf("%c",b.charAt(j));
	}





	return 0;
	}

}

