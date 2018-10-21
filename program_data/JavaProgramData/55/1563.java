package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int a;
		int b;
		String n = new String(new char[N]);
		int i;
		int j;
		int t;
		int l;
		int sum = 0;

		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			n = tempVar2.charAt(0);
		}
		String tempVar3 = ConsoleInput.scanfRead(" ");
		if (tempVar3 != null)
		{
			b = Integer.parseInt(tempVar3);
		}


		l = n.length();
		for (i = 0;i <= l / 2 - 1;i++)
		{
			t = n.charAt(i);
			n = tangible.StringFunctions.changeCharacter(n, i, n.charAt(l - i - 1));
			n = tangible.StringFunctions.changeCharacter(n, l - i - 1, t);
		}

		//puts(n);

		for (i = 0;i < l;i++)
		{
			if (n.charAt(i) >= '0' && n.charAt(i) <= '9')
			{
				t = n.charAt(i) - '0';
			}
			else if (n.charAt(i) >= 'A' && n.charAt(i) <= 'Z')
			{
				t = n.charAt(i) - 'A' + 10;
			}
			else if (n.charAt(i) >= 'a' && n.charAt(i) <= 'z')
			{
				t = n.charAt(i) - 'a' + 10;
			}

			for (j = 1;j <= i;j++)
			{
				t = t * a;
			}

			sum = sum + t;
		}
		for (i = 0;i < N;i++)
		{
			n = tangible.StringFunctions.changeCharacter(n, i, '\0');
		}

		for (i = 0;sum >= b;i++)
		{
			n = tangible.StringFunctions.changeCharacter(n, i, sum % b);
			sum = (sum - sum % b) / b;

			if (n.charAt(i) < 10)
			{
				n = tangible.StringFunctions.changeCharacter(n, i, n.charAt(i) + '0');
			}
			else if (n.charAt(i) >= 10)
			{
				n = tangible.StringFunctions.changeCharacter(n, i, n.charAt(i) - 10 + 'A');
			}
		}
		if (sum < 10)
		{
			n = tangible.StringFunctions.changeCharacter(n, i, sum + '0');
		}
		else if (sum >= 10)
		{
			n = tangible.StringFunctions.changeCharacter(n, i, sum - 10 + 'A');
		}

		l = n.length();

		for (i = l - 1;i >= 0;i--)
		{
			System.out.printf("%c",n.charAt(i));
		}

		return 0;
	}
}

