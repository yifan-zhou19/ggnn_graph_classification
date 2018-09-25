package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[1000]);
		String b = new String(new char[1000]);
		int r;
		int i;
		int l;
		int m;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = tempVar.charAt(0);
		}
		l = a.length();
		if (l == 1)
		{
		System.out.printf("0\n%d",a.charAt(0) - '0');
		}
		else if (l == 2 && a.charAt(0) - '0' == 1 && a.charAt(1) - '0' < 3)
		{
		System.out.printf("0\n%d",10 + a.charAt(1) - '0');
		}
		else
		{
						if (a.charAt(0) - '0' == 1 && a.charAt(1) - '0' <= 2)
						{
							m = (a.charAt(0) - '0') * 100 + (a.charAt(1) - '0') * 10 + a.charAt(2) - '0';
							r = m % 13;
							b = tangible.StringFunctions.changeCharacter(b, 0, m / 13 + '0');
								for (i = 3;i < l;i++)
								{
								   m = r * 10 + a.charAt(i) - '0';
								   r = m % 13;
								   b = tangible.StringFunctions.changeCharacter(b, i - 2, m / 13 + '0');
								}
							 b = tangible.StringFunctions.changeCharacter(b, l - 2, '\0');
						}
						else
						{
							 m = (a.charAt(0) - '0') * 10 + a.charAt(1) - '0';
							 r = m % 13;
							 b = tangible.StringFunctions.changeCharacter(b, 0, m / 13 + '0');
								 for (i = 2;i < l;i++)
								 {
								   m = r * 10 + a.charAt(i) - '0';
								   r = m % 13;
								   b = tangible.StringFunctions.changeCharacter(b, i - 1, m / 13 + '0');
								 }
							  b = tangible.StringFunctions.changeCharacter(b, l - 1, '\0');
						}
					   System.out.printf("%s\n%d",b,r);
		}
	   System.in.read();
	   System.in.read();



	}

}

