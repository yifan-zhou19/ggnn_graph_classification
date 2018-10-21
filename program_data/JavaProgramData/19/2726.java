package <missing>;

public class GlobalMembers
{
	public static String yuan = new String(new char[100000]);
	public static String yao = new String(new char[110]);
	public static String wei = new String(new char[110]);
	public static int yuanlen;
	public static int yaolen;
	public static int weilen;

	public static int Main()
	{
		String s;
		int i;
		int j;
		yuan = new Scanner(System.in).nextLine();
		yao = new Scanner(System.in).nextLine();
		wei = new Scanner(System.in).nextLine();
		s = tangible.StringFunctions.strStr(yuan,yao);
		if (s == null || (s.charAt(-1) != ' ' && s != yuan))
		{
			System.out.println(yuan);
			return 0;
		}
		yuanlen = yuan.length();
		yaolen = yao.length();
		weilen = wei.length();
		while (s != null)
		{
			if (yaolen == weilen)
			{
				for (i = 0;i < yaolen;i++)
				{
					s = tangible.StringFunctions.changeCharacter(s, i, wei.charAt(i));
				}
			}
			if (yaolen > weilen)
			{
				for (i = 0;i < weilen;i++)
				{
					s = tangible.StringFunctions.changeCharacter(s, i, wei.charAt(i));
				}
				while (s.charAt(i + yaolen - weilen) != 0)
				{
					s = tangible.StringFunctions.changeCharacter(s, i, s.charAt(i + yaolen - weilen));
					i++;
				}
				s = s.substring(0, i);
			}
			if (yaolen < weilen)
			{
				for (i = yuanlen - 1;i > yaolen - 1;i--)
				{
					s = tangible.StringFunctions.changeCharacter(s, i + weilen - yaolen, s.charAt(i));
				}
				for (i = 0;i < weilen;i++)
				{
					s = tangible.StringFunctions.changeCharacter(s, i, wei.charAt(i));
				}
			}
			s += weilen;
			s = tangible.StringFunctions.strStr(s,yao);
		}


		System.out.println(yuan);
		return 0;

	}
}

