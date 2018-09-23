package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	  String a = new String(new char[7]);
	  char i;
	  char j;
	  String tempVar = ConsoleInput.scanfRead();
	  if (tempVar != null)
	  {
		  a = tempVar.charAt(0);
	  }
	  for (i = 1; a.charAt(i) != '\0'; i++)
	  {
		 j = i;
	  }

	  for (i = j; i >= 0; i--)
	  {
		 System.out.printf("%c",a.charAt(i));
	  }

	  return 0;
	}


}

