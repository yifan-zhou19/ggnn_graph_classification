package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		char a = ' ';
		char b = ' ';
	 int i;
	for (i = 1;i < 100;i++)
	{
		 a = b;
	  String tempVar = ConsoleInput.scanfRead(null, 1);
	  if (tempVar != null)
	  {
		  b = tempVar.charAt(0);
	  }
	  if (b == ' ' && a == ' ')
	  {
		  continue;
	  }
	  else
	  {
		  System.out.printf("%c", b);
	  }
	  if (b == '.')
	  {
		  break;
	  }
	}
	}
}

