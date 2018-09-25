package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n = 0;
		int i;
		int t;
		String c = new String(new char[10001]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			c = tempVar.charAt(0);
		}
		for (i = 0;;i++)
		{
					 if (c.charAt(i) != '\0')
					 {
								 n++;
					 }
					 else
					 {
						 break;
					 }
		}
		if (n % 2 == 0)
		{
				  for (i = 0;i < n / 2;i++)
				  {
									 t = c.charAt(i);
									 c = tangible.StringFunctions.changeCharacter(c, i, c.charAt(n - 1 - i));
									 c = tangible.StringFunctions.changeCharacter(c, n - 1 - i, t);
				  }
		}
		else
		{
			for (i = 0;i < (n - 1) / 2;i++)
			{
									 t = c.charAt(i);
									 c = tangible.StringFunctions.changeCharacter(c, i, c.charAt(n - 1 - i));
									 c = tangible.StringFunctions.changeCharacter(c, n - 1 - i, t);
			}
		}
		System.out.printf("%s",c);
		System.in.read();
		System.in.read();
		System.in.read();
	}

}

