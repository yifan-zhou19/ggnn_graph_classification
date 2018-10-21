package <missing>;

public class GlobalMembers
{
	/**
	* file homwork.cpp
	* author ???
	* data 2011-11-14
	* description ????
	*/ 

	public static int length;
	public static int i;
	public static String n = new String(new char[1000]); //??????
	public static int turn(int n1, String a)
	{
		int sum = 0;
		for (i = 0 ; i <= length - 1 ; i++)
		{
			if (a[i].compareTo('0') >= 0 && a[i].compareTo('9') <= 0)
			{
				sum = sum * n1 + (a[i] - '0');
			}

			else if (a[i].compareTo('A') >= 0 && a[i].compareTo('Z') <= 0)
			{
				sum = sum * n1 + (a[i] - 'A' + 10);
			}

			else if (a[i].compareTo('a') >= 0 && a[i].compareTo('z') <= 0)
			{
				sum = sum * n1 + (a[i] - 'a' + 10);
			}
		}
		return sum;
	}
	public static void f(int n2, int s, int j)
	{
		int k;
		if (s == 0)
		{
			if (j == 0)
			{
				System.out.print(0);
			}
			for (i = j - 1 ; i >= 0 ; i--)
			{
				System.out.printf("%c",n.charAt(i));
			}
		}
		else
		{
			k = s % n2;
			s = s / n2;

			if (k <= 9 && k >= 0)
			{
				n = tangible.StringFunctions.changeCharacter(n, j, k + '0');
			}
			else
			{
				n = tangible.StringFunctions.changeCharacter(n, j, (k - 10) + 'A');
			}

			f(n2, s, j + 1); //?????
		}

		return;
	}

	public static int Main()
	{
		int a;
		int b;
		int number;
		String str = new String(new char[1000]);
		while ((a = Integer.parseInt(ConsoleInput.readToWhiteSpace(true))).length() > 0)
		{
			str = ConsoleInput.readToWhiteSpace(true).charAt(0);
			b = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			length = str.length();
			number = turn(a, str);
			f(b, number, 0);
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
			memset(str, 0,(Character.SIZE / Byte.SIZE)); //???0?
		}

		return 0;
	}























}

