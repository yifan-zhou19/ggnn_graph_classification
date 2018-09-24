package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		while (n > 0)
		{
			String s = new String(new char[104]);
			char start = 0;
			int len = 0;
				s = new Scanner(System.in).nextLine();
				System.out.println(s);
			len = s.length();
				int j;
				for (i = len - 1;i >= 0;i--)
				{
					if (s.charAt(i) == '(')
					{

						for (j = i;j < len;j++)
						{
	if (s.charAt(j) == ')')
	{
		s = tangible.StringFunctions.changeCharacter(s, i, ' ');
		s = tangible.StringFunctions.changeCharacter(s, j, ' ');
		break;
	}
						}
					}
				}
		   for (i = 0;i < len;i++)
		   {
			  if (s.charAt(i) == '(')
			  {
				  System.out.print("$");
			  }
			 else if (s.charAt(i) == ')')
			 {
				  System.out.print("?");
			 }
			  else
			  {
				  System.out.print(" ");
			  }
		   }
		   System.out.print("\n");
			n--;
		}
	}

}

