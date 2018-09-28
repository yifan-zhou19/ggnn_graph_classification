package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		  String s = new String(new char[900]);
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
			  j = 0;
			  if ((s.charAt(j) == '_') || (s.charAt(j) >= 'a' && s.charAt(j) <= 'z') || (s.charAt(j) >= 'A' && s.charAt(j) <= 'Z'))
			  {
				  if (s.length() > 0)
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

