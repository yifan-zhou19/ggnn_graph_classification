package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		  String x = new String(new char[1001]);
		  String z = new String(new char[1001]);
		  int i;
		  int n = 1;
		  for (i = 0;i < 1001;i++)
		  {
			  x = tangible.StringFunctions.changeCharacter(x, i, '\0');
			  z = tangible.StringFunctions.changeCharacter(z, i, '\0');
		  }
		  String tempVar = ConsoleInput.scanfRead();
		  if (tempVar != null)
		  {
			  x = tempVar.charAt(0);
		  }
		  //printf("%c\n",xz[0]);
		  for (i = 0;x.charAt(i) != '\0';i++)
		  {
			  if (x.charAt(i) >= 'a' && x.charAt(i) <= 'z')
			  {
			  z = tangible.StringFunctions.changeCharacter(z, i, x.charAt(i) - 'a'+'A');
			  }
			  else
			  {
			  z = tangible.StringFunctions.changeCharacter(z, i, x.charAt(i));
			  }
		  }
		  for (i = 0;z.charAt(i) != '\0';i++)
		  {
			  if (z.charAt(i) == z.charAt(i + 1))
			  {
			  n++;
			  }
			  else
			  {
				  System.out.printf("(%c,%d)",z.charAt(i),n);
			  n = 1;
			  }
		  }
		  System.in.read();
		  System.in.read();
		  System.in.read();
	}
}

