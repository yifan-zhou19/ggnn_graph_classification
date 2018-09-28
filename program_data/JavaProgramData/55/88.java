package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[200]);
		String t = new String(new char[200]);
		int k;
		int b;
		int n = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			k = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			a = tempVar2.charAt(0);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			b = Integer.parseInt(tempVar3);
		}

		int i;
		int j;
		for (i = 0; i < (int)a.length(); i++)
		{
			if (a.charAt(i) >= '0' && a.charAt(i) <= '9')
			{
				n = n * k + (a.charAt(i) - '0');
			}
			if (a.charAt(i) >= 'a' && a.charAt(i) <= 'z')
			{
				n = n * k + (a.charAt(i) - 'a' + 10);
			}
			if (a.charAt(i) >= 'A' && a.charAt(i) <= 'Z')
			{
				n = n * k + (a.charAt(i) - 'A' + 10);
			}
		}

		i = 0;
		do
		{
			t = tangible.StringFunctions.changeCharacter(t, i, n % b + '0');
			if (t.charAt(i) > '9')
			{
				t = tangible.StringFunctions.changeCharacter(t, i, t.charAt(i) - '0' + 'A' - 10);
			}
			n = n / b;
			i++;
		} while (n > 0);

		for (j = i - 1; j >= 0; j--)
		{
			System.out.printf("%c", t.charAt(j));
		}

		System.out.print("\n");
		return 0;
	}

}

