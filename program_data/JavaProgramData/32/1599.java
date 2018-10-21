package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		 int n;
		 int i;
		 int j;
		 int x;
		 int y;
		 String a = new String(new char[100]);
		 String b = new String(new char[100]);
		 String c = new String(new char[100]);
		 char d;
		 String tempVar = ConsoleInput.scanfRead();
		 if (tempVar != null)
		 {
			 n = Integer.parseInt(tempVar);
		 }
		 for (i = 0;i < n;i++)
		 {
		  String tempVar2 = ConsoleInput.scanfRead();
		  if (tempVar2 != null)
		  {
			  a = tempVar2.charAt(0);
		  }
		  String tempVar3 = ConsoleInput.scanfRead(" ");
		  if (tempVar3 != null)
		  {
			  b = tempVar3.charAt(0);
		  }

		  x = a.length();
		  y = b.length();
		  for (j = 0;j <= (x / 2) - 1;j++)
		  {
				d = a.charAt(j);
				a = tangible.StringFunctions.changeCharacter(a, j, a.charAt(x - 1 - j));
				a = tangible.StringFunctions.changeCharacter(a, x - 1 - j, d);
		  }
		  for (j = 0;j <= (y / 2) - 1;j++)
		  {
				d = b.charAt(j);
				b = tangible.StringFunctions.changeCharacter(b, j, b.charAt(y - 1 - j));
				b = tangible.StringFunctions.changeCharacter(b, y - 1 - j, d);
		  }

		  for (j = 0;j < y;j++)
		  {
			  if (a.charAt(j) >= b.charAt(j))
			  {
				  c = tangible.StringFunctions.changeCharacter(c, j, a.charAt(j) - b.charAt(j) + 48);
			  }
			  else
			  {
				  c = tangible.StringFunctions.changeCharacter(c, j, a.charAt(j) + 10 - b.charAt(j) + 48);
				  a = tangible.StringFunctions.changeCharacter(a, j + 1, a.charAt(j + 1) - 1);
			  }
		  }
		  for (j = y;j < x;j++)
		  {
			 c = tangible.StringFunctions.changeCharacter(c, j, a.charAt(j));
		  }
		  for (j = x;j < 100;j++)
		  {
			 c = c.substring(0, j);
		  }
		  for (j = 0;j <= (x / 2) - 1;j++)
		  {
				d = c.charAt(j);
				c = tangible.StringFunctions.changeCharacter(c, j, c.charAt(x - 1 - j));
				c = tangible.StringFunctions.changeCharacter(c, x - 1 - j, d);
		  }
		  for (j = 0;j < c.length();j++)
		  {
			if (c.charAt(j) != '0')
			{
				break;
			}
		  }
		  for (;j < c.length();j++)
		  {
		   System.out.printf("%c",c.charAt(j));
		  }
		  System.out.print("\n");
		 }
	}

}

