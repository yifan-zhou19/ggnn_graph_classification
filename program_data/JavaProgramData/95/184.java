package <missing>;

public class GlobalMembers
{
	public static int f(int x)
	{
	  if (x >= 65 && x <= 90)
	  {
		  x = x + 32;
	  }
	  return (x);
	}
	public static void Main()
	{
	  String str1 = new String(new char[80]);
	  String str2 = new String(new char[80]);
	  int i;
	  str1 = new Scanner(System.in).nextLine();
	  str2 = new Scanner(System.in).nextLine();
	  for (i = 0;i <= 79;i++)
	  {
		str1 = tangible.StringFunctions.changeCharacter(str1, i, f(str1.charAt(i)));
		str2 = tangible.StringFunctions.changeCharacter(str2, i, f(str2.charAt(i)));
	  }
	  if (strcmp(str1,str2) > 0)
	  {
		  System.out.print(">");
	  }
	  else if (strcmp(str1,str2) < 0)
	  {
		  System.out.print("<");
	  }
	  else
	  {
		  System.out.print("=");
	  }
	}
}

