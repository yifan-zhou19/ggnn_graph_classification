package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int i;
		int j;
		String a = new String(new char[30]);
		String b = new String(new char[30]);
		a = new Scanner(System.in).nextLine();
		for (i = 0;a.charAt(i) != '\0';i++)
		{
		if (a.charAt(i) > 47 && a.charAt(i) < 58)
		{
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
			memset(b,0,20);
			for (j = 0;a.charAt(i) > 47 && a.charAt(i) < 58;i++, j++)
			{
			b = tangible.StringFunctions.changeCharacter(b, j, a.charAt(i));
			}
			System.out.println(b);

		}
		}
	}
}

