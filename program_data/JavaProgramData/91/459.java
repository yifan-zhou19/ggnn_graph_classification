package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int m;
		String a = new String(new char[100]);
		String c = new String(new char[100]);
		for (i = 0;i < 100;i++)
		{
		   String tempVar = ConsoleInput.scanfRead(null, 1);
		   if (tempVar != null)
		   {
			   a = tangible.StringFunctions.changeCharacter(a, i, tempVar);
		   }
	   if (a.charAt(i) == '\n')
	   {
	   break;
	   }
		}
	for (j = 0;j < i - 1;j++)
	{
		c = tangible.StringFunctions.changeCharacter(c, j, a.charAt(j) + a.charAt(j + 1));
	}
	c = tangible.StringFunctions.changeCharacter(c, i - 1, a.charAt(0) + a.charAt(i - 1));
	for (m = 0;m < i;m++)
	{
		System.out.printf("%c",c.charAt(m));
	}
		  return 0;
	}
}

