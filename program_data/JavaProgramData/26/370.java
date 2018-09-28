package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String str = new String(new char[100]);
		int i;
		int l;
		int s;
		int m;
		int j;
		str = new Scanner(System.in).nextLine();
		s = 0;
		l = str.length();
		for (i = 0;i < l - 2;i++)
		{
		for (s = 0;s < l - i;s++)
		{
		if (str.charAt(i) == ' ' && str.charAt(i + 1) == ' ')
		{
		for (j = i + 1;j < l - s + 1;j++)
		{
		str = tangible.StringFunctions.changeCharacter(str, j, str.charAt(j + 1));
		}
		}
		}
		}
		System.out.printf("%s\n",str);
		System.in.read();
		System.in.read();
		System.in.read();
		System.in.read();
		System.in.read();
		System.in.read();
	}
}

