package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String s = new String(new char[100]);
		String yuan = new String(new char[100]);
		String xin = new String(new char[100]);
		int i = 0;
		int j = 0;
		int len;
		int lenyuan;
		int lenxin;
		s = new Scanner(System.in).nextLine();
		yuan = new Scanner(System.in).nextLine();
		xin = new Scanner(System.in).nextLine();
		len = s.length();
		lenyuan = yuan.length();
		lenxin = xin.length();
		for (i = 0;i < len;i++)
		{
			if (s.charAt(i) == yuan.charAt(0) && s.charAt(lenyuan + i - 1) == yuan.charAt(lenyuan - 1))
			{
				for (j = 0;j < lenxin;j++)
				{
					s = tangible.StringFunctions.changeCharacter(s, i + j, xin.charAt(j));
				}
				break;
			}
		}
		System.out.printf("%s\n",s);


		return 0;
	}
}

