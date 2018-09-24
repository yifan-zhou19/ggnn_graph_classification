package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[250]);
		String b = new String(new char[250]);
		String sum = new String(new char[250]);
		int k;
		int l;
		int m;
		int i;
		int flag = 0;
		for (i = 0;i < 250;i++)
		{
			a = tangible.StringFunctions.changeCharacter(a, i, b[i] = sum[i] = '0');
		}
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = tempVar.charAt(0);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			b = tempVar2.charAt(0);
		}
		k = a.length();
		l = b.length();
		m = l > k != 0? l:k;
		for (i = 1;i <= m;i++)
		{
			sum = tangible.StringFunctions.changeCharacter(sum, m - i, a.charAt(k - i) - '1' + 1 + b.charAt(l - i) - '1' + 1 + flag);
			flag = 0;
			if (sum.charAt(m - i) > 9)
			{
				sum.charAt(m - i) -= 10;
				flag = 1;
			}
			sum.charAt(m - i) += '1' - 1;
		}
		if (flag == 1)
		{
			System.out.print("1");
		}
		sum = tangible.StringFunctions.changeCharacter(sum, m, '\0');
		if (flag != 1)
		{
		for (;sum.charAt(0) == '0';)
		{
			for (i = 0;i < m;i++)
			{
				sum = tangible.StringFunctions.changeCharacter(sum, i, sum.charAt(i + 1));
			}
		}
		if (sum.charAt(0) == '\0')
		{
			sum = tangible.StringFunctions.changeCharacter(sum, 0, '0');
		}
		}
		System.out.printf("%s",sum);
			return 0;
	}

}

