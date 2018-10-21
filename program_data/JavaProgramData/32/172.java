package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int i;
		int j;
		int len1;
		int len2;
		String a = new String(new char[1000]);
		String b = new String(new char[1000]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a = tempVar2.charAt(0);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				b = tempVar3.charAt(0);
			}
			len1 = a.length();
			len2 = b.length();

			for (j = 0;j < len2;j++)
			{
				if (a.charAt(len1 - 1 - j) - b.charAt(len2 - 1 - j) >= 0)
				{
					a = tangible.StringFunctions.changeCharacter(a, len1 - 1 - j, a.charAt(len1 - 1 - j) - b.charAt(len2 - 1 - j) + '0');
				}

				else if (a.charAt(len1 - 1 - j) - b.charAt(len2 - 1 - j) < 0)
				{
					a = tangible.StringFunctions.changeCharacter(a, len1 - 1 - j, a.charAt(len1 - 1 - j) + 10 - b.charAt(len2 - 1 - j) + '0');
					a = tangible.StringFunctions.changeCharacter(a, len1 - 2 - j, a.charAt(len1 - 2 - j) - 1);
				}
			}
			System.out.printf("%s\n",a);
		}
	}

}

