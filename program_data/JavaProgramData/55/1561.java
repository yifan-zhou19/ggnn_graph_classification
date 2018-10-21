package <missing>;

public class GlobalMembers
{
	public static int f(int a, String str, int l)
	{
		int sum = 0;
		int i;
		int t;
		int num = 1;
		for (i = l - 1;i >= 0;i--)
		{
			if (str[i].compareTo(64) > 0 && str[i].compareTo(91) < 0)
			{
				t = str[i] - 'A' + 10;
			}
			else
			{
				t = str[i] - '0';
			}
			sum = sum + t * num;
			num = num * a;
		}
		return sum;
	}
	public static int F(int n, int b)
	{
		int i = 0;
		int[] str = new int[200];
		char a;
		if (n == 0)
		{
			System.out.print("0");
			System.out.print("\n");
		}
		while (n > 0)
		{
			str[i] = n % b;
			n = n / b;
			i++;
		}
		for (i = i - 1;i >= 0;i--)
		{
			if (str[i] >= 0 && str[i] <= 9)
			{
				System.out.print(str[i]);
			}
			else
			{
				a = 'A' + str[i] - 10;
				System.out.print(a);
			}
		}
		System.out.print("\n");
		return 0;
	}
	public static int Main()
	{
		int a;
		int b;
		int n;
		int i;
		int l;
		String str = new String(new char[20]);
		a = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		str = ConsoleInput.readToWhiteSpace(true).charAt(0);
		b = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		l = str.length();
		for (i = 0;i < l;i++)
		{
			if (str.charAt(i) > 96 && str.charAt(i) < 123)
			{
				str = tangible.StringFunctions.changeCharacter(str, i, str.charAt(i) - 32);
			}
		}
		n = f(a, str, l);
		F(n, b);
		return 0;
	}







}

