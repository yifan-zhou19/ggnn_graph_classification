package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[251]);
		String b = new String(new char[251]);
		String c = new String(new char[251]);
		int d;
		int x;
		int y;
		int i;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = tempVar.charAt(0);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			b = tempVar2.charAt(0);
		}
		x = a.length();
		y = b.length();
		if (x >= y) //dui qi, qian jia 0
		{
			  for (i = y;i != -1 ;i--)
			  {
				  b = tangible.StringFunctions.changeCharacter(b, i + x - y + 1, b.charAt(i));
			  }
			  for (i = x - y;i != -1;i--)
			  {
				  b = tangible.StringFunctions.changeCharacter(b, i, 48);
			  }
			  for (i = x;i != -1;i--)
			  {
				  a = tangible.StringFunctions.changeCharacter(a, i + 1, a.charAt(i));
			  }
			  a = tangible.StringFunctions.changeCharacter(a, 0, 48);
			  d = x;
		}
		//printf("%s,%s",a,b);
		else if (y > x)
		{
			  for (i = x;i != -1 ;i--)
			  {
				  a = tangible.StringFunctions.changeCharacter(a, i + y - x + 1, a.charAt(i));
			  }
			  for (i = y - x;i != -1;i--)
			  {
				  a = tangible.StringFunctions.changeCharacter(a, i, 48);
			  }
			  for (i = y;i != -1;i--)
			  {
				  b = tangible.StringFunctions.changeCharacter(b, i + 1, b.charAt(i));
			  }
			  b = tangible.StringFunctions.changeCharacter(b, 0, 48);
			  d = y;
		}
		c = tangible.StringFunctions.changeCharacter(c, d + 1, '\0');
		for (i = d;i != -1 ;i--)
		{
			  c = tangible.StringFunctions.changeCharacter(c, i, a.charAt(i) + b.charAt(i) - 96);
			  if (c.charAt(i) >= 10)
			  {
						  c = tangible.StringFunctions.changeCharacter(c, i, c.charAt(i) - 10);
						  a.charAt(i - 1)++;
			  }
			  c = tangible.StringFunctions.changeCharacter(c, i, c.charAt(i) + 48);
		}

		for (;c.charAt(0) == 48;)
		{
			 for (i = 0;;i++)
			 {
						  c = tangible.StringFunctions.changeCharacter(c, i, c.charAt(i + 1));
						  if (c.charAt(i) == '\0')
						  {
						  break;
						  }
			 }
		}
		   if (c.charAt(0) == '\0')
		   {
			   c = tangible.StringFunctions.changeCharacter(c, 0, '0');
		   }
		System.out.printf("%s",c);

	}

}

