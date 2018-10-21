package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		  String s = new String(new char[90]);
		  int i;
		  int n;
		  int j;

		  String tempVar = ConsoleInput.scanfRead();
		  if (tempVar != null)
		  {
			  n = Integer.parseInt(tempVar);
		  }
		  s = new Scanner(System.in).nextLine();
		  for (i = 0;i < n;i++)
		  {
			  s = new Scanner(System.in).nextLine();
			  if ((s.charAt(0) == '_') || (s.charAt(0) >= 'a' && s.charAt(0) <= 'z') || (s.charAt(0) >= 'A' && s.charAt(0) <= 'Z'))
			  {
				  for (j = 1;j < s.length();j++)
				  {
					  if ((s.charAt(j) == '_') || (s.charAt(j) >= 'a' && s.charAt(j) <= 'z') || (s.charAt(j) >= 'A' && s.charAt(j) <= 'Z') || (s.charAt(j) >= '0' && s.charAt(j) <= '9'))
					  {
						  continue;
					  }
					  else
					  {
						  break;
					  }
				  }
				  if (j == s.length())
				  {
					  System.out.print("1\n");
				  }
				  else
				  {
					  System.out.print("0\n");
				  }
			  }
			  else
			  {
				  System.out.print("0\n");
			  }
		  }
	}


}

