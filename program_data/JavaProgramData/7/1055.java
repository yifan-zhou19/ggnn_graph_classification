package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		 int a;
		 int b;
		 int i;
		 int j;
		 int count = 0;
		 int k;
		 String string = new String(new char[256]);
		 String substring = new String(new char[256]);
		 String replacement = new String(new char[256]);
		 String czy = new String(new char[256]);
		 String cai = new String(new char[256]);
		 String = new Scanner(System.in).nextLine();
		 substring = new Scanner(System.in).nextLine();
		 replacement = new Scanner(System.in).nextLine();
		 a = String.length();
		 b = substring.length();
		 for (i = 0;i < a;i++)
		 {
			  if (String[i] == substring.charAt(0))
			  {
										  for (j = 0;j < b;j++)
										  {
										  czy = tangible.StringFunctions.changeCharacter(czy, j, string.charAt(i + j));
										  }
										  if (strcmp(czy,substring) == 0)
										  {
																	  count = 1;
																	  for (k = 0;k < i;k++)
																	  {
																	  cai = tangible.StringFunctions.changeCharacter(cai, k, string.charAt(k));
																	  }
																	  for (k = i;k < i + b;k++)
																	  {
																	  cai = tangible.StringFunctions.changeCharacter(cai, k, replacement.charAt(k - i));
																	  }
																	  for (k = i + b;k < a;k++)
																	  {
																	  cai = tangible.StringFunctions.changeCharacter(cai, k, string.charAt(k));
																	  }
										  }
										  if (count == 1)
										  {
										  break;
										  }
			  }
		 }
		 if (count == 1)
		 {
		 System.out.println(cai);
		 }
		 else
		 {
		 System.out.println(String);
		 }
	}






}

