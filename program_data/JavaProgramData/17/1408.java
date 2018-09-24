package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	   int i;
	   int len;
	   int j;
	   int m = 0;
	   int max;
	   String ch = new String(new char[105]);
	   String s = new String(new char[105]);
	   String str = new String(new char[105]);
	   while (scanf("%s",ch) != EOF)
	   {
		   int m = 0;
	   s = ch;
	   str = ch;
	   len = ch.length();

	   for (i = 0;i < len;i++)
	   {
		  if (ch.charAt(i) != '(' && ch.charAt(i) != ')')
		  {
			  s = tangible.StringFunctions.changeCharacter(s, i, ' ');
		  }
		  else if (ch.charAt(i) == ')') //you  shi
		  {
			 for (j = i - 1;j >= 0;j--)
			 {
				if (ch.charAt(j) == '(')
				{
					m = 1;
				ch = tangible.StringFunctions.changeCharacter(ch, i, ' ');
				s = tangible.StringFunctions.changeCharacter(s, i, ' ');
				s = tangible.StringFunctions.changeCharacter(s, j, ' ');
				ch = tangible.StringFunctions.changeCharacter(ch, j, ' ');
				break;
				}
				else
				{
					continue;
				}
			 }
			if (m == 0)
			{
				 s = tangible.StringFunctions.changeCharacter(s, i, '?');
			} //zai
		  } //you  zhi
	   }
	   for (i = 0;i < len;i++)
	   {
		  if (s.charAt(i) == '(')
		  {
			  s = tangible.StringFunctions.changeCharacter(s, i, '$');
		  }
		  else if (s.charAt(i) == ')')
		  {
			  s = tangible.StringFunctions.changeCharacter(s, i, '?');
		  }
	   }
	   System.out.printf("%s\n",str);
	   System.out.printf("%s\n",s);
	   }
	return 0;
	}
}

