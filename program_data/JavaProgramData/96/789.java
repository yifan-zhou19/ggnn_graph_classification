package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[101]);
	int l;
	int bc;
	int s;
	int ys;
	a = new Scanner(System.in).nextLine();
	l = a.length();
	if (l == 1)
	{
			 bc = (a.charAt(0) - '0');
			System.out.printf("0\n%d",bc);
	}
	if (l == 2)
	{
	 bc = (a.charAt(0) - '0') * 10 + a.charAt(1) - '0';
	 s = bc / 13;
	 ys = bc % 13;
			 System.out.printf("%d",s);
			 System.out.printf("\n%d",ys);
	}
	if (l > 2)
	{
	 bc = (a.charAt(0) - '0') * 10 + a.charAt(1) - '0';
	 if (bc > 13)
	 {
			 s = bc / 13;
			  ys = bc % 13;
			  System.out.printf("%d",s);
			  a = tangible.StringFunctions.changeCharacter(a, 0, ys / 10 + '0');
			  a = tangible.StringFunctions.changeCharacter(a, 1, ys % 10 + '0');
	 }
	for (int i = 1;i < l - 1;i++)
	{
			bc = (a.charAt(i - 1) - '0') * 100 + (a.charAt(i) - '0') * 10 + a.charAt(i + 1) - '0';
			s = bc / 13;
			ys = bc % 13;
			System.out.printf("%d",s);
			a = tangible.StringFunctions.changeCharacter(a, i, ys / 10 + '0');
			a = tangible.StringFunctions.changeCharacter(a, i + 1, ys % 10 + '0');
	}
	System.out.printf("\n%d",ys);
	}


		return 0;
	}

}

