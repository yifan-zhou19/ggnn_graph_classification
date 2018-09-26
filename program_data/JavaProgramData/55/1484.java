package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int a;
		int b;
		int i;
		int e = 0;
		int[] num = new int[100];
		int n = 0;
		String sz = new String(new char[100]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			sz = tempVar2.charAt(0);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			b = Integer.parseInt(tempVar3);
		}
		for (i = 0;i < sz.length();i++)
		{
			if (sz.charAt(i) >= '0' && sz.charAt(i) <= '9')
			{
				num[i] = sz.charAt(i) - '0';
			}
			if (sz.charAt(i) >= 'a' && sz.charAt(i) <= 'z')
			{
				num[i] = sz.charAt(i) - 'a' + 10;
			}
			if (sz.charAt(i) >= 'A' && sz.charAt(i) <= 'Z')
			{
				num[i] = sz.charAt(i) - 'A' + 10;
			}
		}
		for (i = 0;i < sz.length();i++)
		{
			n += num[i] * Math.pow(a,sz.length() - 1 - i);
		}
		while (n >= b)
		{
			num[e] = n % b;
			n = n / b;
			e++;
		}
		num[e] = n % b;
		for (i = 0;i < e+1;i++)
		{
			if (num[i] >= 0 && num[i] <= 9)
			{
				sz = tangible.StringFunctions.changeCharacter(sz, i, num[i] + '0');
			}
			if (num[i] > 9)
			{
				sz = tangible.StringFunctions.changeCharacter(sz, i, num[i] + 'A' - 10);
			}
		}
		for (i = e;i >= 0;i--)
		{
			System.out.printf("%c",sz.charAt(i));
		}
		return 0;
	}

}

