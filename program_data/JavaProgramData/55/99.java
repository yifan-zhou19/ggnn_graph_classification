package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int a;
		int b;
		char[] s = {0, '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0'};

		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = Integer.parseInt(tempVar);
		}
		int i;
		int n = 1;
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
		n = s.length();
		for (i = 0;i < n;i++)
		{
			if (s[i] >= 'a' && s[i] <= 'z')
			{
				s[i] = s[i] - 32;
			}
			if (s[i] >= 'A' && s[i] <= 'Z')
			{
				s[i] = s[i] - 55;
			}
			if (s[i] >= '0' && s[i] <= '9')
			{
				s[i] = s[i] - 48;
			}
		}

		int t = 0;
		for (i = 0;i < n;i++)
		{
			t += (int)(s[i] * Math.pow(a,n - i - 1));
		}

		String s2 = new String(new char[100]);
		int count = 0;
		if (t == 0)
		{
			System.out.print("0");
		}
		else
		{
			for (i = 0;t != 0;i++)
			{
				s2 = tangible.StringFunctions.changeCharacter(s2, i, t % b + 48);
				if (t % b >= 10)
				{
					s2 = tangible.StringFunctions.changeCharacter(s2, i, t % b + 55);
				}
				count++;
				t = t / b;
			}
			for (i = count - 1;i >= 0;i--)
			{
				System.out.printf("%c",s2.charAt(i));
			}
		}
		return 0;
	}

}

