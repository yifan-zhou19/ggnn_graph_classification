package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int number = 0;
		int[] inum = new int[1000];
		int b;
		int e;
		int p = 0;
		String cnum = new String(new char[1000]);
		b = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		cnum = ConsoleInput.readToWhiteSpace(true).charAt(0);
		e = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int len = cnum.length();
		int i;
		for (i = len - 1; i >= 0; i--)
		{
			if (cnum.charAt (i) >= '0' && cnum.charAt(i) <= '9')
			{
				inum[p++] = cnum.charAt(i) - '0';
			}
			else if (cnum.charAt(i) >= 'a' && cnum.charAt(i) <= 'z')
			{
				inum[p++] = cnum.charAt(i) - 'a' + 10;
			}
			else
			{
				inum[p++] = cnum.charAt(i) - 'A' + 10;
			}
		}
		for (i = p - 1; i > 0; i--)
		{
			number = (number + inum[i]) * b;
		}
		int temp;
		number += inum[0];
		if (number == 0)
		{
			System.out.print("0");
			System.out.print("\n");
		}
		for (i = 0; number > 0; i++)
		{
			temp = number % e;
			number = number / e;
			if (temp <= 9 && temp >= 0)
			{
				cnum = tangible.StringFunctions.changeCharacter(cnum, i, temp + '0');
			}
			else
			{
				cnum = tangible.StringFunctions.changeCharacter(cnum, i, temp + 'a' - 42);
			}
		}
		for (p = i - 1; p >= 0; p--)
		{
			System.out.print(cnum.charAt(p));
		}
		System.out.print("\n");
		return 0;
	}

}

