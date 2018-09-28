package <missing>;

public class GlobalMembers
{
	public static final String c = ""; //c?????s???
	public static final String s = "";
	public static int yu = 0;
	public static int l; //?????
	public static int Main()
	{
		void shang(int,int);
		c = ConsoleInput.readToWhiteSpace(true).charAt(0);
		for (l = 0;c.charAt(l) != '\0';l++)
		{
			;
		}
		shang(0, 0);
		int i;
		int j;
		if (s.charAt(1) == '\0')
		{
			System.out.print(s.charAt(0));
		}
		else if (s.charAt(0) == '0' && s.charAt(1) == '0' && s.charAt(2) == '\0')
		{
			System.out.print(0);
		}
		else
		{
		for (i = 0;;i++)
		{
			if (s.charAt(i) != '0')
			{
				break;
			}
		}
		for (j = i;s.charAt(j) != '\0';j++)
		{
			System.out.print(s.charAt(j));
		}
		}
		System.out.print("\n");
		System.out.print(yu);
		return 0;
	}
	public static void shang(int sw,int k) //??????????????????,???????????
	{
		if (k < l)
		{
		int chu; //????????????
		chu = yu * 10 + (c.charAt(k) - '0');
		k++;
		while (chu < 13)
		{
			if (k == l)
			{
				break;
			}
			chu = chu * 10 + (c.charAt(k) - '0');
			k++;
			s = tangible.StringFunctions.changeCharacter(s, sw, '0');
			sw++;
		}
		s = tangible.StringFunctions.changeCharacter(s, sw, chu / 13 + '0');
		sw++;
		yu = chu % 13;
		shang(sw, k);
		}
	}
}

