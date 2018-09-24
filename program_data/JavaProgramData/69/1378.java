package <missing>;

public class GlobalMembers
{
//C++ TO JAVA CONVERTER NOTE: This was formerly a static local variable declaration (not allowed in Java):
private static String Main_x = new String(new char[252]);
//C++ TO JAVA CONVERTER NOTE: This was formerly a static local variable declaration (not allowed in Java):
private static String Main_y = new String(new char[252]);
//C++ TO JAVA CONVERTER NOTE: This was formerly a static local variable declaration (not allowed in Java):
private static String Main_z = new String(new char[252]);
	public static int Main()
	{
	String p;
	int a;
	int b;
	int c;
	int i;
	int k = 0;
	//C++ TO JAVA CONVERTER NOTE: This static local variable declaration (not allowed in Java) has been moved just prior to the method:
	//static char x[252];
	//C++ TO JAVA CONVERTER NOTE: This static local variable declaration (not allowed in Java) has been moved just prior to the method:
	//static char y[252];
	//C++ TO JAVA CONVERTER NOTE: This static local variable declaration (not allowed in Java) has been moved just prior to the method:
	//static char z[252];
	Main_x = new Scanner(System.in).nextLine();
	Main_y = new Scanner(System.in).nextLine();
	a = Main_x.length();
	b = Main_y.length();
	for (i = a - 1;i >= 0;i--)
	{
	   Main_x = tangible.StringFunctions.changeCharacter(Main_x, i + 251 - a, Main_x.charAt(i));
	}
	for (i = 250 - a;i >= 0;i--)
	{
	   Main_x = tangible.StringFunctions.changeCharacter(Main_x, i, '0');
	}
	for (i = b - 1;i >= 0;i--)
	{
	   Main_y = tangible.StringFunctions.changeCharacter(Main_y, i + 251 - b, Main_y.charAt(i));
	}
	for (i = 250 - b;i >= 0;i--)
	{
	   Main_y = tangible.StringFunctions.changeCharacter(Main_y, i, '0');
	}
	for (i = 250;i >= 0;i--)
	{
		  c = Main_x.charAt(i) + Main_y.charAt(i) - '0'-'0' + k;
		  if (c <= 9)
		  {
			 Main_z = tangible.StringFunctions.changeCharacter(Main_z, i, c + '0');
			 k = 0;
		  }
		 if (c > 9)
		 {
			 Main_z = tangible.StringFunctions.changeCharacter(Main_z, i, c % 10 + '0');
			 k = 1;
		 }
	}
	{
		for (i = 0;i <= 250;i++)
		{
		  if (Main_z.charAt(i) != '0')
		  {
			  p = Main_z.charAt(i);
			  break;
		  }
		}
	if (i == 251)
	{
	  System.out.print("0");
	}
	else
	{
	System.out.printf("%s",p);
	}
}
	}

}

