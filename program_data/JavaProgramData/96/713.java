package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String num = new String(new char[100]);
		num = ConsoleInput.readToWhiteSpace(true).charAt(0);
		// division???????????number[i]??num[i],denominator[i]??????
		int division = 0;
		int[] number = new int[100];
		int[] denominator = new int[100];
		int[] dinominator = new int[100];
		int rest = 0;
		int i;
		int j;
		int mark;
		for (i = 0; i < 100; i++)
		{
			if (num.charAt(i) != '\0') // ??????????????????????
			{
				number[i] = num.charAt(i) - '0';
			}
			else
			{
				break;
			}
		} // ??????i - 1?
		if (i == 1)
		{
			System.out.print("0");
			System.out.print("\n");
			System.out.print(number[0]);
		}
		else if ((i == 2) && (number[0] == 1) && (number[1] <= 2))
		{
			System.out.print("0");
			System.out.print("\n");
			System.out.print(number[0] * 10 + number[1]);
		}

		else
		{
		rest = number[0];
		for (j = 1; j <= i - 1; j++) // ???????1??????division???99??denominator????
		{
			division = number[j] + rest * 10;
			denominator[j] = division / 13;
			rest = division % 13;
		}
		for (j = 1; j <= i - 1; j++)
		{
			if (denominator[j] != 0) //???????????0??
			{
				mark = j;
				break;
			}
		}
		for (j = mark; j <= i - 1; j++)
		{
			System.out.print(denominator[j]);
		}
		System.out.print("\n");
		System.out.print(rest);
		}
		return 0;
	}
}

