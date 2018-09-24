package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String s = new String(new char[20]);
		String r = new String(new char[40]);
		int i;
		int j;
		int a;
		int b;
		int l;
		int n = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			s = tempVar2.charAt(0);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			b = Integer.parseInt(tempVar3);
		}
		l = s.length();
		for (i = 0;i < l;i++)
		{
			if (s.charAt(i) >= 'a' && s.charAt(i) <= 'z')
			{
				n = a * n + s.charAt(i) - 'a' + 10;
			}
			else if (s.charAt(i) >= 'A' && s.charAt(i) <= 'Z')
			{
				n = a * n + s.charAt(i) - 'A' + 10;
			}
			else
			{
				n = a * n + s.charAt(i) - '0';
			}
		}
		//printf("%ld\n",n);
		i = 0;
		if (n == 0)
		{
			System.out.print("0\n");
			return 0;
		}
		while (n > 0)
		{
			if (n % b <= 9)
			{
				r = tangible.StringFunctions.changeCharacter(r, i++, n % b + '0');
			}
			else
			{
				r = tangible.StringFunctions.changeCharacter(r, i++, n % b - 10 + 'A');
			}
			n = n / b;
		}
		for (j = i - 1;j >= 0;j--)
		{
			System.out.printf("%c",r.charAt(j));
		}
		System.out.print("\n");
		return 0;
	}








}

