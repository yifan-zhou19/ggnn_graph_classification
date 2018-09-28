package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
	  String str = new String(new char[200]);
	  int i;
	  int j;
	  str = new Scanner(System.in).nextLine();
	  for (j = 0,i = 0;str.charAt(i) != '\0';i++)
	  {
		 if (str.charAt(i) != ' ' || (j != 0 && str.charAt(j - 1) != ' '))
		 {
			str = tangible.StringFunctions.changeCharacter(str, j, str.charAt(i));
			j++;
		 }
	  }
	  str = tangible.StringFunctions.changeCharacter(str, j, '\0');
	  System.out.printf("%s",str);
	}
}

