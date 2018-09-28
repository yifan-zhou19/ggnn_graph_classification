package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int n;
		int temp = 39;
		int isum;
		int ins;
		int step = 0;
		String sum = new String(new char[40]);
		for (i = 0;i < 40;i++)
		{
			sum = tangible.StringFunctions.changeCharacter(sum, i, '0');
		}
		sum = tangible.StringFunctions.changeCharacter(sum, 39, '1');
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		if (n == 0)
		{
			System.out.print('1');
			System.out.print("\n");
			return 0;
		}
		else
		{
		while (n > 0)
		{
			for (i = 0;i < 40;i++)
			{
				if (sum.charAt(i) != '0')
				{
					temp = i;
					break;
				}
			}
			for (i = 39;i >= temp - 1;i--)
			{
				isum = (int)sum.charAt(i) - 48;
				ins = isum * 2 + step;
				if (ins < 10)
				{
					sum = tangible.StringFunctions.changeCharacter(sum, i, (char)(ins + 48));
					step = 0;
				}
				else
				{
					sum = tangible.StringFunctions.changeCharacter(sum, i, (char)(ins + 38));
					step = 1;
				}
			}
			n--;
		}
		}
		for (i = 0;i < 39;i++)
		{
			if (sum.charAt(i) != '0')
			{
				temp = i;
				break;
			}
		}
		for (i = temp;i <= 39;i++)
		{
			System.out.print(sum.charAt(i));
		}
		System.out.print("\n");
		return 0;
	}

}

