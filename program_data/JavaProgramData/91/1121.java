package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String zi = new String(new char[105]);
		String shuzu = new String(new char[105]);
	int i;
	int j;
	zi = new Scanner(System.in).nextLine();
	for (i = 0;i <= zi.length() - 1;i++)
	{
		shuzu = tangible.StringFunctions.changeCharacter(shuzu, i, zi.charAt(i) + zi.charAt(i + 1));
	}
	shuzu = tangible.StringFunctions.changeCharacter(shuzu, i - 1, zi.charAt(0) + zi.charAt(i - 1));
	for (i = 0;i <= zi.length() - 1;i++)
	{
		System.out.printf("%c",shuzu.charAt(i));
	}






	System.in.read();
	System.in.read();

	}
}

