package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String x = new String(new char[251]);
		String y = new String(new char[251]);
		int i;
		int j;
		int[] array = new int[251];
		for (i = 0; i < 251; i++)
		{
			array[i] = 0;
		}
		x = ConsoleInput.readToWhiteSpace(true).charAt(0);
		y = ConsoleInput.readToWhiteSpace(true).charAt(0);
		if (x.charAt(0) == '0' && y.charAt(0) == '0' && x.length() == 1 && y.length() == 1)
		{
			System.out.print(0);
		}
		for (i = 0; i < x.length() && i < y.length(); i++)
		{
			array[i] = array[i] + x.charAt(x.length() - i - 1) + y.charAt(y.length() - i - 1) - 2 * '0';
			if (array[i] > 9)
			{
				array[i + 1]++;
				array[i] = array[i] - 10;
			}
		}
		if (x.length() >= y.length())
		{
			for (j = i; j < x.length(); j++)
			{
				array[j] = array[j] + x.charAt(x.length() - j - 1) - '0';
				if (array[j] > 9)
				{
					array[j + 1]++;
					array[j] = array[j] - 10;
				}
			}
		}
		else
		{
			for (j = i; j < y.length(); j++)
			{
				array[j] = array[j] + y.charAt(y.length() - j - 1) - '0';
				if (array[j] > 9)
				{
					array[j + 1]++;
					array[j] = array[j] - 10;
				}
			}
		}
		for (i = 250; array[i] == 0; i--)
		{
		}
		for (j = i; j >= 0; j--)
		{
			System.out.print(array[j]);
		}
		System.out.print("\n");
		return 0;
	}

}

