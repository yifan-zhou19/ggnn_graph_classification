package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		final String x = "er";
		final String y = "ly";
		final String z = "ing";
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
						String a = new String(new char[100]);
						String b = new String(new char[3]);
						String c = new String(new char[4]);
						String tempVar2 = ConsoleInput.scanfRead();
						if (tempVar2 != null)
						{
							a = tempVar2.charAt(0);
						}
						int j;
						int k;
						for (j = a.length() - 2,k = 0;j < a.length(),k < 2;j++,k++)
						{
														   b = tangible.StringFunctions.changeCharacter(b, k, a.charAt(j));
						}
						b = b.substring(0, 2);
						if (strcmp(b,x) == 0 || strcmp(b,y) == 0)
						{
										  for (j = 0;j < a.length() - 2;j++)
										  {
										  System.out.printf("%c",a.charAt(j));
										  }
										  System.out.print("\n");
										  continue;
						}
						for (j = a.length() - 3,k = 0;j <= a.length() - 1,k < 3;j++,k++)
						{
														   c = tangible.StringFunctions.changeCharacter(c, k, a.charAt(j));
						}
						c = c.substring(0, 3);
						  if (strcmp(c,z) == 0)
						  {
										  for (j = 0;j < a.length() - 3;j++)
										  {
										  System.out.printf("%c",a.charAt(j));
										  }
										  System.out.print("\n");
										  continue;
						  }
		}
		return 0;
	}

}

