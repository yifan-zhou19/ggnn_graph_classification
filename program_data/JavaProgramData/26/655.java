package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[150]);
		String b = new String(new char[150]);
		char s = 0;
	a = new Scanner(System.in).nextLine();
	int l = a.length();
	for (int i = 0;i <= l - 1;i++)
	{
	  if (a.charAt(i) != ' ')
	  {
		  s++;
		  b = tangible.StringFunctions.changeCharacter(b, s, i);
	  }
	  if (a.charAt(i) == ' ')
	  {
		  s++;
		  b = tangible.StringFunctions.changeCharacter(b, s, i);
	  while (a.charAt(i + 1) == ' ')
	  {
		  i++;
	  }
	  }
	}
	for (int i = 1;i <= s;i++)
	{
	  int j = b.charAt(i);
	  System.out.print(a.charAt(j));
	  //while (a[j]!=' '){j++;cout<<a[j];}
	}
	return 0;
	}

}

