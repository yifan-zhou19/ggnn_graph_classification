package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String str = new String(new char[10001]);
		String[] array = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"};
		int a;
		int b;
		int n;
		int[] m = new int[10001];
		int lstr;
		int i;
		int lb;
		int a1;
		a = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		System.in.read();
		str = ConsoleInput.readToWhiteSpace(true).charAt(0);
		b = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		lstr = str.length();
		n = 0;
		lb = 0;
		for (i = 0;i < lstr;i++)
		{
			if (str.charAt(i) >= 65 && str.charAt(i) <= 90)
			{
				m[i] = str.charAt(i) - 'A' + 10;
			}
			else if (str.charAt(i) >= 97 && str.charAt(i) <= 122)
			{
				m[i] = str.charAt(i) - 'a' + 10;
			}
			else
			{
				m[i] = str.charAt(i) - '0';
			}
		}
		a1 = a;
		n += m[lstr - 1];
		for (i = lstr - 2;i >= 0;i--)
		{
			n = n + m[i] * a;
			a = a * a1;
		}
		for (i = 1;i < 10000;i++)
		{
			if (n < b)
			{
				System.out.print(array[n]);
				break;
			}
			else
			{
				m[i] = n % b;
				n -= m[i];
				n = n / b;
				lb++;
			}
		}
		for (i = lb;i >= 1;i--)
		{
			System.out.print(array[m[i]]);
		}
	return 0;
	}
}

