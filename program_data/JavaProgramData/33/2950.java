package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		String a = new String(new char[1000]);
		int n;
		int i;
		int p;
		int x;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (p = 1;p <= n;p++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a = tempVar2.charAt(0);
			}
	System.out.print("\n");
			for (i = 0;a.charAt(i) > 0;i++)
			{
				if (a.charAt(i) == 65)
				{
					a = tangible.StringFunctions.changeCharacter(a, i, 84);
					System.out.printf("%c",a.charAt(i));
				}
				else if (a.charAt(i) == 84)
				{
					a = tangible.StringFunctions.changeCharacter(a, i, 65);
					System.out.printf("%c",a.charAt(i));

				}
				if (a.charAt(i) == 71)
				{
					a = tangible.StringFunctions.changeCharacter(a, i, 67);
					System.out.printf("%c",a.charAt(i));
				}

				else if (a.charAt(i) == 67)
				{
					a = tangible.StringFunctions.changeCharacter(a, i, 71);
					System.out.printf("%c",a.charAt(i));

				}

			}
		}



	}


}

