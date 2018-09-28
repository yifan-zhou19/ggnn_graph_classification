package <missing>;

public class GlobalMembers
{
	//a ???97,z:122;A65;Z90;???95;0,48;9,57

	public static int Main()
	{
		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int[] b = new int[100];
		int j = 0;
		int k = 0;
		System.in.read();
		for (j = 1;j <= n;j++)
		{


		char c;
		int i = 0;
		String a = new String(new char[100]);
		while (cin.get(c))
		{
			if (c == '\n')
			{
				break;
			}
			a = tangible.StringFunctions.changeCharacter(a, i, c);
			i = i + 1;

		}
		int asc;
		asc = a.charAt(0);
		if (asc == 95 || (asc >= 97 && asc <= 122) || (asc >= 65 && asc <= 90))
		{
			int count = 0;
			for (k = 1;k <= i - 1;k++)
			{
				int lin;
				lin = a.charAt(k);
				if ((a.charAt(k) < 48) || (a.charAt(k)>57 && a.charAt(k) < 65) || (a.charAt(k)>90 && a.charAt(k) < 95) || (a.charAt(k)>122) || (a.charAt(k) > 95 && a.charAt(k) < 97))
				{
					count = 1;
				}
			}
			if (count == 0)
			{
				b[j] = 1;
			}
			else
			{
				b[j] = 0;
			}

		}
		else
		{
			b[j] = 0;
		}

		}
		for (j = 1;j <= n;j++)
		{
			System.out.print(b[j]);
			System.out.print("\n");
		}


		return 0;

	}



}

