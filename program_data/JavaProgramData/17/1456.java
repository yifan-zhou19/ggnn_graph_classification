package <missing>;

public class GlobalMembers
{
	public static int f1(String zichuan, int changdu)
	{
		int i;
		int n;
		for (i = changdu - 1;i >= 0;i--)
		{
			if (zichuan[i].equals('('))
			{
				n = i + 1;
			   while (!zichuan[n].equals(')'))
			   {
				   n = n + 1;
			   }
			   if (n < changdu)
			   {
				   zichuan[i] = ' ';
				   zichuan[n] = ' ';
			   }
			}
		}
		return 0;
	}

	public static int Main()
	{
		int i = 0;
		int changdu;
		String s = new String(new char[100]);
	  while (gets(s))
	  {
	  changdu = s.length();
	  System.out.printf("%s\n",s);
	  f1(s, changdu);
	  for (i = 0;i < changdu;i++)
	  {
		 switch (s.charAt(i))
		 {
		 case '(':
			 s = tangible.StringFunctions.changeCharacter(s, i, '$');
			 break;
		 case ')':
			 s = tangible.StringFunctions.changeCharacter(s, i, '?');
			 break;
		 default :
			 s = tangible.StringFunctions.changeCharacter(s, i, ' ');
			 break;
		 }
	  }
	   for (i = 0;i < changdu;i++)
	   {
		   System.out.printf("%c",s.charAt(i));
	   }
	   System.out.print("\n");
	  }
		return 0;

	}

}

