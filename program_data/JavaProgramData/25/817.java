package <missing>;

public class GlobalMembers
{
	public static void compute(int x, int time)
	{
		int i;
		int number;
		if (time == 1)
		{
			return;
		}
		else if (x == time) // ?x???????x + 1
		{
			return;
		}
		x++; // ?x??????????2^2
		for (i = 0; i < len; i++)
		{
			if (num.charAt(i) != '0')
			{
				number = num.charAt(i) - '0'; // ?num[i]??i??????
				number = number * 2;
				if (number >= 10)
				{
					num = tangible.StringFunctions.changeCharacter(num, i, number - 10 + '0');
					ad[i + 1] = ad[i + 1] + 1;
				}
				else
				{
					num = tangible.StringFunctions.changeCharacter(num, i, number + '0');
				}
			}
		}

		for (int s = 0; s < 100; s++)
		{
			num = tangible.StringFunctions.changeCharacter(num, s, num.charAt(s) + ad[s]);
		}

		while (num.charAt(len) != '0')
		{
			len++;
		}
		for (int r = 0; r < 100; r++)
		{
			ad[r] = 0;
		}
		compute(x, N);
	}
	public static String num = new String(new char[100]);
	public static int[] ad = new int[100];
	public static int N;
	public static int len = 1;
	public static int Main()
	{
		int j;
		int k;
		N = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (k = 0; k < 100; k++)
		{
			num = tangible.StringFunctions.changeCharacter(num, k, '0');
			ad[k] = 0;
		}
		if (N == 0)
		{
			System.out.print('1');
			return 0;
		}
		num = tangible.StringFunctions.changeCharacter(num, 0, '2');
		compute(1, N);
		for (j = len - 1; j >= 0; j--) // ????
		{
			System.out.print(num.charAt(j));
		}
		return 0;
	}

}

