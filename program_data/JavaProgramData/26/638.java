package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
	  int p = 0;
	  char a = 'a';

	  for (;a != '\n';)
	  {
		  String tempVar = ConsoleInput.scanfRead(null, 1);
		  if (tempVar != null)
		  {
			  a = tempVar.charAt(0);
		  }
		  if (a != ' ')
		  {
			  System.out.printf("%c",a);
			  p = 0;
		  }
		  else if (a == ' ' && p == 0)
		  {
			  p = 1;
			  System.out.printf("%c",a);
		  }
		  else if (a == ' ' && p == 1)
		  {
			  continue;
		  }
	  }

	}
}

