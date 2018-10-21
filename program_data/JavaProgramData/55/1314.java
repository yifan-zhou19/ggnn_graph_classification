package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String str = new String(new char[100000]);
		int k;
		int t;
		int n;
		int m;
		int a;
		int i;
		int j;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			k = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			str = tempVar2.charAt(0);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			t = Integer.parseInt(tempVar3);
		}
		n = str.length();
		for (i = 0;i < n;i++)
		{
			if (str.charAt(i) > 96)
			{
			str = tangible.StringFunctions.changeCharacter(str, i, str.charAt(i) - 32);
			}
		}
		m = 0;
		for (i = 0;i < n;i++)
		{
			a = 1;
			for (j = 1;j < n - i;j++)
			{
				a = a * k;
			}
			if (str.charAt(i) >= 65)
			{
			m = m + (str.charAt(i) - 55) * a;
			}
			else
			{
			m = m + (str.charAt(i) - 48) * a;
			}
		}
		if (m == 0)
		{
		System.out.print("0");
		}
		else
		{
			i = 0;
		while (m > 0)
		{
			j = m % t;
			if (j < 10)
			{
			str = tangible.StringFunctions.changeCharacter(str, i, j + 48);
			}
			else
			{
				str = tangible.StringFunctions.changeCharacter(str, i, j + 55);
			}
			i = i + 1;
			m = (m - j) / t;
		}
		for (j = i - 1;j >= 0;j--)
		{
		System.out.printf("%c",str.charAt(j));
		}
		}
		return 0;
	}

}

