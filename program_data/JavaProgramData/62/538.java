package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[100]);
		int[] b = new int[100];
		int i;
		int j;
		String tempVar = ConsoleInput.scanfRead(null, 1);
		if (tempVar != null)
		{
			a = tangible.StringFunctions.changeCharacter(a, 0, tempVar);
		}
		for (i = 1;;i++)
		{
				String tempVar2 = ConsoleInput.scanfRead(null, 1);
				if (tempVar2 != null)
				{
					a = tangible.StringFunctions.changeCharacter(a, i, tempVar2);
				}
				if (a.charAt(i) == ' ')
				{
						   if (a.charAt(i - 1) == ' ')
						   {
									   b[i] = 1;
						   }
				}
				if (a.charAt(i) == '\n')
				{
				break;
				}
		}
		for (j = 0;j < i;j++)
		{
						 if (b[j] == 0)
						 {
									 System.out.printf("%c",a.charAt(j));
						 }
		}

		 String tempVar3 = ConsoleInput.scanfRead();
		 if (tempVar3 != null)
		 {
			 i = Integer.parseInt(tempVar3);
		 }

	return 0;
	}

}

