package <missing>;

public class GlobalMembers
{
	/* Note:Your choice is C IDE */
	public static void Main()
	{
		String str = new String(new char[30]);
		String substr = new String(new char[4]);
		char max;
		int i;
		int len;
		int num;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			str = tempVar.charAt(0);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			substr = tempVar2.charAt(0);
		}
		while (str.charAt(0) != '0')
		{
			len = str.length();
			for (i = 0,max = str.charAt(0);i < len;i++)
			{
				if (str.charAt(i) > max)
				{
					max = str.charAt(i);
				}
			}
			for (i = 0;i < len;i++)
			{
				if (str.charAt(i) == max)
				{
			num = i;
			break;
				}
			}
			for (i = 0;i < num + 1;i++)
			{
				System.out.printf("%c",str.charAt(i));
			}
			System.out.printf("%s",substr);
			for (i = num + 1;i < len;i++)
			{
				System.out.printf("%c",str.charAt(i));
			}
			System.out.print("\n");
			for (i = 0;i < len;i++)
			{
				str = tangible.StringFunctions.changeCharacter(str, i, '0');
			}
			for (i = 0;i < 3;i++)
			{
				substr = tangible.StringFunctions.changeCharacter(substr, i, '0');
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				str = tempVar3.charAt(0);
			}
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				substr = tempVar4.charAt(0);
			}
		}
	}
}

