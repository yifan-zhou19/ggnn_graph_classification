package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int a;
		int b;
		int num = 0;
		int[] e = new int[100];
		int[] f = new int[100];
		int i;
		int j;
		int l;
		String c = new String(new char[100]);
		String d = new String(new char[100]);
		a = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		System.in.read();
		c = ConsoleInput.readToWhiteSpace(true).charAt(0);
		l = c.length();
		b = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0; i < l; i++)
		{
			if (c.charAt(i) >= '0' && c.charAt(i) <= '9')
			{
				e[i] = c.charAt(i) - '0';
			}
			else if (c.charAt(i) >= 'a' && c.charAt(i) <= 'z')
			{
				e[i] = c.charAt(i) - 'a' + 10;
			}
			else
			{
				e[i] = c.charAt(i) - 'A' + 10;
			}
			num = num * a + e[i];
		}
		if (num == 0)
		{
			System.out.print("0");
			System.out.print("\n");
		}
		else
		{
			i = 0;
		while (num != 0)
		{
			f[i++] = num % b;
			num /= b;
		}
		for (j = i - 1;j >= 0; j--)
		{
			if (f[j] >= 0 && f[j] <= 9)
			{
				d = tangible.StringFunctions.changeCharacter(d, j, f[j] + '0');
			}
			else
			{
				d = tangible.StringFunctions.changeCharacter(d, j, f[j] - 10 + 'A');
			}
			System.out.print(d.charAt(j));
		}
		System.out.print("\n");
		}




		//cout << num << endl;
		return 0;
	}




}

