package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int len;
		String a = new String(new char[33]);
		String b = new String(new char[33]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
						 len = 0;
						 String tempVar2 = ConsoleInput.scanfRead();
						 if (tempVar2 != null)
						 {
							 a = tempVar2.charAt(0);
						 }
						 len = a.length();
						 if (a.charAt(len - 1) == 'r')
						 {
										   for (j = 0;j < len - 2;j++)
										   {
																b = tangible.StringFunctions.changeCharacter(b, j, a.charAt(j));
										   }
										   b = tangible.StringFunctions.changeCharacter(b, len - 2, '\0');
						 }
						 if (a.charAt(len - 1) == 'y')
						 {
										   for (j = 0;j < len - 2;j++)
										   {
																b = tangible.StringFunctions.changeCharacter(b, j, a.charAt(j));
										   }
										   b = tangible.StringFunctions.changeCharacter(b, len - 2, '\0');
						 }
						 if (a.charAt(len - 1) == 'g')
						 {
										   for (j = 0;j < len - 3;j++)
										   {
																b = tangible.StringFunctions.changeCharacter(b, j, a.charAt(j));
										   }
										   b = tangible.StringFunctions.changeCharacter(b, len - 3, '\0');
						 }
						 System.out.printf("%s\n",b);
		}
		return 0;
	}

}

