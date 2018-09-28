package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String str = new String(new char[20]);
		String t = new String(new char[20]);
		int len;
		int i;
		int n;
		int j;
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
				str = tempVar2.charAt(0);
			}
			len = str.length();
			if (str.charAt(len - 1) == 'r')
			{
				for (i = 0;i < len - 2;i++)
				{
					t = tangible.StringFunctions.changeCharacter(t, i, str.charAt(i));
				}
				t = tangible.StringFunctions.changeCharacter(t, i, '\0');
			}
			if (str.charAt(len - 1) == 'g')
			{
				for (i = 0;i < len - 3;i++)
				{
					t = tangible.StringFunctions.changeCharacter(t, i, str.charAt(i));
				}
				t = tangible.StringFunctions.changeCharacter(t, i, '\0');
			}
			if (str.charAt(len - 1) == 'y')
			{
				for (i = 0;i < len - 2;i++)
				{
					t = tangible.StringFunctions.changeCharacter(t, i, str.charAt(i));
				}
				t = tangible.StringFunctions.changeCharacter(t, i, '\0');
			}
			System.out.printf("%s\n",t);
		}

	}
}

