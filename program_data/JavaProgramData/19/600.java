package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String s1 = new String(new char[100]);
		String s2 = new String(new char[100]);
		String s3 = new String(new char[100]);
		String p = new String(new char[100]);
		s1 = new Scanner(System.in).nextLine();
		s2 = new Scanner(System.in).nextLine();
		s3 = new Scanner(System.in).nextLine();
		s1 += " ";
		int len;
		int i;
		int j;
		int n = 0;
		int y;
		len = s1.length();
		for (i = 0;i < len;i++)
		{
			if (s1.charAt(i) == ' ')
			{
				n++;
			}
		}
		int t = 0;
		for (y = 0;y < n;y++)
		{
		   for (i = t,j = 0;i < len;i++,j++)
		   {
			  if (s1.charAt(i) != ' ')
			  {
				 p = tangible.StringFunctions.changeCharacter(p, j, s1.charAt(i));
			  }
			  else
			  {
				   p = tangible.StringFunctions.changeCharacter(p, j, '\0');
				   t = i + 1;
				   break;
			  }
		   }
		   if (strcmp(p,s2) == 0)
		   {
			   p = s3;
		   }
		   System.out.printf("%s",p);
		   if (y < n - 1)
		   {
			   System.out.print(" ");
		   }

		}

	}

}

