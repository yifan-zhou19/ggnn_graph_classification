package <missing>;

public class GlobalMembers
{
	public static String c = new String(new char[200]); //??????
	public static int[] n = new int[200]; //??????
	public static int Main()
	{
		int number;
		int len;
		int i;
		while ((c = ConsoleInput.readToWhiteSpace(true).charAt(0)).length() > 0)
		{
			len = c.length();
			for (i = 1;i <= len;i++)
			{
				n[i] = c.charAt(i - 1) - '0';
			}
			if (len == 1)
			{
				System.out.print("0");
				System.out.print("\n");
				System.out.print(n[1]);
				System.out.print("\n");
				continue;
			}
			if (len == 2)
			{
				number = 10 * n[1] + n[2];
				System.out.print(number / 13);
				System.out.print("\n");
				System.out.print(number % 13);
				System.out.print("\n");
				continue;
			}
			number = n[1] * 10 + n[2];
			i = 2;
			if (number < 13)
			{
				number = 10 * number + n[++i]; //???????????13
			}
			System.out.print(number / 13);
			while (i < len)
			{
				number = (number % 13) * 10 + n[++i];
				System.out.print(number / 13);
			}
			System.out.print("\n");
			System.out.print(number % 13);
			System.out.print("\n");
		}
		return 0;
	}
}

