package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int a;
		int b;
		int num10 = 0;
		String pre = new String(new char[200]);
		a = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		pre = ConsoleInput.readToWhiteSpace(true).charAt(0);

		b = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));

		for (int i = 0;i <= pre.length();i++)
		{
			int temp = 1;
			for (int j = 1;j < pre.length() - i;j++)
			{

				temp *= a;
			}
			if (pre.charAt(i) >= '0' && pre.charAt(i) <= '9')
			{
				num10 += (int)(pre.charAt(i) - '0') * temp;
			}
			if (pre.charAt(i) >= 'a' && pre.charAt(i) <= 'z')
			{
				num10 += (int)(pre.charAt(i) - 'a' + 10) * temp;
			}
			if (pre.charAt(i) >= 'A' && pre.charAt(i) <= 'Z')
			{
				num10 += (int)(pre.charAt(i) - 'A' + 10) * temp;
			}
		}

		String aft = new String(new char[120]);
		int k = 0;
		do
		{
			if (num10 % b <= 9)
			{
				aft = tangible.StringFunctions.changeCharacter(aft, k, num10 % b + '0');
			}
			else
			{
				aft = tangible.StringFunctions.changeCharacter(aft, k, num10 % b + 'A' - 10);
			}
			num10 /= b;
			k++;
		} while (num10 != 0);
		while (k >= 1)
		{
			System.out.print((char)aft.charAt(k - 1));
			k--;
		}

		return 0;
	}

}

