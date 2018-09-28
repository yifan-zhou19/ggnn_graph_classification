package <missing>;

public class GlobalMembers
{
	//**************************
	//*???2013?12?11?    *
	//*??????            *
	//*???n-gram????    *
	//**************************

	public static int Main()
	{
		int n;
		int i;
		int j;
		int cnt = 1;
		int maxx = 0;
		String a = new String(new char[501]);
		final String b = "";
		final String d = "";
		char[][] c = new char[1][5];
		final String max = "";
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		a = ConsoleInput.readToWhiteSpace(true).charAt(0);
		int len = a.length();

		for (i = 0; i <= len - n; i++)
		{
			for (j = i; j <= n + i - 1; j++)
			{
				*(*(d.Substring(i)) + j - i) = *(a.Substring(j));
				*(*(b.Substring(i)) + j - i) = *(a.Substring(j));
			}
		}

		for (i = 0; i < len - n; i++)
		{
			for (j = 0; j < len - n; j++)
			{
				if (strcmp(b.charAt(j), b.charAt(j + 1)) > 0)
				{
					c[0] = b.charAt(j);
					b = tangible.StringFunctions.changeCharacter(b, j, b.charAt(j + 1));
					b = tangible.StringFunctions.changeCharacter(b, j + 1, c[0]);
				}
			}
		}

		for (i = 0; i <= len - n; i++)
		{
			if (strcmp(b.charAt(i), b.charAt(i + 1)) == 0)
			{
				cnt++;
			}
			else if (cnt >= maxx)
			{
				maxx = cnt;
				cnt = 1;
			}
			else
			{
				cnt = 1;
			}
		}
		if (maxx != 1)
		{
			System.out.print(maxx);
			System.out.print("\n");
		}
		else
		{
			System.out.print("NO");
			System.out.print("\n");
			return 0;
		}

		cnt = 1;
		for (i = 0; i <= len - n; i++)
		{
			if (strcmp(b.charAt(i), b.charAt(i + 1)) == 0)
			{
				cnt++;
			}
			else if (cnt == maxx)
			{
				cnt = 1;
				max = tangible.StringFunctions.changeCharacter(max, i, b.charAt(i));
			}
			else
			{
				cnt = 1;
			}
		}

		for (i = 0; i <= len - n; i++)
		{
			for (j = 0; j <= len - n; j++)
			{
				if (strcmp(d.charAt(i), max.charAt(j)) == 0)
				{
					max.charAt(j)[0] = '\0';
					System.out.print((d.Substring(i)));
					System.out.print("\n");
					continue;
				}
			}
		}
		return 0;
	}
}

