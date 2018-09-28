package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	  String v = new String(new char[100]);
	  String c = new String(new char[100]);
	 v = new Scanner(System.in).nextLine();
	  for (int i = 0;i <= v.length() - 1;i++)
	  {
		if (i == v.length() - 1)
		{
		   c = tangible.StringFunctions.changeCharacter(c, i, v.charAt(i) + v.charAt(0));
		}
		else
		{
		  c = tangible.StringFunctions.changeCharacter(c, i, v.charAt(i) + v.charAt(i + 1));
		}
	  }
	for (int j = 0;j <= v.length() - 1;j++)
	{
	 System.out.printf("%c",c.charAt(j));
	}
	int u;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		u = Integer.parseInt(tempVar);
	}
	   return 0;
	}

}

