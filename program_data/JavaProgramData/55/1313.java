package <missing>;

public class GlobalMembers
{
	public static int convert1(char a)
	{
		if ((a >= '0') && (a <= '9'))
		{
			return a - '0';
		}
		if ((a >= 'a') && (a <= 'z'))
		{
			return (a - 'a' + 10);
		}
		if ((a >= 'A') && (a <= 'Z'))
		{
			return (a - 'A' + 10);
		}
	}
	public static char convert2(int a)
	{
		if ((a >= 0) && (a <= 9))
		{
			return (a + 48);
		}
		else
		{
			return (a + 55);
		}
	}
	public static int Main()
	{
		int a;
		int b;
		int len;
		int k = 1;
		int i;
		int j;
		int t = 0;
		String num = new String(new char[100]);
		char p;
		int[] num1 = new int[100];
		a = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		num = ConsoleInput.readToWhiteSpace(true).charAt(0);
		b = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		len = num.length();
		for (i = len - 1 ; i >= 0 ; i--)
		{
			t = t + k * convert1(num.charAt(i));
			k = k * a;
		}
		i = 1;
		while (t >= b)
		{
			num1[i] = t % b;
			i++;
			t = t / b;
		}
		num1[i] = t;
		for (j = i ; j >= 1; j--)
		{
			p = convert2(num1[j]);
			System.out.print(p);
		}
		return 0;
	}



}

