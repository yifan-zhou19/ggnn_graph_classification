package <missing>;

public class GlobalMembers
{
	public static String n = new String(new char[10000000]);
	public static String result = new String(new char[10000000]);
	public static int exchange = 0;

	public static void change(int a, String t, int b)
	{
		int len;
		int i;
		int j;
		int k;
		int temp;
		int temp2;
		int pow = 1;
		len = t.length();
		i = len - 1;
		j = 0;
		while (i >= 0)
		{
			if (t[i].compareTo('A') >= 0 && t[i].compareTo('Z') <= 0)
			{
				temp = 10 + t[i] - 'A';
			}
			else
			{
				if (t[i].compareTo('a') >= 0 && t[i].compareTo('z') <= 0)
				{
				temp = 10 + t[i] - 'a';
				}
				else
				{
					temp = t[i] - '0';
				}
			}
			exchange = exchange + temp * pow;
			pow = a * pow;
			i--;
			j++;
		}
		if (exchange == 0)
		{
			System.out.print(0);
		}
		else
		{
			j = 9999999;
			while (exchange != 0)
			{
				temp2 = exchange % b;
				if (temp2 >= 0 && temp2 <= 9)
				{
					result = tangible.StringFunctions.changeCharacter(result, j, temp2 + 48);
				}
				else
				{
					result = tangible.StringFunctions.changeCharacter(result, j, temp2 + 55);
				}
				exchange = exchange / b;
				j--;
			}
			for (k = j + 1; k < 10000000; k++)
			{
				System.out.print(result.charAt(k));
			}
		}
	}

	public static int Main()
	{
		int a;
		int b;
		a = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		n = ConsoleInput.readToWhiteSpace(true).charAt(0);
		b = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		change(a, n, b);
		return 0;
	}
}

