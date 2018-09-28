package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String num = new String(new char[110]);
		String shang = new String(new char[110]);
		int yushu;
		int i;
		int j;
		int m;
		int n;
		num = new Scanner(System.in).nextLine();
		j = num.length();
		yushu = num.charAt(0) - '0';
		if (j == 1)
		{
			m = num.charAt(0) - '0';
			shang = tangible.StringFunctions.changeCharacter(shang, 0, m / 13 + '0');
			shang = tangible.StringFunctions.changeCharacter(shang, 1, '\0');
			yushu = m;
		}
		if (j == 2)
		{
			m = (num.charAt(0) - '0') * 10 + num.charAt(1) - '0';
			shang = tangible.StringFunctions.changeCharacter(shang, 0, m / 13 + '0');
			shang = tangible.StringFunctions.changeCharacter(shang, 1, '\0');
			yushu = m % 13;
		}
		if (j >= 3)
		{
			m = yushu * 10 + num.charAt(1) - '0';
			if (m >= 13)
			{
			for (i = 1;i <= j - 1;i++)
			{
				m = yushu * 10 + num.charAt(i) - '0';
				yushu = m % 13;
				shang = tangible.StringFunctions.changeCharacter(shang, i - 1, m / 13 + '0');
			}
			shang = tangible.StringFunctions.changeCharacter(shang, j - 1, '\0');
			}
			else
			{
				yushu = yushu * 10 + num.charAt(1) - '0';
				for (i = 2;i <= j - 1;i++)
				{
					m = yushu * 10 + num.charAt(i) - '0';
					yushu = m % 13;
					shang = tangible.StringFunctions.changeCharacter(shang, i - 2, m / 13 + '0');
				}
				shang = tangible.StringFunctions.changeCharacter(shang, j - 2, '\0');
			}
		}

		System.out.println(shang);
		System.out.printf("%d",yushu);
	}

}

