package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		char mid;
		String a = new String(new char[100]);
		String b = new String(new char[100]);
		int i;
		int j;
		int stop;
		int length;
		int dif;
		a = new Scanner(System.in).nextLine();
		length = a.length();
		for (i = 0;i < length - 1;i++)
		{
			b = tangible.StringFunctions.changeCharacter(b, i, a.charAt(i) + a.charAt(i + 1));
		}
		b = tangible.StringFunctions.changeCharacter(b, length - 1, a.charAt(0) + a.charAt(length - 1));
		b = b.substring(0, length);
		System.out.printf("%s",b);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			stop = Integer.parseInt(tempVar);
		}
		return 0;
	}
}

