package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		  int a;
		  int b;
		  int c;
		  int d;
		  int e;
		  int i;
		  String f = new String(new char[1000]);
		  String g = new String(new char[1000]);
		  String tempVar = ConsoleInput.scanfRead();
		  if (tempVar != null)
		  {
			  f = tempVar.charAt(0);
		  }
		  a = f.length();
		  if (a == 1)
		  {
				   System.out.print("0\n");
				   System.out.printf("%s",f);
		  }
		  else
		  {
		  for (i = 0;i < a;i++)
		  {
			  f = tangible.StringFunctions.changeCharacter(f, i, f.charAt(i) - '0');
		  }
		  b = f.charAt(0);
		  for (i = 0;i < a - 1;i++)
		  {
			  b = b * 10 + f.charAt(i + 1);
			  g = tangible.StringFunctions.changeCharacter(g, i, b / 13);
			  b = b % 13;
		  }
		  if (g.charAt(0) == 0 && a > 2)
		  {
					  for (i = 0;i < a - 1;i++)
					  {
						  g = tangible.StringFunctions.changeCharacter(g, i, g.charAt(i + 1));
					  }
					  g = tangible.StringFunctions.changeCharacter(g, i - 1, '\0');
					  for (i = 0;i < a - 2;i++)
					  {
						  g = tangible.StringFunctions.changeCharacter(g, i, g.charAt(i) + '0');
					  }
		  }
		  else if (g.charAt(0) == 0 && a <= 2)
		  {
			   g = tangible.StringFunctions.changeCharacter(g, 0, 0 + '0');
			   g = tangible.StringFunctions.changeCharacter(g, 1, '\0');
		  }
		  else
		  {
			  g = tangible.StringFunctions.changeCharacter(g, a - 1, '\0');
			  for (i = 0;i < a - 1;i++)
			  {
				  g = tangible.StringFunctions.changeCharacter(g, i, g.charAt(i) + '0');
			  }
		  }
		  System.out.printf("%s\n",g);
		  System.out.printf("%d\n",b);
		  }
		  System.in.read();
		  System.in.read();
	}





}

