package <missing>;

public class GlobalMembers
{
	public static void run(int base1, String a, int base2)
	{
		char[] d = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};
		int len = a.length();
		int[] b = new int[50];
		int[] c = new int[50];
		int s = 0;
		int i = 0;
		for (i = 0; i < len; i++)
		{
			if (a[i].compareTo('A') >= 0 && a[i].compareTo('Z') <= 0)
			{
				b[i] = a[i] - 55;
			}
			else
			{
				if (a[i].compareTo('a') >= 0 && a[i].compareTo('z') <= 0)
				{
					b[i] = a[i] - 87;
				}
				else
				{
					b[i] = a[i] - '0';
				}
			}
			s += b[i] * Math.pow(base1 + 0.0,len - i - 1);
		}
		i = 0;
		while (s > 0)
		{
			c[i++] = s % base2;
			s = s / base2;
		}
		if (i == 0)
		{
			System.out.print("0");
		}
		else
		{
			i--;
			for (; i >= 0; i--)
			{
				System.out.print(d[c[i]]);
			}
		}
	}
	public static int Main()
	{
		int base1;
		int base2;
		int i;
		String a = new String(new char[50]);
		for (i = 0; i < 50; i++)
		{
			a = tangible.StringFunctions.changeCharacter(a, i, '\0');
		}
		base1 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		a = ConsoleInput.readToWhiteSpace(true).charAt(0);
		base2 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		run(base1, a, base2);
		return 0;
	}
}

