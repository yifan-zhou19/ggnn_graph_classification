package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String s1 = new String(new char[20]);
		String s2 = new String(new char[20]);
	  int i;
	  int j;
	  int lab = 0;
	  String tempVar = ConsoleInput.scanfRead();
	  if (tempVar != null)
	  {
		  s1 = tempVar.charAt(0);
	  }
	  String tempVar2 = ConsoleInput.scanfRead(" ");
	  if (tempVar2 != null)
	  {
		  s2 = tempVar2.charAt(0);
	  }
	  if (s1.length() != s2.length())
	  {
		  System.out.print("NO");
	  }
	  else
	  {
	  for (i = 0;i < s1.length();i++)
	  {
			 for (j = 0;j < s1.length();j++)
			 {
			  if (s1.charAt(i) == s2.charAt(j))
			  {
			  s2 = tangible.StringFunctions.changeCharacter(s2, j, '\0');
			  lab = 1;
			  break;
			  }
			 }
			  if (lab == 0)
			  {
				  System.out.print("NO");
				  lab = 1;
				  break;
			  }
			  lab = 0;
	  }


	  if (lab == 0)
	  {
		  System.out.print("YES");
	  }
	  }
	return 0;
	}
}

