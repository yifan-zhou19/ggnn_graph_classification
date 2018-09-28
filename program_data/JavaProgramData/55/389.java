package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int a;
		int b;
		int len;
		int i;
		int j;
		int mi;
		int middle = 0;
		String str = new String(new char[33]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			str = tempVar2.charAt(0);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			b = Integer.parseInt(tempVar3);
		}
		len = str.length();
		for (i = 0;i < len;++i)
		{

			if (str.charAt(i) >= 97 && str.charAt(i) <= 122)
			{
				str.charAt(i) -= 32;
			}
		}
		for (i = 0;i < len;++i)
		{
			if (str.charAt(i) >= 65 && str.charAt(i) <= 90)
			{
				str.charAt(i) -= 55;
			}
			else
			{
				str.charAt(i) -= 48;
			}
			mi = 1;
			for (j = 1;j < len - i;++j)
			{
				mi *= a;
			}
			middle = middle + str.charAt(i) * mi;
		}
		i = 0;
		while (middle >= b)
		{
			str = tangible.StringFunctions.changeCharacter(str, i, middle % b);
			middle = (middle - str.charAt(i)) / b;
			i++;
		}
		str = tangible.StringFunctions.changeCharacter(str, i, middle);
		for (j = 0;j <= i;++j)
		{
			if (str.charAt(i - j) > 9)
			{
				str = tangible.StringFunctions.changeCharacter(str, i - j, str.charAt(i - j) - 9 + 64);
				System.out.printf("%c",str.charAt(i - j));
			}
			else
			{
				System.out.printf("%d",str.charAt(i - j));
			}
		}
	}
}

