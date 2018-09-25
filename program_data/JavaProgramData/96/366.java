package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String beichushu = new String(new char[101]);
		String shang = new String(new char[100]);
		final int chushu = 13;
		int a;
		int b;
		int i;
		int c;
		int d;
		beichushu = new Scanner(System.in).nextLine();
		a = beichushu.length();
	if (a == 1)
	{
		System.out.printf("0\n%s",beichushu);
	}
	else if (a == 2)
	{
		c = ((beichushu.charAt(0) - '0') * 10 + beichushu.charAt(1) - '0') / chushu;
						  d = ((beichushu.charAt(0) - '0') * 10 + beichushu.charAt(1) - '0') % chushu;
						  System.out.printf("%d\n%d",c,d);
	}
	else
	{
		b = (beichushu.charAt(0) - '0') * 10 + (beichushu.charAt(1) - '0');
		if (b < 13)
		{
				for (i = 0;i <= a - 3;i++)
				{
					b = b * 10 + beichushu.charAt(i + 2) - '0';
					shang = tangible.StringFunctions.changeCharacter(shang, i, b / chushu + '0');
					b = b % chushu;
				}

				shang = tangible.StringFunctions.changeCharacter(shang, a - 2, '\0');
				System.out.printf("%s\n%d",shang,b);
		}
		 else
		 {
			 for (i = 0;i <= a - 3;i++)
			 {
				 shang = tangible.StringFunctions.changeCharacter(shang, i, b / chushu + '0');
				 b = b % chushu;
				 b = b * 10 + beichushu.charAt(i + 2) - '0';
			 }
			 shang = tangible.StringFunctions.changeCharacter(shang, a - 2, b / chushu + '0');
			 b = b % chushu;
			 shang = tangible.StringFunctions.changeCharacter(shang, a - 1, '\0');
			 System.out.printf("%s\n%d",shang,b);
		 }
	}
	return 0;
	}
}

