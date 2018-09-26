package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int convert_to10 = new int(char str[], int a);
		void convert_from10(int a, int b);
		int a;
		int b;
		String str = new String(new char[100]);
		a = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		str = ConsoleInput.readToWhiteSpace(true).charAt(0);
		b = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));

		convert_from10(convert_to10(str, a), b);
		return 0;

	}

	public static int convert_to10(String str, int a)
	{
		int len;
		int i;
		int num10 = 0;
		len = str.length();
		for (i = 0; i < len; i++)
		{
			if (str[i].compareTo('A') >= 0 && str[i].compareTo('Z') <= 0)
			{
				num10 = num10 * a + str[i] - 'A' + 10;
			}
			if (str[i].compareTo('a') >= 0 && str[i].compareTo('z') <= 0)
			{
				num10 = num10 * a + str[i] - 'a' + 10;
			}
			if (str[i].compareTo('0') >= 0 && str[i].compareTo('9') <= 0)
			{
				num10 = num10 * a + str[i] - '0';
			}
		}
		return num10;
	}


	public static void convert_from10(int a, int b)
	{
		String str = new String(new char[10000]);
		int i;
		int j;
		int k;
		int len;
		for (i = 0;;i++)
		{
			k = a % b;
			if (k < 10)
			{
				str = tangible.StringFunctions.changeCharacter(str, i, k + '0');
			}
			else
			{
				str = tangible.StringFunctions.changeCharacter(str, i, k - 10 + 'A');
			}
			a = (a - k) / b;
			len = i;

			if (a == 0)
			{
				for (j = len; j >= 0; j--)
				{
					System.out.print(str.charAt(j));
				}
				break;
			}

		}
	}





}

