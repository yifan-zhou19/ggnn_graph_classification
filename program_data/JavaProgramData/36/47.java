package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	  String a = new String(new char[500]);
	  String b = new String(new char[500]);
	  int i;
	  for (i = 0;i <= 499;i++)
	  {
		a = tangible.StringFunctions.changeCharacter(a, i, '\0');
		b = tangible.StringFunctions.changeCharacter(b, i, '\0');
	  }
	  String tempVar = ConsoleInput.scanfRead();
	  if (tempVar != null)
	  {
		  a = tempVar.charAt(0);
	  }
	  String tempVar2 = ConsoleInput.scanfRead(" ");
	  if (tempVar2 != null)
	  {
		  b = tempVar2.charAt(0);
	  }
	  if (a.length() == b.length())
	  {
		int j;
		for (i = 0;a.charAt(i) != '\0';i++)
		{
		  for (j = 0;j < 500;j++)
		  {
			  if (a.charAt(i) == b.charAt(j))
			  {
				b = tangible.StringFunctions.changeCharacter(b, j, '\0');
				break;
			  }
		  }
		}
	   if (b.length() == 0)
	   {
	   System.out.print("YES");
	   }
	   else
	   {
		   System.out.print("NO");
	   }
	  }
	  else
	  {
		  System.out.print("NO");
	  }
	return 0;
	}
}

