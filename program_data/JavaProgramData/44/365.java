package <missing>;

public class GlobalMembers
{
	public static int reverse(int n)
	{
		if (n == 0)
		{
			return 0;
		}
		final String a = "";
		int i;
		int p = 1;
		int l;
		int j;
		if (n < 0)
		{
			p = -1;
			n = n * p;
		}
		for (i = 0;n > 0;i++)
		{
			a = tangible.StringFunctions.changeCharacter(a, i, n % 10 + '0');
			n = n / 10;
		}
		l = a.length();
		while (a.charAt(0) == '0')
		{
			for (i = 0;i < l;i++)
			{
				a = tangible.StringFunctions.changeCharacter(a, i, a.charAt(i + 1));
			l = a.length();
			}
		}
		l = a.length();
		for (i = 0;i < l;i++)
		{
			j = Math.pow(10,i);

			n += (a.charAt(l - 1 - i) - '0') * j;
		}
		n = n * p;
		return n;
	}
	public static int Main()
	{
		int i;
		int answer;
		int n;
		for (i = 0;i < 6;i++)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				n = Integer.parseInt(tempVar);
			}
			answer = reverse(n);
			System.out.printf("%d\n",answer);
		}
		return 0;
	}


}

