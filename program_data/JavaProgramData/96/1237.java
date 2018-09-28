package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int k;
		int a;
		int l;
		int c;
		String s = new String(new char[101]);
		String r = new String(new char[101]);
		s = new Scanner(System.in).nextLine();
		l = s.length();
		if (l == 2)
		{
		 a = (s.charAt(0) - '0') * 10 + s.charAt(1) - '0';
		System.out.printf("%d\n%d",a / 13,a % 13);
		}
		if (l == 1)
		{
		System.out.printf("0\n%c",s.charAt(0));
		}
		if (l >= 3)
		{
		 c = s.charAt(0) - '0';
		 if (c * 10 + s.charAt(1) - '0' >= 13)
		 {
		   for (i = 0;s.charAt(i + 1) != '\0';i++)
		   {
			 a = c * 10 + s.charAt(i + 1) - '0';
			 r = tangible.StringFunctions.changeCharacter(r, i, a / 13 + '0');
			 c = a % 13;
		   }
		   r = tangible.StringFunctions.changeCharacter(r, i, '\0');
		   System.out.printf("%s\n%d",r,c);
		 }
		   else
		   {
			  c = c * 10 + s.charAt(1) - '0';
			for (i = 0;s.charAt(i + 2) != '\0';i++)
			{
			 a = c * 10 + s.charAt(i + 2) - '0';
			 r = tangible.StringFunctions.changeCharacter(r, i, a / 13 + '0');
			 c = a % 13;
			}
		   r = tangible.StringFunctions.changeCharacter(r, i, '\0');
		   System.out.printf("%s\n%d",r,c);
		   }
		}
	}


}

