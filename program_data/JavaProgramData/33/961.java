package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int j;
		int i;
		int len;
		int n;
		String a = new String(new char[256]);
		String b = new String(new char[256]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (j = 0;j < n;j++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a = tempVar2.charAt(0);
			}
			len = a.length();
		   for (i = 0;i < len;i++)
		   {
			 switch (a.charAt(i))
			 {
			 case 'A':
				 b = tangible.StringFunctions.changeCharacter(b, i, 'T');
				break;
			 case 'T':
				 b = tangible.StringFunctions.changeCharacter(b, i, 'A');
				break;
			 case 'G':
				 b = tangible.StringFunctions.changeCharacter(b, i, 'C');
				break;
			 case 'C':
				 b = tangible.StringFunctions.changeCharacter(b, i, 'G');
				break;
			 }
		   }
		   for (i = 0;i < len;i++)
		   {
			  System.out.printf("%c",b.charAt(i));
		   }
		   System.out.print("\n");
		}

		return 0;
	}
}

