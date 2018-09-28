package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int a;
		int b;
		int l1;
		int i;
		int j = 0;
		int t;
		int m = 0;
		int n;
		String str1 = new String(new char[100]);
		String str2 = new String(new char[100]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			str1 = tempVar2.charAt(0);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			b = Integer.parseInt(tempVar3);
		}
		l1 = str1.length();
		if (str1.charAt(0) == '0')
		{
			System.out.print("0");
		}
		for (i = 0;i < l1;i++)
		{
			if (str1.charAt(i) <= 'z' && str1.charAt(i) >= 'a')
			{
		t = str1.charAt(i) - 'a' + 10;
			}
		else if (str1.charAt(i) <= 'Z' && str1.charAt(i) >= 'A')
		{
			t = str1.charAt(i) - 'A' + 10;
		}
		else
		{
			t = str1.charAt(i) - '0';
		}
		m = m * a + t;
		}
		while (m != 0)
		{
			n = m % b;
			m = m / b;
			if (n >= 10)
			{
				str2 = tangible.StringFunctions.changeCharacter(str2, j, n - 10 + 'A');
			}
				else
				{
					str2 = tangible.StringFunctions.changeCharacter(str2, j, n + '0');
				}
			j++;
		}
		for (i = 0;i < j;i++)
		{
			str1 = tangible.StringFunctions.changeCharacter(str1, i, str2.charAt(j - i - 1));
		}
		str1 = tangible.StringFunctions.changeCharacter(str1, j, '\0');
		System.out.printf("%s",str1);

	}


}

