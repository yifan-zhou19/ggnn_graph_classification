package <missing>;

public class GlobalMembers
{
//C++ TO JAVA CONVERTER NOTE: This was formerly a static local variable declaration (not allowed in Java):
private static String Main_x1 = new String(new char[1000]);
String x2 = new String(new char[1000]);
	public static int Main()
	{
	//C++ TO JAVA CONVERTER NOTE: This static local variable declaration (not allowed in Java) has been moved just prior to the method:
	//static char x1[1000],x2[1000];
	int i;
	int k;
	Main_x1 = new Scanner(System.in).nextLine();
	x2 = new Scanner(System.in).nextLine();
	for (i = 0;Main_x1.charAt(i) != '\0';i++)
	{
	  if (Main_x1.charAt(i) >= 65 && Main_x1.charAt(i) <= 90)
	  {
		Main_x1 = tangible.StringFunctions.changeCharacter(Main_x1, i, Main_x1.charAt(i) + 32);
	  }
	}
	for (i = 0;x2.charAt(i) != '\0';i++)
	{
	   if (x2.charAt(i) >= 65 && x2.charAt(i) <= 90)
	   {
		x2 = tangible.StringFunctions.changeCharacter(x2, i, x2.charAt(i) + 32);
	   }
	}
	for (i = 0;Main_x1.charAt(i) != '\0' || x2.charAt(i) != '\0';i++)
	{
		if (Main_x1.charAt(i) > x2.charAt(i))
		{
			 System.out.print(">");
		  break;
		}
		else if (Main_x1.charAt(i) == x2.charAt(i))
		{
		   continue;
		}
		else
		{
			System.out.print("<");
			break;
		}
	}
	if (Main_x1.charAt(i) == '\0' && x2.charAt(i) == '\0')
	{
	   System.out.print("=");
	}
	}
}

