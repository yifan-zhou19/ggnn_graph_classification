package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		  String a = new String(new char[100]);
		  a = new Scanner(System.in).nextLine();
		  for (int i = 1;i < 100;i++)
		  {
			  if (a.charAt(i) == ' ' && a.charAt(i - 1) == ' ')
			  {
				  for (int j = i;j < 100;j++)
				  {
					  a = tangible.StringFunctions.changeCharacter(a, j, a.charAt(j + 1));
				  }
				  i = i - 1;
			  }
		  }
		  System.out.println(a);
		  System.in.read();
	}

}

